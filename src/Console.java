import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        System.out.print(prompt);
        double value = scanner.nextDouble();
        return value;
    }
    
    public static double readNumber(String prompt, double min, double max) {
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
}
