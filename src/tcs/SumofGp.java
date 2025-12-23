package tcs;


import java.util.Scanner;

public class SumofGp { 


    public static int sum(Double firstTerm,Double commonratio,int numberOfTerms)
    {
        int temp =0;
        for(int i=0;i<numberOfTerms;i++)
        {
            temp+=firstTerm;
            firstTerm=firstTerm*commonratio;
        }
        return temp;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double firstTerm= sc.nextDouble();
        double commonratio=sc.nextDouble();
        int numberOfTerms=sc.nextInt();
        double result= sum(firstTerm,commonratio,numberOfTerms);


        
           System.out.println(result);
           sc.close();
        }

    }


