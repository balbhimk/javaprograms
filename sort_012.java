import java.util.*;
public class sort_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int c1=0,c0=0;//counters of 1,0 remaing are 2 so no use to count 2

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(a[i] == 0){
                c0++;
            }
            else if(a[i] == 1)
            {
                c1++;
            }
            // else if(a[i] == 2)
            // {
            //     c2++;
            // }
        }
        int j=0;
        j = c0+j;
        int j1 = j+c1;

        for(int i=0;i<j;i++){
            a[i] = 0;
        }

        for(int i=j;i<j1;i++){
            a[i] = 1;
        }
        
        for(int i=j1;i<n;i++){
            a[i] = 2;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] +" " );
        }

        sc.close();
    }
}
