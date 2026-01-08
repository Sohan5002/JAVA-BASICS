package tcs;


import java.util.*;

public class RemoveSpace {
    public  static void remove(String str)
    {
        String result ="" ;
     for(int i=0;i<str.length();i++)
     {  //string result ;
        if (str.charAt(i) != ' ' )
        {
        result += str.charAt(i);
      
        } 
       
     }
     System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String str = sc.nextLine();
            remove(str);
          sc.close();
    }

}
