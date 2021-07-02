import java.util.Scanner;
class RAINBOWA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
           boolean flag = true;
           int N= sc.nextInt();
           int[] A = new int[N];
           for (int i=0; i<A.length; i++){
               A[i] = sc.nextInt();
           }
           int p1 = 0;
           int p2=N-1;
           if(A[p1] != 1){
               flag = false;
           } else{
               while(p1 < p2){
                   if( A[p1] != A[p2]){
                       flag = false;
                       break;
                   }
                   if( A[p1] != A[p1+1] && A[p1]+1 != A[p1+1]){
                       flag = false;
                       break;
                   }
                   p1++;
                   p2--;
               }
           }
           if(A[p1] != 7){
               flag = false;
           }

           if(flag){
               System.out.println("yes");
           }
           else{
               System.out.println("no");
           }

        }
    }
}