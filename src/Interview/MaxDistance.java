package Interview;

public class MaxDistance {

    public static void main(String[] args){

//        String str = "abcbda";
//        int maxDis = 0;
//
//        for (int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            int first = -1;
//
//            for (int j = 0; j < str.length(); j++){
//                if (str.charAt(j)==ch){
//                    first = j;
//                    break;
//                }
//            }
//            int last = -1;
//
//            for (int j = str.length()-1; j >= 0; j--){
//
//                if (str.charAt(j) == ch){
//                    last = j;
//                    break;
//                }
//            }
//
//            int dis = last - first;
//
//            if (dis > maxDis){
//                maxDis = dis;
//            }
//        }
//
//        System.out.println(maxDis - 1   );

        String str = "abcbda";
        int maxDis = 0;

        for (int i = 0; i< str.length(); i++){

            char ch = str.charAt(i);

            int first = -1;

            for (int j = 0; j < str.length(); j++){
                if (ch == str.charAt(j)){
                    first = j;
                    break;
                }
            }

            int last = -1;
            for (int j = str.length() -1; j > 0; j--){
                if (ch == str.charAt(j)) {

                    last = j;
                    break;
                }

            }
//            System.out.println(last +first);
            int dis = last -first;

            if (dis > maxDis){
                maxDis = dis;
            }
        }
        System.out.println(maxDis -1 );
    }
}
