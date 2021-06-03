// github.com/Cl9nt-m


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        // Read input

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();
        
        // Determine answer 

        String ans = "";

        if (n % 2 == 1) {
            
            ans = "Weird";

        } else {

            if (n >= 6 && n <= 20) {

                ans = "Weird";
                
            } else {

                ans = "Not Weird";

            }

        }
        
        // Print output 

        System.out.println(ans);

    }

}
