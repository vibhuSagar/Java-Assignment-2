/* Printing Fibonacci series */

import java.util.Scanner;

public class Series{

    public static void printFibonancciSerices(int n) {      //method to print Fibonacci Series
        
        int term1=0, term2=1, term3=1, term4=2;
        int sum;
        
        /* printing the first four terms */
        
        System.out.println(term1);
        System.out.println(term2);
        System.out.println(term3);
        System.out.println(term4);
        
        for(int i=4; i<n; i++){                 //Calculating the sum of upcoming four terms
            sum=term1+term2+term3+term4;
            
            System.out.println(sum);
            term1=term2;
            term2=term3;
            term3=term4;
            term4=sum;
        }

    }



    
    public static void main(String[] args){
        
     Series s=new Series();
        System.out.println("Enter the number of terms");
        Scanner num = new Scanner(System.in);
        int number=num.nextInt();
        s.printFibonancciSerices(number);
    }
}

