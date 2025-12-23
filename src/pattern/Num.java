package pattern;

import java.util.Scanner;

public class Num {
public void halfpramid (int num) {
		 //int temp=1;
		  for(int i=1;i<=num;++i) {
			  for(int j=1;j<=i;++j) {
				  System.out.print(j);
			  }
		 System.out.println(); 
	 }
	 }
	public static void main(String  []args)
	{
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		Paramid p= new Paramid();
		
		p.halfpramid(num);
		sc.close();
	}
	//sc.close();

}
