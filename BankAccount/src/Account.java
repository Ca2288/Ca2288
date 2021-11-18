
 class BankAccount {

    public static void main(String[] args) {
        new Bank().doTransaction();
    }   
}
class Bank {
    //Perform a transaction
        public void doTransaction(Transaction transaction){
        int balance =transaction.getAccount().getBalance(); //Get current balance
        switch(transaction.getTransactionType()){
        case Transaction.CREDIT: //Credits require a lot of checks...
        try {
            Thread.sleep(100);
        }
            catch(InterruptedException e){
                System.out.println(e);
        }
    balance +=transaction.getAmount();//Increment the balance
        break;
        case Transaction.DEBIT: //Debits require even more checks...
        try {
            Thread.sleep(150);
        }
        catch(InterruptedException e){
        System.out.println(e);
        }
    balance -=transaction.getAmount();//Decrement the balance
        break;
    default://We should never get here
        System.out.println("Invalid transaction ");
        System.exit(1);
}
        transaction.getAccount().setBalance(balance);//Restore the account balance
}
        
        
}
public class Account {
    private int balance;//The current account balance
    private int accountNumber;//Identifies this account
//Constructor
    public Account(int accountNumber,int balance){
        this.accountNumber =accountNumber;//Set the account number
        this.balance =balance;//Set the initial balance
    }
//Return the current balance
    public int getBalance(){
        return balance;
    }
//Set the current balance
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public String toString(){
        return ("Acc No: " + accountNumber + " : R" + balance);
    }
}
class Transaction {
//Transaction types --- REFACTOR THESE TYPES TO AN ENUMERATION and change the code appropriately.
public static final int DEBIT =0;
public static final int CREDIT =1;
public static String[] types = {"Debit" ,"Credit"};

//--------------------
//date and time of transaction
//--------------------
private Account account;
private int amount;
private int transactionType;
//Constructor
public Transaction(Account account,int transactionType,int amount){
this.account =account;
this.transactionType =transactionType;
this.amount =amount;
}
public Account getAccount(){
return account;
}
public int getTransactionType(){
return transactionType;
}
public int getAmount(){
return amount;
}
public String toString(){
return types [transactionType ] +  "Acc:" + ":R" + ++amount;
}
}

 class Clerk implements Runnable{
private Bank theBank;
private Transaction inTray;//The in-tray holding a transaction
//Constructor
public Clerk(Bank theBank){
this.theBank =theBank;//Who the clerk works for
inTray =null;//No transaction initially
}
//Receive a transaction
public void doTransaction(Transaction transaction){
inTray =transaction;
}
//The working clerk...
public void run(){
while(true){
while(inTray ==null){//No transaction waiting?
try{
Thread.sleep(150);//Then take a break...
}
catch(InterruptedException e){
System.out.println(e);
}
}
theBank.doTransaction(inTray);
inTray =null;//In-tray is empty
}
}
//Busy check
public boolean isBusy(){
return inTray !=null; //A full in-tray means busy!
}
}