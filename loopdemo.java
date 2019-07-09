import java.io.*;
class loopdemo
{
 public static void main(String arg[])throws IOException
{
 int n,i=1;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter the number for table");
 n=Integer.parseInt(br.readLine());
 System.out.println("table for the no. is");

do
{
System.out.println(n+"x"+i+"="+n*i);
i++;
}while(i<=10)
}
 }