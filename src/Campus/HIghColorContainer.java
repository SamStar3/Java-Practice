package Campus;

import java.util.Arrays;

public class HIghColorContainer {

    public static void main(String[] args) {

        String st = "bbbaaababa";
        int chunkSize = 3;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < st.length(); i += chunkSize) {
            int end = Math.min(i + chunkSize, st.length());
            String chunk = st.substring(i, end);
//            System.out.println(chunk);
            for(int j=0;j<chunk.length();j++)
            {
                if(chunk.charAt(j) == 'a')
                {
                    count++;
                }
            }

            if(count > temp){
                temp = count;
            }

            count=0;
        }

        System.out.print(temp);
    }
}
