import java.io.*;
class add
{
public static void main(String arg[])
{
int n1,n2,res=0;
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the first number:");
n1=Integer.parseInt(br.readLine());
System.out.println("enter the second number:");
n2=Integer.parseInt(br.readLine());
res=n1/n2;
System.out.println("result is:"+res);
}
catch(Exception e)
{
System.out.println("error:"+e);
}
finally
{
System.out.println("result is:"+res);
}
}
}