import java.io.*;
class login
{
 public static void main(String arg[])throws IOException
{
String uname,pass;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the username:");
uname=br.readLine();
System.out.println("enter the password");
pass=br.readLine(); 

if(uname.equals("niit"))
{
 if(pass.equals("admin"))
{
 System.out.println("login success..........");
}
 else
{
 System.out.println("password is incorrect");
}
}
else
{
System.out.println("username is incorrect");
}
}
}
