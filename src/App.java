import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = evalMortgage(principal, annualInterestRate, years);
        System.out.print("Mortgage: " + mortgage);

    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double value;
        while (true) {
            value = scanner.nextDouble();
            if (value > min && value < max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    public static double evalMortgage(int principal, float annualInterestRate, int years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal 
               * (monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberOfPayments))
               / (Math.pow(1+monthlyInterestRate, numberOfPayments) - 1);

        return mortgage;
    }
}
