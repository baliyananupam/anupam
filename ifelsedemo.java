import java.io.*;

class ifelsedemo
{
 public static void main(String arg[])throws IOException
{
 String uname,pass;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter the username:");
 uname=br.readLine();
 System.out.println("enter the password");
 pass=br.readLine();

if(uname.equals("niit") && pass.equals("admin"))
{
 System.out.println("login success..........");
}
else
{
 System.out.println("username and password are incorrect");
}
}
}