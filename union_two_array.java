import java.util.*;
public class union_two_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int[] seta = new int[a];
        // int[] setb = new int[b];

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<a;i++){
            int z  = sc.nextInt();
            set.add(z);
        }

        
        for(int i=0;i<b;i++){
            int z = sc.nextInt();
            set.add(z);
        }

        for (int item: set) {
            System.out.print(item + " ");
        }
    
        sc.close();
    }
    
}