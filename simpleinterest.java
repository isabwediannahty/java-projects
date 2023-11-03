public class simpleinterest {
    public static double calculatesimple(double rate, double principal, int year) {
        double simpleInterest = (rate * principal * year);
        return simpleInterest;
    }

    public static void main(String args[] ) {
        double rate = 0.05;
        double principal = 100000;
        int years = 5;

        double result = calculatesimple(rate, principal, years);
        System.out.println("The simpleInterest is:"+ result + "frw;");
    }
}