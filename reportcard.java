import java.io.*;

class reportcard
{
 public static void main(String arg[])throws IOException
{
 int a,b,c,d,e,f;
 float g;

 InputStreamReader sr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(sr);

 System.out.println("enter the marks of first subject: ");
 a=Integer.parseInt(br.readLine());

 System.out.println("enter the marks of second subject: ");
 b=Integer.parseInt(br.readLine());

 System.out.println("enter the marks of third subject: ");
 c=Integer.parseInt(br.readLine());

 System.out.println("enter the marks of fourth subject: ");
 d=Integer.parseInt(br.readLine());

 System.out.println("enter the marks of fifth subject: ");
 e=Integer.parseInt(br.readLine());

 f=a+b+c+d+e;
 g=f/5;

 System.out.println("total marks : "+f);

 System.out.println("percentage : "+g);
}
}