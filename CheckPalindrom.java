import java.io.*;
import java.util.*;
public class CheckPalindrom {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a positive intrger to check it is palindrom or not");
int n=sc.nextInt();
int temp = n;
int rev = 0;
while(n>0)
{
 int rem = n%10;
 rev = (rev*10)+rem;
 n = n/10;
}
    if(temp == rev)
 {
    System.out.println(temp+" is a palindrom");
    }
    else
  { 
     System.out.println(temp+" is not a palindrom");
    }
  }
} 
