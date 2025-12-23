package tcs;

import java.util.Scanner;

public class ALLvouwelremovefromstring {

    public static String remove(String str)
    {
       // int n=str.length()-1;
        for(int i=0;i<str.length();i++)
        {
            //char ch=str.charAt(i);
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
             str = str.substring(0,i)+str.substring(i+1);
            i--;
        }
        return str;
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
     String result= remove(str);
     System.out.println(result);
     sc.close();
}
}
