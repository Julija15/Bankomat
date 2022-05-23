public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(10,50,100);
        bankomat.addMoney(20,500,1000);
        bankomat.printBalance();
    }
}