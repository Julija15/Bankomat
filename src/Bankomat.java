public class Bankomat {
    int count20;
    int count50;
    int count100;

    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void addMoney (int count20, int count50, int count100) {
        this.count20 = this.count20 + count20;
        this.count50 = this.count50 + count50;
        this.count100 = this.count100 + count100;
    }

    public void printBalance() {
        System.out.println("Balance: " + getBalance());
    }

    public int getBalance() {
        int balance = count20 * 20 + count50 * 50 + count100 * 100;
        return balance;
    }
}
