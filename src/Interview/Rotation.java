package Interview;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Rotation {

    public static void main(String[] args){

        String s = "ZohoCorporation";
        String r ="R-Rotation";
        int n = 4;




        int len = s.length();
        n = n % len;
        String res = "";

        if (r.equals("L-Rotation")){
            for (int i = n; i < s.length(); i++){
                res += s.charAt(i);
            }
            for (int i = 0; i < n; i++){
                res+= s.charAt(i);
            }
        }else {
            for (int i = len - n; i < len; i ++){
                res+= s.charAt(i);
            }
            for (int i = 0; i < len - n; i++){
                res += s.charAt(i);
            }
        }

        System.out.println(res);
//        s= s+'w';
        System.out.println(s);
    }
}
