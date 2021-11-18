import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Board{
static Organism[][] field = new Organism[20][20];
static int numberOfAnts;
static int numberOfDoodlebugs;
Random randomNumGen = new Random();
//Used for scanning efficiently through the field
static int rowScan = 0;
static int colScan = 0;

public Board(){

numberOfAnts = 100;
numberOfDoodlebugs = 5;
initializeBoard(numberOfAnts, numberOfDoodlebugs);}

/**Complete Constructor
*
* Sets numberOfAnts and numberOfDoodlebugs to the
* given numbers and initializes the board with the given numbers.
*
* @param ants Number of ants to initialize the board with
* @param doodlebugs Number of doodlebugs to initialize the baord with
*/
public Board(int ants, int doodlebugs){

numberOfAnts = ants;
numberOfDoodlebugs = doodlebugs;
initializeBoard(numberOfAnts, numberOfDoodlebugs);}

/**
* Fills the field randomly with Ants first, then Doodlebugs.
*
* @param numAnt The number of ants to fill the board with.
* @param numDoodlebugs The number of doodlebugs to fill the board with.
*/
public void initializeBoard(int numAnt, int numDoodlebugs){

//Place Ants in field
for (int i = 0; i < numant;="">

placeBug(new Ant(), numAnt);

//Place Doodlebugs in field
for (int i = 0; i < numdoodlebugs;="">

placeBug(new Doodlebug(), numDoodlebugs);}


/**
* Check if cell is occupied by any type of Organism, return true if occupied, otherwise false
*
* @param row Row position to check. Must be 0-19.
* @param col Column position to check. Must be 0-19.
* @return True if any type of Organism is occupying the cell. Otherwise false.
*/
public boolean isOccupied(int row, int col){

//Check for null value in given field index
if (Board.field[row][col] != null)

return true;

else

return false;}


/**
* Place an Organism in an empty cell. Only used for initializing
* a new board!
*
* @param bug The particular type of Organism to be placed. Must be an Ant or Doodlebug.
* @param numBug The number of bugs to be placed.
*/
public void placeBug(Organism bug, int numBug){

//Declare and initialize random row and column values
int row = randomNumGen.nextInt(20);
int col = randomNumGen.nextInt(20);
//Cycle through field until an empty cell is found
while (this.isOccupied(row, col))

row = randomNumGen.nextInt(20);
col = randomNumGen.nextInt(20);

//Place a new Ant in open cell
if(bug instanceof Ant){

field[row][col] = new Ant(row, col);

//Place a new Doodlebug in open cell
}else if(bug instanceof Doodlebug){

field[row][col]= new Doodlebug(row, col);

//Error catching
}else{

System.out.println(Error in placeBug method! Did not place a bug in an open cell.);
System.exit(0);}


/**
* Return Organism at given row and column
* @param row Int value of row position.
* @param col Int value of column position
* @return Organism at given location, either Ant or Doodlebug, but must be type casted.
*/
public static Organism getBug(int row, int col){

return field[row][col];}

/**
* Return Organism at position given by array
* @param position Array with row position in index 0 and column position in index 1.
* @return Organism at given location, either Ant or Doodlebug, but must be type casted.
*/
public static Organism getBug(int[] position){

return field[position[0]][position[1]];}

/**
* Return true if there is an Ant in an adjacent cell to Doodlebug
*
* @param db Doodlebug that you would like to look for ants near.
* @return True if there is an Ant adjacent, False if not.
*/
public boolean antAdjacent(Doodlebug db){

//Top left corner check
if (db.topFlag && db.leftFlag){

    if ((getBug(db.getRowPosition(), db.getColPosition() + 1) instanceof Ant) ||
(getBug(db.getRowPosition() + 1, db.getColPosition()) instanceof Ant) )

return true;

}else{

return false;}


//Bottom right corner check
}else if (db.bottomFlag && db.rightFlag){

if ( (getBug(db.getRowPosition() - 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() - 1) instanceof Ant) ){

return true;

}else{

return false;}


//Top right corner check
else if (db.topFlag && db.rightFlag){

if ( (getBug(db.getRowPosition() + 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() - 1) instanceof Ant) ){

return true;

}else

return false;}


//Bottom left corner check
else if (db.bottomFlag && db.leftFlag){

if ( (getBug(db.getRowPosition() - 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() + 1) instanceof Ant) ){

return true;
}
}else

return false;}


//Top row check
else if (db.topFlag){

if ( (getBug(db.getRowPosition(), db.getColPosition() + 1) instanceof Ant) ||
(getBug(db.getRowPosition() + 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() - 1) instanceof Ant) ){

return true;}

}else

return false;}


//Right column check
else if (db.rightFlag){

if ( (getBug(db.getRowPosition() - 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition() + 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() - 1) instanceof Ant) ){

return true;}

}else

return false;}


//Bottom row check
else if (db.bottomFlag){

if ( (getBug(db.getRowPosition() - 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() + 1) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() - 1) instanceof Ant) ){

return true;}

}else{

return false;}


//Left column check
else if (db.leftFlag){

if ( (getBug(db.getRowPosition() - 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() + 1) instanceof Ant) ||
(getBug(db.getRowPosition() + 1, db.getColPosition()) instanceof Ant) ){

return true;}

}else{

return false;}


//Check four positions for Ant
else if {((getBug(db.getRowPosition() - 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() + 1) instanceof Ant) ||
(getBug(db.getRowPosition() + 1, db.getColPosition()) instanceof Ant) ||
(getBug(db.getRowPosition(), db.getColPosition() - 1) instanceof Ant) )

return true;}

else{

return false;}


/**
* Return true if there is an empty cell adjacent to the bug
* @param bug Organism that you would like to check for empty cells nearby.
* @return True if an empty cell is adjacent. False otherwise.
*/
public boolean emptyCellAdjacent(Organism bug){

//Top left corner check
if (bug.topFlag && bug.leftFlag){

if ( (getBug(bug.getRowPosition(), bug.getColPosition() + 1) == null) ||
(getBug(bug.getRowPosition() + 1, bug.getColPosition()) == null) ){

return true;}

else{

return false;}


//Bottom right corner check
else if (bug.bottomFlag && bug.rightFlag){

if ((getBug(bug.getRowPosition() - 1, bug.getColPosition()) == null) ||
(getBug(bug.getRowPosition(), bug.getColPosition() - 1) == null) ){

return true;}

else{

return false;}


//Top right corner check
else if (bug.topFlag && bug.rightFlag)

if ((getBug(bug.getRowPosition() + 1, bug.getColPosition()) == null) ||
(getBug(bug.getRowPosition(), bug.getColPosition() - 1) == null) )

return true;

else

return false;


//Bottom left corner check
else if (bug.bottomFlag && bug.leftFlag)

if ((getBug(bug.getRowPosition() - 1, bug.getColPosition()) == null) ||
(getBug(bug.getRowPosition(), bug.getColPosition() + 1) == null) )

return true;

else

return false;


//Top row check
else if (bug.topFlag)

if (
(getBug(bug.getRowPosition(), bug.getColPosition() + 1) == null) ||
(getBug(bug.getRowPosition() + 1, bug.getColPosition()) == null) ||
(getBug(bug.getRowPosition(), bug.getColPosition() - 1) == null) )

return true;

else

return false;


//Right column check
else if (bug.rightFlag)

if (
(getBug(bug.getRowPosition() - 1, bug.getColPosition()) == null) ||
(getBug(bug.getRowPosition() + 1, bug.getColPosition()) == null) ||
(getBug(bug.getRowPosition(), bug.getColPosition() - 1) == null) )

return true;

else

return false;


//Bottom row check
else if (bug.bottomFlag)

if (
(getBug(bug.getRowPosition() - 1, bug.getColPosition()) == null) ||
(getBug(bug.getRowPosition(), bug.getColPosition() + 1) == null) ||
(getBug(bug.getRowPosition(), bug.getColPosition() - 1) == null) )

return true;

else

return false;


//Left column check
else if (bug.leftFlag)

if (
(getBug(bug.getRowPosition() - 1}
