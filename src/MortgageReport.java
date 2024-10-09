import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;
    private final NumberFormat currencyInstance;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------");
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println(mortgageFormatted);
    }
}