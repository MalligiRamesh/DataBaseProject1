//Question 2: Write a Java program to check if a given number is a perfect square or not.
import java.util.Scanner;
public class Program2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    boolean b=false;
    for(int i=1;i<=num;i++){
        if(i*i==num){
        b=true;
        }
    }
    if(b==true){
        System.out.println("perfect square no");
    }
    else{
        System.out.println("not a perfect square no");
    }
}
}
