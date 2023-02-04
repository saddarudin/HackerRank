import java.util.Scanner;

/*
Two strings, a and b, are called anagrams if they contain all
the same characters in the same frequencies. For this challenge,
the test is not case-sensitive. For example, the anagrams of CAT
are CAT, ACT, tac, TCA, aTC, and CtA

Task: Check whether two strings are anagrams or not
 */
public class Anagram {

    public static void sort(char[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if((int)a[j]>(int)a[j+1]){
                    char temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
    }

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] A=a.toCharArray();
        char[] B=b.toCharArray();
        sort(A);
        sort(B);
        a=String.valueOf(A);
        b=String.valueOf(B);
        return a.equalsIgnoreCase(b);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
