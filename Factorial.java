import java.io.*;
import java.util.*;
public class FactorialExample
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value");
    int n=sc.nextInt();
    int fact=1;
    for(int i=2;i<=n;i++) //for(int i=n;i>=2;i--)
    {
        fact=fact*i;
    }
    System.out.println("factorial of "+n+" is "+fact);
}
}
