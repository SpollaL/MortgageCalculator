public class App {
    public static void main(String[] args) throws Exception {

        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterestRate, years);
        var mortgageReport = new MortgageReport(calculator);
        mortgageReport.printMortgage();
    }
}
