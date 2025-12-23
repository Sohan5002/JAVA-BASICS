<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

import java.util.Scanner;

public class sumofallsubset {
   public static void sumset(int[] arr, int i, int sum){
<<<<<<< HEAD
=======
   {
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
    if(i>=arr.length){
        System.out.println(sum);
        return;
    }
    sumset(arr, i+1, sum+arr[i]);//Not including the element
    sumset(arr, i+1, sum);//    Including the element
<<<<<<< HEAD
   }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){     
                arr[i] = sc.nextInt();  
            }
            sumset(arr, 0, 0);
        }
    }
=======
    }       }

    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i = 0; i < n; i++){     
    arr[i] = sc.nextInt();  
    }
    sumset(arr, 0, 0);
    
}
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
}
