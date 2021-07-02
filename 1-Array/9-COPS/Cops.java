import java.util.*;
class Cops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int M = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] houseNumber = new int[M];
            for(int i=0 ; i<M; i++){
                houseNumber[i] = sc.nextInt();
            }

            Arrays.sort(houseNumber);
            int[] leftHous = new int[101];
            Arrays.fill(leftHous, 0);
            int search = x * y;
            int add, sub;
            for(int i=0;i<M;i++){
                add = houseNumber[i]+search;
                sub = houseNumber[i]-search;
                int init = sub > 0 ? sub : 0;
                for (int j= houseNumber[i]; j<=add && j<=100 ; j++){
                    leftHous[j]=1;
                }
                for (int j= houseNumber[i]; j>=sub && j>=1 ; j--){
                    leftHous[j]=1;
                }
            }
            int count = 0;
            for (int i=1; i<101; i++){
                if(leftHous[i] == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}