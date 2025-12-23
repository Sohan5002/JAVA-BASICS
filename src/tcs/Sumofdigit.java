package tcs;

import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        //int original=num;
        int sum=0;
        
    while(num!=0)
    {
         sum+=num%10;
        num= num/10;
     
    }
  //System.err.println(sum);

System.out.println(sum);
sc.close();

}
}