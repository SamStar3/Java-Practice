package Interview;

public class RemoveJunk {

    public static void main(String[] args){


        String str = "23442 Sam Pandian #$% 323";
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str);
    }
}
