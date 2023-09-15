public class Main {
    public static void main(String[] args)
    {
        double balance = 5000;
        double interestRateOne = balance * .17;
        double interestBalance = balance + interestRateOne;
        double interestRateTwo = interestBalance * .17;
        double interestBalanceTwo = interestBalance + interestRateTwo;

        System.out.println("After the first month, you have " + interestBalance);
        System.out.println("After the second month, you have " + interestBalanceTwo);


    }
}