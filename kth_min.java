import java.util.*;
import java.util.Arrays;
public class kth_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of element ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        System.out.print("enter number k th value to find k th small element ");
        int k = sc.nextInt();
        System.out.println(a[k-1]);
        sc.close();
    }
}
