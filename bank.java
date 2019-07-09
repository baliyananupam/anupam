import java.io.*;
class myException extends Exception
{
myException(String msg)
{
super(msg);
}
}
class bank
{
public static void main(String arg[])
{
int bal=10000;
int avbal,amt;
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the amount:");
amt=Integer.parseInt(br.readLine());
avbal=bal-amt;
if(avbal<0)
{
System.out.println("you do not have enough amount");
}
else
{
System.out.println("success..........");
}
}
catch(Exception e)
{
System.out.println("error:"+e);
}
}
}