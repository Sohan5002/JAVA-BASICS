// To find all the subsequences of a string using arraylist
<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {
    public static ArrayList<String> subsequences(String str)  
    {  ArrayList<String> ans = new ArrayList<>();
        //base case 
        if(str.length() == 0){
        ans.add("");
        return ans;
        }
        {
       char ch = str.charAt(0);
       ArrayList<String> smallAns = subsequences(str.substring(1));
         for(String s : smallAns){
              ans.add(s);
              ans.add(ch + s);
         }
     return ans;
    }
    }
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
String str = sc.nextLine(); 
 ArrayList<String> result = subsequences(str);
    System.out.println(result);
    sc.close();
    }   
}