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
        
        
        accountName = input.nextLine();
        
        owner = input.nextLine();
        double amount = input.nextDouble();
        String posted_at = input.nextLine();
        String note = input.nextLine();

        
        Transaction transaction = new Transaction(accountName, owner, amount, posted_at, note);

        System.out.println(accounts.toString());
        System.out.println(transaction.toString2());

        input.close();
    }
}
