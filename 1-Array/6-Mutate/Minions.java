import java.util.Scanner;
class Minions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] C_Val = new int[N];
            for (int i = 0 ; i < N; i++){
                C_Val[i] = sc.nextInt();
            }
            for (int i =0; i<N;i++){
                C_Val[i] = C_Val[i] + K;
            }
            int count = 0;
            for (int i=0; i<N; i++){
                if(C_Val[i] % 7 == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}