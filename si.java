import java.io.*;

class si
{
 public static void main(String arg[])throws IOException
{
 int p,t;
 float r,si;

 InputStreamReader sr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(sr);

 System.out.println("enter the principal");
 p=Integer.parseInt(br.readLine());
 
 System.out.println("enter the time");
 t=Integer.parseInt(br.readLine());

 System.out.println("enter the rate");
 r=Float.parseFloat(br.readLine());

 si=(p*r*t)/100;

 System.out.println("the simple interest :"+si);
}
}