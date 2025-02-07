package fintech.model;

/**
 * @author 12S23017_Andrey Jonathan
 * @author 12S23050_Yolanda Saragih
 */

public class Transaction {

    private String account_name;
    private String owner;
    private double balance;
    private static int idCounter = 0; // Untuk auto increment ID
    private int id;
    private double amount;
    private String posted_at;
    private String note;

    // Konstruktor
    public Transaction(String account_name, String owner, double amount, String posted_at, String note) {
        this.account_name = account_name;
        this.owner = owner;
        this.amount = amount;
        this.posted_at = posted_at;
        this.note = note;
        
        this.id = ++idCounter;      // Auto increment ID
        this.balance = balance + amount;      // Inisialisasi balance pertama sesuai amount
    }

    // Method untuk menampilkan informasi akun
    public String toString() {
        return account_name + "|" + owner + "|" + balance;
    }

    // Method untuk menampilkan detail transaksi
    public String toString2() {
        return id + "|" + account_name + "|" + amount + "|" + posted_at + "|" + note + "|" + balance;
    }
}
