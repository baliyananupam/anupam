import java.io.*;
public class FHDemo
{
public static void main(String arg[])
{
try
{
FileInputStream fin=new FileInputStream ("testout.txt");
int i=0;
while((i=fin.read())!=-1)
{
System.out.println((char)i);
}
fin.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}