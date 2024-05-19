package StringFormatting;

public class StringMethod {
    public static void main(String[] args){
        String birthData = "28/09/2002";
        int startingIndex = birthData.indexOf("2002");
        System.out.println("Starting Index = " + startingIndex);
        System.out.println("Birth year = " + birthData.substring(startingIndex));

        System.out.println("Month = " + birthData.substring(3,5));

        String newData = String.join("/","28","09","2001");
        System.out.println("New Data = " + newData);

        newData = newData.concat("/");
        System.out.println("New Data = " + newData);

        System.out.println(newData.replace("/","-"));
        System.out.println(newData.replaceAll("/","--"));

        System.out.print("ABC \n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC \n".repeat(3).indent(8));
        System.out.println("-".repeat(20));
    }
}
