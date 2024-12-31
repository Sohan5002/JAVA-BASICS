package tcs;

import java.util.*;



public class PalindromofString {
    public  static  boolean   check(String str)
    {
  int start =0;
  int end = str.length()-1;
   //boolean Palindrom=false;
  while(start<end)
  {
    if(str.charAt(start)!=str.charAt(end)){
        System.out.println("it is not palindrom");
     return  false;
    }
    start++;
    end--;
}
  
    System.out.println("it is palindrom");
  return true;

       
}



        
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    check(str);
sc.close();
}
}
