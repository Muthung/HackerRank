// github.com/Cl9nt-m

// Solution using Java 8.

import java.util.Scanner;

import java.util.regex.Pattern;

import java.util.regex.PatternSyntaxException;

// If a PatternSyntaxException is not thrown by Pattern.compile, the regular expresion is valid
public class Solution {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){

            String pattern = in.nextLine();

            try{

                Pattern.compile(pattern);

                System.out.println("Valid");

            }catch(PatternSyntaxException ex){

                System.out.println("Invalid");

            }

            testCases--;

        }
    }

}
