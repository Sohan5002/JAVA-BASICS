package tcs;

import java.util.Scanner;

public class abundant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        //int original=num;
        int sum=0;
      for(int i=1;i<num;i++)
    {
        if(num%i==0)
        {
            sum+=i;

}   
  

} 
 if(sum>num)
{
    System.err.println("it is an abundant number");
}

else{
    System.err.println("no");
}
sc.close();
    }

}
