import java.util.Scanner;
import java.util.Arrays;
class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int[] W = new int[N];
            for(int i=0; i<N; i++){
                W[i] = sc.nextInt();
            }
            Arrays.sort(W);
            int sumW = 0;
            for(int i=0; i<W.length; i++){
                sumW=sumW + W[i];
            }
            int minOper = sumW - N * W[0];
            System.out.println(minOper);
        }
    }
}