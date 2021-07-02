import java.util.Scanner;
class FirstArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] scores = new int[size];
        int arrVal, i;
        System.out.println("Enter array value");
        for (i=0;i<scores.length;i++){
            arrVal = sc.nextInt();
            scores[i] = arrVal;
        }
        for(int read: scores){
            System.out.print(read+" -> ");
        }

        System.out.println("\nArray length => " + scores.length);
    }
}