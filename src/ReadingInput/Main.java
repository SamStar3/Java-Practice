package ReadingInput;

public class Main {
    public static void main(String[] args){
        int currentyear = 2024;
        String dateOfBirth = "2001";
        int age = Integer.parseInt(dateOfBirth);
        System.out.println("Age " + (currentyear-age));
        String userAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println( "The user says he's "+ageWithPartialYear);

    }
}
