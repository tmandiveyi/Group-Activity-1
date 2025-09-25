import java.util.Scanner;
public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter Your height in inches: ");
        double height = input.nextDouble();

        input.close();

        double weightinKilograms = weight *0.45359237;
        double heightinMetres = height *0.0254;
       double bmi = weightinKilograms / (heightinMetres*heightinMetres);

       System.out.println("Your BMI is: " + bmi);


    }
}
