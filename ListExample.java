import java.util.*;
class ListExample
{
public static void main(String arg[])
{
List list=new ArrayList();
list.add("one");
list.add("second");
list.add("3rd");
list.add(new Integer(4));
list.add(new Float(5.0F));
System.out.println(list);
}
}