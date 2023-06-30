package Day3.Bai6;

// Lớp ATM đại diện cho máy ATM
class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful. Current balance: " + account.getBalance());
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
        System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
    }

    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }
}

