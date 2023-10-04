//Question 8: Write a Java program to find and print the prime factors of a given number.
import java.util.Scanner;
public class Program8 {

    static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int  c=0;
            if(isPrime(i)==true){
              while(n%i==0 && n!=0){

         if(c==0){
            System.out.print(i+" ");
         }
       c++;
         n=n/i;
       }
     }
    }
    }
}
