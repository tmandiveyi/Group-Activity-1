//Group 2's program on letters and numbers


import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Inputting the character

        System.out.print("Enter the character: ");
        char letter = input.next().charAt(0);

        input.close();

        switch (letter) {
            case 'a' ,'b' ,'c':
                System.out.println("Please press 2");
                break;
            case 'd' ,'e' ,'f':
                System.out.println("Please press 3");
                break;
            case 'g' ,'h' ,'i':
                System.out.println("Please press 4");
                break;
            case 'j' ,'k' ,'l':
                System.out.println("Please press 5");
                break;
            case 'm' ,'n' ,'o':
                System.out.println("Please press 6");
                break;
            case 'p' ,'q' ,'r', 's':
                System.out.println("Please press 7");
                break;
            case 't' ,'u' ,'v':
                System.out.println("Please press 8");
                break;
            case 'w' ,'x' ,'y','z':
                System.out.println("Please press 9");
                break;
            default:
                System.out.println("Invalid input");

        }

//
//        System.out.print("Enter Your weight in pounds: ");
//        double weight = input.nextDouble();
//
//        System.out.print("Enter Your height in inches: ");
//        double height = input.nextDouble();
//
//        input.close();
//
//        double weightinKilograms = weight *0.45359237;
//        double heightinMetres = height *0.0254;
//       double bmi = weightinKilograms / (heightinMetres*heightinMetres);
//
//       System.out.println("Your BMI is: " + bmi);


    }
}
