//Question 5: Write a Java program to find and print the factorial of a given number.
import java.util.Scanner;
public class Program5{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt(),fact=1;
      for(int i=1;i<=num;i++){
        fact=fact*i;
      }
      System.out.println("The factorial of the given number is: "+fact);
    }
}