import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = 30;
        int[] arr = new int[N];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = 0;
        }
        
        for(int i=0; i<arr.length-2; i++) {
            int num = sc.nextInt();
            arr[num-1] = num;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==0)
                System.out.println(i+1);
        }
    }
}