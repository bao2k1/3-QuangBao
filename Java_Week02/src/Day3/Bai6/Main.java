package Day3.Bai6;

public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản ngân hàng
        Account account = new Account("1234567890");

        // Tạo máy ATM
        ATM atm = new ATM(account);

        // Nạp tiền vào tài khoản
        atm.deposit(1000.0);

        // Rút tiền từ tài khoản
        atm.withdraw(5000.0);

        // Kiểm tra số dư trong tài khoản
        atm.checkBalance();
    }
}
