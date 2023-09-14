import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weightKg = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double heightM = input.nextDouble();

        double bmi = calculateBMI(weightKg, heightM);

        String interpretation = interpretBMI(bmi);

        System.out.printf("Your BMI is %.2f, which is considered '%s'.%n", bmi, interpretation);

        input.close();
    }

    // Function to calculate BMI
    public static double calculateBMI(double weightKg, double heightM) {
        return weightKg / (heightM * heightM);
    }

    // Function to interpret BMI
    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
