import java.util.Scanner;
class Cnote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean isSelected = false;
        while(T > 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            int N = sc.nextInt();
            int required = X - Y;
            int[] P = new int[N];
            int[] C = new int[N];
            isSelected = false;
            for(int i =0 ; i<N ; i++){
               P[i] = sc.nextInt(); 
               C[i] = sc.nextInt();
            }

            for(int i =0 ; i<N; i++ ){
                if(C[i] <= K && P[i] >= required ){
                   isSelected = true;
                   break;
                }
            }
        if(isSelected){
           System.out.println("LuckyChef");
        }
        else{
           System.out.println("UnluckyChef");
        }
            T--;
        }
    }
}