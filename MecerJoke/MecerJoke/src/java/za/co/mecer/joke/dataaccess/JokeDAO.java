package za.co.mecer.joke.dataaccess;

import java.util.List;
import za.co.mecer.joke.model.Joke;


public interface JokeDAO {
  Joke getJoke(int categoryId);          //any joke from a category
  List<Joke> getJokes(int categoryId);   //all jokes from a category
  Joke getJoke();                        //random joke from any category
  List<Joke> getJokes();                 //all jokes from all categories
  boolean addJoke(Joke joke);          //add new joke
}
