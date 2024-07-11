package StringsDSA;

public class RabinKarpAlgo {

    public final static int d = 256;
    static void RBSearch(String txt, String pat, int M, int N, int q) {

//        int h = 1;
//        int p = 0;
//        int t = 0;
//        int i,j;
//        for (i = 0; i < m -1; i++ ) {
//            h = (h * d) % q;
//        }
//        for (i = 0; i < m; i++) {
//            p = (d * p + pat.charAt(i)) % q;
//            t = (d * t + txt.charAt(i)) % q;
//        }
//        for (i = 0; i <= n - m; i++) {
//            if (p == t) {
//                for (j = 0; j < m; j++) {
//                    if (txt.charAt(i + j) != pat.charAt(j)) {
//                        break;
//                    }
//                }
//                if (j == m) {
//                    System.out.println("Pattern found at index " + i);
//                }
//            }
//            if (i < n - m) {
//                t = (d*(t - txt.charAt(i) * h) + txt.charAt(i + m) % q);
//                if (t < 0) {
//                    t = (t + q);
//                }
//            }
//        }

        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M-1; i++)
            h = (h*d)%q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++)
        {
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++)
        {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters on by one
            if ( p == t )
            {
                /* Check for characters one by one */
                for (j = 0; j < M; j++)
                {
                    if (txt.charAt(i+j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if ( i < N-M )
            {
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args) {

        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int M = pat.length();
        int N = txt.length();
        int q = 101;

        RBSearch(txt,pat, M , N,q);
    }
}
