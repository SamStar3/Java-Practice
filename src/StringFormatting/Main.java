package StringFormatting;

public class Main {
    public static void main(String[] args){
        String bulletIt = "Print a Bulleted list:" + "\u2022 First Point" + "\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                 \u2022 First Point 
                 \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 22;
        System.out.printf("Your age is %d \n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d",age,yearOfBirth);

        for(int i = 1; i <= 10000; i*=10){
            System.out.printf("Printing %5d %n",i);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
