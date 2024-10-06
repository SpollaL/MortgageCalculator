import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Period (years): ");
        int years = scanner.nextInt();
        float mortgage = evalMortgage(principal, annualInterestRate, years);
        System.out.print("Mortgage: " + mortgage);

    }

    public static float evalMortgage(int principal, float annualInterestRate, int years) {
        return principal*(1+annualInterestRate) / years;
    }
}
