package tcs;

import java.util.*;

public class Insertelement {
	public static void Addelements(ArrayList<Integer>list,int elements,int index)
	{
		if(index<0||index>list.size())
		{
			System.out.println();
		}
		else
		{
			list.add(index,elements);
			System.out.println(list);
		}
	}

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<Integer>list = new ArrayList<>();
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		list.add(sc.nextInt());
	}
	int elements= sc.nextInt();
	int index=sc.nextInt();
	Addelements(list,elements,index);

	sc.close();
}
}