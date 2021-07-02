import java.util.Arrays;
class CopyArr {
    public static void main(String[] args){
        int[] arr1 = {12, 21, 0, 5, 7};
        System.out.println("use assign operator");
        int[] copyarr1 = arr1;
        for(int read1: copyarr1){
            System.out.print(read1+" ");
        }
        System.out.println("\nuse iterating way");
        int[] arr2 = {1, 2, 3};
        int[] copyarr2 = new int[arr2.length];
        for(int i=0; i < copyarr2.length; i++){
          copyarr2[i] = arr2[i];
        }
        for(int read2: copyarr2){
            System.out.print(read2+" ");
        }
        System.out.println("\nuse copyOf method");
        int[] copyarr3 = Arrays.copyOf(arr2, arr2.length);
        for(int read3: copyarr3){
            System.out.print(read3+" ");
        }
       System.out.println("\nuse clone method");
       int[] copyarr4 = (int[])arr1.clone();
        for(int read4: copyarr4){
            System.out.print(read4+" ");
        }
    }
}