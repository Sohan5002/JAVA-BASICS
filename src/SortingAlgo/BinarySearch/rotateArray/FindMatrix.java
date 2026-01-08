package SortingAlgo.BinarySearch.rotateArray;


import java.util.Scanner;

public class FindMatrix {

   public static boolean SearchValue(int[][] var0, int var1) {
      int var2 = var0.length;
      int var3 = var0[0].length;
      int var4 = 0;
      int var5 = var3 - 1;

      while(var4 < var2 && var5 >= 0) {
         if (var0[var4][var5] == var1) {
            return true;
         }

         if (var1 < var0[var4][var5]) {
            --var5;
         } else {
            ++var4;
         }
      }

      return false;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int[][] var4 = new int[var2][var3];
      int var5 = var1.nextInt();

      for(int var6 = 0; var6 < var2; ++var6) {
         for(int var7 = 0; var7 < var3; ++var7) {
            var4[var6][var7] = var1.nextInt();
         }

         SearchValue(var4, var5);
      }

      var1.close();
   }
}


