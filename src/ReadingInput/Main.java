package ReadingInput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int currentYear = 2024;

//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
//        }
    }

//    public static String getInputFromConsole(int currentYear) {
//        String name = System.console().readLine("Hi, What's your Name?");
//        System.out.println("hi " + name);
//        String dateOfBirth = System.console().readLine("What year were you born ? ");
//        int age  = currentYear - Integer.parseInt(dateOfBirth);
//        return "So you are " + age + " Years old";
//    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " Thanks for using this");
        int age = 0;
        boolean validInput = false;
        do {
            System.out.print("What year were you Born? ");
            String dateOfBirth = scanner.nextLine();
            try {
                int dob = Integer.parseInt(dateOfBirth);
                if (dob >= 0 && dob <= currentYear) {
                    age = currentYear - dob;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid year of birth.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year of birth.");
            }
        } while (!validInput);

        scanner.close();
        return "So you are " + age + " years old";
    }
}