//Question 4: Write a Java program to find the sum of all the prime numbers between 1 and 100.
import java.util.Scanner;
public class Program4{
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
       int sum=0;
       int sp=sc.nextInt(),ep=sc.nextInt();
       for(int i=sp;i<=ep;i++){
            if(isPrime(i)==true){
                sum=sum+i;
            }
       }
        System.out.println("The sum of all prime numbers is: "+sum);
    }
}