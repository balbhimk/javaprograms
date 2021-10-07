import java.util.*;

public class max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int[] arr = new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i] = input.nextInt();
        }

        int max,min;
        max = arr[1];
        min = arr[1];

        for(int i=0;i<a;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("max is : "+ max + " min is : "+ min);

        input.close();

    }
}
