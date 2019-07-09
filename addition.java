import java.io.*;

class addition
{
 public static void main(String arg[])throws IOException
{
 int a,b,c;

 InputStreamReader sr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(sr);

 System.out.print("enter the first number :");
 a=Integer.parseInt(br.readLine());
 
 System.out.print("enter the second number :");
 b=Integer.parseInt(br.readLine());

 c=a+b;

 System.out.print("sum of the two numbers is :"+c);
 }
 }