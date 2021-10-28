import org.junit.Test;

import java.util.Scanner;

public class Bank {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    Account a1 = new Account("Oskar", 0);

    deposit(a1);

    withdraw(a1);

        System.out.println(a1.getBalance());

    }



    public static void deposit(Account a1){

        int depositMoney = input.nextInt();
        int newBalance = a1.getBalance() + depositMoney;
        a1.setBalance(newBalance);
    }
    public static void withdraw(Account a1){
        int withdrawMoney = input.nextInt();
        int newBalance = a1.getBalance() - withdrawMoney;
        a1.setBalance(newBalance);
    }

}
