//Question 1: Write a Java program to find and print all the prime numbers between two given numbers
import java.util.Scanner;
public class Program1{
    public static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt(),num2=sc.nextInt();
         System.out.println("The prime numbers between two numbers are: ");
         for(int i=num1;i<=num2;i++){
           if(isPrime(i)==true){
            System.out.print(i+" ");
           }
         }
    }
}