import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
    
//  int  i= 9;
//  double d = 4.5666;
//  float f =3.5f;
//  boolean b = true;


//  System.out.println("i="+i +" d="+d +" b="+b);

//  float sum2=i+f;


//  double sum = i+d;
//  System.out.println("the value of sum is :"+sum);
// System.out.println("the vslue of sum2 is ="+5sum2);


Scanner input = new Scanner(System.in);
System.out.println("enter a number");
int a;
a=input.nextInt();
System.out.println("enter 2nd number");
float f;
f=input.nextFloat();

float sum = a+f;

System.out.println("1st input num is : "+a +"  the sescond input number is : "+f+"  total sum is:="+sum);







    }
}
