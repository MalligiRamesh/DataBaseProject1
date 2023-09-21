//Question 7: Write a Java program to find the sum of all natural numbers between 1 and a given number.
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ep=sc.nextInt(),sum=0;
        for(int i=1;i<=ep;i++){
           sum=sum+i;
        }
        System.out.println("sum of all natural numbers: "+sum);
    }
}
