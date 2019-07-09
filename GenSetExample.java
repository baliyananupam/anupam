import java.io.*;
class GenSetExample
{
public static void main(String arg[])
{
Set<String>set=new HashSet<String>();
set.add("one");
set.add("second");
set.add("3rd");
set.add(new Integer(55));
System.out.println(set);
}
}