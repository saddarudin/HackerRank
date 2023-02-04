/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. Then, print the number
of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, s.


 */
import java.io.*;
import java.util.*;
public class StringSplitTokens {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            if(s.trim().isEmpty())System.out.println("0");
            else{

                String[] str=s.trim().split("[ !,?._'@]+");
                System.out.println(str.length);
                for(String a:str)System.out.println(a);

            }
            scan.close();
        }
    }


