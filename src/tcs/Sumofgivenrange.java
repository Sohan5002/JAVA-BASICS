package tcs;

import java.util.*;

public class Sumofgivenrange {
    public static void sum(int start,int end)
    {
        int result = 0;
        for (int i = start; i <= end; i++) 
        {
            result+=i;
        }
        System.err.println(result);
        }
    
public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int start=sc.nextInt();
            int end=sc.nextInt();
            sum(start,end);
        }
}

}
