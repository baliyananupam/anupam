import java.io.*;

class cust_info
{
 public static void main(String arg[])throws IOException
 {
  String name;
  
  InputStreamReader sr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(sr);
  
  System.out.println("enter your sweet name : ");
  name=br.readLine();

  System.out.println("your name is :"+name);
  }
 }

  