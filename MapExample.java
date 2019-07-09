import java.util.*;
class MapExample
{
public static void main(String arg[])
{
Map map=new HashMap();
map.put("one","1st");
map.put("second",new Integer(2));
map.put("third","3rd");
map.put("third","iii");
Set set1=map.keySet();
Collection collection=map.values();
Set set2=map.entrySet();
System.out.println(set1);
System.out.println(set2);
System.out.println(collection);
}
}