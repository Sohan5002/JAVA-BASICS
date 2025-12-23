package topointer;
import java.util.*;
 


public class Zerorightswift {
    public  static  void  moveZero(int [] arr)
    {
        int left =0;
        int right = arr.length-1;
        while(left<right)
        {
            if(arr[left]==0&& arr[right]!=0)
            {
                swap(arr,left,right);
                left++;
                right--;

            }
            if(arr[left]!=0) left++;
            if(arr[right]==0)right--;
            
        }
    }
    public static  void swap(int []arr,int left,int right)
    {
        int temp= arr[left];
         arr[left]=arr[right];
         arr[right]=temp;
    }

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
  int []arr= new int[n];
  for(int i=0; i< arr.length;i++){
    arr[i]=sc.nextInt();
  }
  moveZero(arr);
  System.err.println(Arrays.toString(arr));
 sc.close();
}}
