package DAY07;

public class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;

    public BankAccount(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //입금
    int deposit(int 입금액) {
        balance+=입금액;
        return balance;
    }

    //출금
    int withdraw(int 출금액) {
        balance -= 출금액;
        return balance;
    }
}
