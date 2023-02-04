import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int count=0;
        for(int i=A.length()-1;i>=0;i--){
            if(A.charAt(count)!=A.charAt(i)){
                System.out.print("No");
                return;
            }
            count++;

        }
        System.out.print("Yes");
    }
}



