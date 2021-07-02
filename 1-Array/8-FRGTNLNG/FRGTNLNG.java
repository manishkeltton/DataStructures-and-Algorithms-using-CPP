import java.util.Scanner;
class FRGTNLNG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int z, i, j, L;
            int N = sc.nextInt();
            int K = sc.nextInt();
            String[] extinctLang = new String[N];
            for(i=0 ; i<extinctLang.length;i++){
                extinctLang[i] = sc.next();
            }
            String[] result = new String[N];
            for(i = 0; i < N ; i++){
                boolean flag = false;
                for(j = 0 ; j<K;j++){
                     L = sc.nextInt();
                     String[] phrase = new String[L];
                     for(z =0 ; z < L ; z++){
                        phrase[z] = sc.next();
                     }
                     for(z=0; z < L; z++){
                         if(phrase[z].equals(extinctLang[i])){
                             flag = true;
                             break;
                         }
                     }
                     if (flag){
                         break;
                     }
                }

                if(flag){
                   result[i] = "YES";
                }
                else {
                   result[i] = "NO";
                }
            }

            for (i=0; i<N ; i++){
                System.out.print(result[i]+" ");
            }
            System.out.print("\n");
        }  
    }
}