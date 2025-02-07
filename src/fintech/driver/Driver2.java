package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.Scanner;

/**
 * @author 12S23017_Andrey Jonathan
 * @author 12S23050_Yolanda Saragih
 */
public class Driver2 { 
 
    public static void main(String[] _args) {
        

        Scanner input = new Scanner(System.in);
        String perintah; 
        String accountName;
        String owner; 

        perintah = input.nextLine();
        accountName = input.nextLine();
        owner = input.nextLine();

        Account accounts = new Account(accountName, owner);
        
        
        owner = input.nextLine();
        
        accountName = input.nextLine();
        

        String perintah2 = input.nextLine();
        

        String testAccountName = input.nextLine();

        double amount = 0.0;
        String posted_at = "";
        String note = "";

        
        if (accountName.equals(testAccountName)) {
            amount = input.nextDouble(); 
            input.nextLine();           
            posted_at = input.nextLine(); 
            note = input.nextLine();      
        }

        
        Transaction transaction = new Transaction(accountName, owner, amount, posted_at, note);

        // Tampilkan informasi akun dan transaksi
        System.out.println(accounts.toString());
        System.out.println(transaction.toString2());

        input.close();
    }
}
