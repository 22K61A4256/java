import java.io.*;
import java.util.*;
public class ElseIfExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects");
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float s3=sc.nextFloat();
        float total=s1+s2+s3;
        float avg=total/3;
        System.out.println("The total marks of the student is" +total);
        if(avg>=75)
        {
            System.out.println("Student avg is" +avg+" Student passed with destinction ");
        }
        else if(avg>=60 && avg<75)
        {
            System.out.println("Student avg is" +avg+" Student passed in first class ");
        }
        else if(avg>=50 && avg<20)
        {
            System.out.println("Student avg is" +avg+" Student passed in second class ");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Student avg is" +avg+" Student passed in third class ");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
