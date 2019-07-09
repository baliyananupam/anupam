import java.io.*;
class switchdemo
{
 public static void main(String arg[])throws IOException
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter 1 to create folder");
System.out.println("enter 2 to delete folder");
System.out.println("enter 3 to rename folder");
System.out.println("enter 4 to open folder");
n=Integer.parseInt(br.readLine());

switch(n)
{
 case 1:
 System.out.println("file is created");
 break;

 case 2:
 System.out.println("file is deleted");
 break;

case 3:
 System.out.println("file is renamed");
 break;

case 4:
 System.out.println("file is opened");
 break;

default:
 System.out.println("invalid option");
 break;
}
}
}