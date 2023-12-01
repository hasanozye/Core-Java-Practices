package hackerrankStuff;

import java.util.Scanner;

public class StringPalindrome {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            /* Enter your code here. Print output to STDOUT. */

            String palindrome = "";

            for(int i = A.length()-1; i >0 ; i++){

                palindrome += A.charAt(i);


            }

            System.out.println(palindrome.equals(A));


    }
}
