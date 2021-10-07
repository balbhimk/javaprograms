import java.util.*;
public class Largest_Sum_Contiguous_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int currentsum=0,maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currentsum =currentsum+arr[i];

            if(currentsum>maxsum){
                maxsum = currentsum;
            }

            if (currentsum<0) {
                currentsum = 0;
            }
        }

        System.out.println(maxsum);
        sc.close();
    }
}
