public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    private int principal;
    private float annualInterestRate;
    private byte years;

    public MortgageCalculator(int principal, float annualInterestRate, byte years) {
        setPrincipal(principal);
        setAnnualInterestRate(annualInterestRate);
        setYears(years);
    }

    private void setPrincipal(int principal) {
        if (principal < 10_000 && principal > 1_000_000) {
            throw new IllegalArgumentException("Enter a value between 10_000 and 1_000_000");
        }
        this.principal = principal;
    }

    private void setYears(byte years) {
        if (principal < 1 && principal > 30) {
            throw new IllegalArgumentException("Enter a value between 1 and 30");
        }
        this.years = years;
    }

    private void setAnnualInterestRate(float annualInterestRate) {
        if (principal < 0 && principal > 30){
            throw new IllegalArgumentException("Enter a value between 10_000 and 1_000_000");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public double calculateMortgage() {
    
        float monthlyInterestRate = getMonthlyInterestRate();
        int numberOfPayments = getNumberOfPayments();
    
        double mortgage = principal 
               * (monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberOfPayments))
               / (Math.pow(1+monthlyInterestRate, numberOfPayments) - 1);
    
        return mortgage;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
    }
}