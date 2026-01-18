// To find all the subsequences of a string using arraylist
package Recursion;
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