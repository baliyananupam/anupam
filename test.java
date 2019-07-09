class message
{
public void show()
{
System.out.println("message");
}
}
class mobile extends message
{
public void show()
{
System.out.println("hello nokia");
}
}
class tv extends message
{
public void show()
{
System.out.println("hello samsung");
}
}
class test
{
public static void main(String arg[])
{
mobile obj1=new mobile();
obj1.show();
tv obj2=new tv();
obj2.show();
}
}