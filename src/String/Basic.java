package String;
import java.util.Scanner;

public class Basic {
    public static  void checkV(String str) {
       // String [] arr = str.split(" ");
   System.out.println(str.substring(5));


    }
    public static  void  checkSplit(String str) {
        //str.toUpperCase();
        String[] arr = str.split(" ");
        for (String w : arr) {
            //   w.toUpperCase();
            System.out.println(w.toUpperCase());
        }
    }
        static void replaceWord (String str, String oldWord, String newWord){
            System.out.println("Original String: " + str);

            String result = str.replace(oldWord, newWord);

            System.out.println("After Replacement: " + result);
//System.out.println(str.toString());

    }
    public  static  void checkValue(String str,String  newWord) {
        String  result = str.replaceAll( str,newWord);
        System.out.println( result);
    }
    public static  void main(String [] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = sc.next();

        System.out.println("Enter the new word:");
        String newWord = sc.nextLine();

        checkV(str);
        checkSplit(str);
        replaceWord(str, oldWord, newWord);
        checkValue(str ,newWord);

    }
}
