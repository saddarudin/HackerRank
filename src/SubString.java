import java.util.Scanner;

/*
Make substring of length k and then print smallest and largest substrings
'smallest' must be the lexicographically smallest substring of length 'k'
 'largest' must be the lexicographically largest substring of length 'k'

 */
public class SubString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i=1;i<=s.length()-k;i++){
            String temp=s.substring(i,k+i);
            if(smallest.compareTo(temp)>0)smallest=temp;
            else if(largest.compareTo(temp)<0)largest=temp;
        }



        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}