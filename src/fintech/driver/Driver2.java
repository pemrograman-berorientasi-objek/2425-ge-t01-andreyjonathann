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

        // Membaca perintah pertama
        String perintah = input.nextLine(); 
        String accountName = input.nextLine();
        String owner = input.nextLine();

        // Membuat akun
        Account accounts = new Account(accountName, owner);
        
        // Membaca perintah transaksi
        String perintah2 = input.nextLine();
        accountName = input.nextLine();
        
        // Membaca jumlah transaksi dengan benar
        double amount = input.nextDouble();
        input.nextLine(); // Konsumsi newline setelah nextDouble()

        String posted_at = input.nextLine();
        String note = input.nextLine();

        // Membuat transaksi
        Transaction transaction = new Transaction(accountName, owner, amount, posted_at, note);

        // Output hasil
        System.out.println(accounts.toString());
        System.out.println(transaction.toString2());

        input.close();
    }
}