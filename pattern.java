import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pattern no : 1
        //     *
        //     *
        //     *
        //     *

        // for(int i=1;i<=4;i++)
        // {
        //     System.out.println("*");
        // }


        int row = sc.nextInt();
        int col = sc.nextInt();
        
        //pattern no : 2
        // ****
        // ****
        // ****
        // ****

        // int row = 4,col=4;
        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1;j<=col;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // pattern no : 3

        // * * * * * 
        // *       * 
        // *       * 
        // *       * 
        // * * * * * 

        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1;j<=col;j++)
        //     {
        //         if(i==1 || j==1 || i==row || j==col)
        //         {
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // pattern no : 4
            // *   
            // **  
            // *** 
            // ****
        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // pattern no : 5

        // ****
        // *** 
        // **  
        // *  

        // for(int i=row;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // pattern no : 5
        //      *
        //     **
        //    ***
        //   ****
        
        // for(int i=row; i>=1; i--) {
        //         for(int j=1; j<i; j++) {
        //             System.out.print(" ");
        //         }
    
        //         for(int j=0; j<=row-i; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }

        // pattern no : 6

        // 1   
        // 12  
        // 123 
        // 1234

        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // pattern no : 7
        // 12345
        // 1234 
        // 123  
        // 12   
        // 1 

        // for(int i=row;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        

        // pattern no : 8

        // 1  
        // 2  3  
        // 4  5  6  
        // 7  8  9  10         
        // 11  12  13  14  15

        // int cnt=1;
        // for(int i=0;i<=row;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(cnt+"  ");
        //         cnt++;
        //     }
        //     System.out.println();
        // }
            
        // pattern no : 9
        // 1         
        // 0 1       
        // 1 0 1     
        // 0 1 0 1   
        // 1 0 1 0 1 

        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2 == 0 ){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }


        // pattern no : 10
        //      *****
        //     ***** 
        //    *****  
        //   *****   
        //  *****    

        // for(int i=row; i>=1; i--) {
        //     for(int j=1; j<i; j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=row; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    














        sc.close();
    }
}
