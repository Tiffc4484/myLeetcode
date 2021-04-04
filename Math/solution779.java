import java.lang.Math;
public class solution779 {
    public static int kthGrammar(int N, int K) {
        if ((N == 1 && K == 1) || (N == 2 && K == 1)) {
            return 0;
        } else if (N == 2 && K == 2) {
            return 1;

        } else {
            if (K <= (int) Math.pow(2, N-2)) {
                return kthGrammar(N - 1, K);
            } else {
                return -kthGrammar(N - 1, K - (int) Math.pow(2, N-2)) + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(1,1));
        System.out.println(kthGrammar(2,1));

        System.out.println(kthGrammar(2,2));
        System.out.println(kthGrammar(4,5));
        kthGrammar(5,7);
        System.out.println(kthGrammar(5,7));
        //System.out.println(kthGrammar(5,7));
    }
}
