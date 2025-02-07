// File: src/fintech/model/Account.java
 package fintech.model;

 /**
 * @author 12S23017_Andrey Jonathan
 * @author 12S23050_Yolanda Saragih
 */

 // <account-name>|<owner>|<balance>
 public class Account {
     // <account-name>|<owner>|<balance>
     private String accountName;
     private String owner;
     private double balance = 0.0;
 
     public Account(String accountName, String owner) {
         this.accountName = accountName;
         this.owner = owner;
 
     }
 
     public String toString() {
         return owner + "|" + accountName + "|"  +balance;
     }
 
 }