import java.util.*;
public class rotate_array_by1 {
    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }

        int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
        {
           arr[i] = arr[i-1];
        }
        arr[0] = x;

        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }

        sc.close();
    }
}
