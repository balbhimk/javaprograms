import java.util.*;

public class move_negative_at_begning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v1 = new Vector<Integer>();
        int n = sc.nextInt();
        int[] a = new int[n];
       
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        // Arrays.sort(a);

        for(int i=0;i<n;i++)
        {
            if(a[i]<0){
                int z = a[i];
                v1.add(z);
            }
        }

        for(int i=0;i<n;i++)
        {
            if(a[i]>=0){
                int z = a[i];
                v1.add(z);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(v1.get(i) + " ");
        }

        sc.close();
    }
}
