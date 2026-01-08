package tcs;

import java.util.Scanner;

public class removecharacter {
    public  static  void check(String str){
        String result ="";
    for(int i=0;i<str.length();i++){
    char ch =str.charAt(i);

 if((ch>='A'&&ch <='Z')||(ch>='a'&&ch <='z')){
      result+=ch;

    }
    
}
System.out.println(result);
}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str= sc.nextLine();
            check(str);
        }
    }

}

