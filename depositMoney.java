
/**
 * Write a description of class depositMoney here.
 *
 * @author Aji Rindra Fakhrezi Putra Faisal
 * @version 1.0.0
 */
public class depositMoney extends Account
{
    private double initialMoney;
    private int idAcc;
    private int pinAcc;
    
    public void getaccountInfo(int idAcc, int pinAcc){
        idAcc = idAcc;
        pinAcc = pinAcc;
    }
    
    public depositMoney(double initialMoney,int accountID, int PIN, String Name, double balance){
        super(accountID,  PIN, Name,  balance);
        this.initialMoney = initialMoney;
    }
    
    public double getinitialMoney(){
        return initialMoney;
    }
    
    
    public double insertMoney(){
       return getBalance() + this.initialMoney;
    }
    
    
    public void printreceiptownAccount(){
        peopleAccount(idAcc,pinAcc);
        System.out.println("========================================================");
        System.out.println("Nama                :"+getName());
        System.out.println("ID                  :"+getaccountID());
        System.out.println("Jumlah yang disetor :"+initialMoney);
        System.out.println("Saldo               :"+insertMoney());
        System.out.println("========================================================");
    }
    
    
}
