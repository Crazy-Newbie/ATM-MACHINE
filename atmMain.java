import java.util.Scanner;
/**
 * Write a description of class atmMain here.
 *
 * @author Aji Rindra Fakhrezi Putra Faisal
 * @version 1.0.0
 */
public class atmMain
{
    public static void main(String[] args){
        mainMenuOption();
    }
    
    public static void mainMenuOption(){
        Scanner scan = new Scanner(System.in);
        int idAccount,pinAccount;
        int menu,x;
        System.out.println("=======================================");
        System.out.println("Selamat datang di bank ITS");
        System.out.println("=======================================");
        System.out.println("Masukkan ID bank rekening anda :");
        idAccount = scan.nextInt();
        System.out.println("Masukkan PIN bank rekening anda :");
        pinAccount = scan.nextInt();
        Account recentAccount = new Account(idAccount,pinAccount,"",0);
        recentAccount.peopleAccount(idAccount,pinAccount);
        while(true){
            System.out.println("Masukkan Command untuk melakukan transaksi yang diinginkan\n");
            System.out.println("1. Setoran Tunai\n");
            System.out.println("2. Penarikan Tunai\n");
            System.out.println("3. Selesai\n");
            menu = scan.nextInt();
            
            switch(menu){
                
                case 1:
                    System.out.println("Masukkan nominal uang yang akan di setor:");
                    double money = scan.nextDouble();
                    int choise1, choise2;
                    depositMoney recentMoney = new depositMoney(money,recentAccount.getaccountID(),recentAccount.getPIN(),
                    recentAccount.getName(), recentAccount.getBalance());
                    System.out.println("Total uang yang diterima: Rp"+recentMoney.getinitialMoney());
                    System.out.println("1. Setor\n");
                    System.out.println("2. Batal\n");
                    choise1 = scan.nextInt();
                    switch(choise1){
                        case 1:
                            System.out.println("Setoran ke:\n");
                            System.out.println("1. Rekening Anda\n");
                            System.out.println("2. Rekening lain\n");
                            choise2  = scan.nextInt();
                            switch(choise2){
                                case 1:
                                    recentMoney.insertMoney();
                                    recentMoney.printreceiptownAccount();
                                    break;
                                case 2:
                                    System.out.print("Maaf pelayanan ini belum bisa diakses");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Transaksi dibatalkan, mohon diulangi lagi");
                            System.exit(0);
                    }
                    break;
                case 2:
                    withdrawMoney recentwithdrawMoney = new withdrawMoney();
                    break;
                case 3:
                    System.out.println("Terima Kasih telah menggunakan pelayanan kami");    
                    System.exit(0);
            }
            
        }
        
        
        
    }
    
}
//hehe