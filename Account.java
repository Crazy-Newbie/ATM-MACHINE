
/**
 * Write a description of class Account here.
 *
 * @author Aji Rindra Fakhrezi Putra Faisal
 * @version 1.0.0
 */
public class Account
{
    private String Name;
    private int accountID;
    private int PIN;
    public double balance;
    
    
    public Account(int accountID, int PIN, String Name, double balance){
        this.accountID = accountID;
        this.PIN = PIN;
        this.balance = balance;
        this.Name = Name;
    }
    
    
    
    public void peopleAccount(int accountID, int PIN){
        if((accountID == 1)&&(PIN == 1234)){
            setName("Aji Rindra Fakhrezi Putra Faisal");
            this.balance = 200000;
        }
        else if((accountID==2)&&(PIN==2345)){
            setName("Bayu Adjie Sidharta");
            balance = 500000;
        }
        else if((accountID==3)&&(PIN==3456)){
            setName("Rayhani Juani Carlosni");
            balance = 1000000;
        }
    }
    
    public int getaccountID(){
        return accountID;
    }
    
    public int getPIN(){
        return PIN;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setBalance(double balanceNew){
        this.balance=balanceNew;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void insertMoney(double amount){
        balance = balance + amount;
    }
    
}
