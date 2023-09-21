//Question 3: Write a Java program to find and print the first 10 terms of the Fibonacci series.
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),n1=0,n2=1,sum=n1+n2;
        for(int i=1;i<=num;i++){
            System.out.print(n1+" ");
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
    }
}
