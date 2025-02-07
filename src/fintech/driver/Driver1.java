package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;
/**
 * @author 12S23017_Andrey Jonathan
 * @author 12S23050_Yolanda Saragih
 */
public class Driver1 {
 
    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);
        String perintah;  
        String accountName;
        String owner; 
 
        perintah = input.nextLine();
        accountName = input.nextLine();
        owner = input.nextLine();
 
        Account accounts = new Account(accountName, owner);
        System.out.println(accounts.toString());

    }
}
 