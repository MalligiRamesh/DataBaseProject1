//Question 6: Write a Java program to check if a given number is a palindrome or not.
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),n1=n,rem=0,rev=0;
        while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(rev==n1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
