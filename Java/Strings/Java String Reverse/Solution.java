/// github.com/Cl9nt-m

import java.util.Scanner;

/* If a String is equivalent to itself when reversed, it's a palindrome */
public class Solution {
    public static void main(String[] args) {

        // Read input 

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        scan.close();
        
        // Reverse string and compare to original 

        int count = 0;
        for (int i = 0; i < A.length()/2; i++)
            if (A.charAt(i) == A.charAt(A.length()-i-1)) count++;
            System.out.println( (count == A.length()/2) ? "Yes" : "No");

    }

}
