class Outer
{
private static int data=30;
static class Inner
{
void msg()
{
System.out.println("data is :"+data);
}
}
public static void main(String arg[])
{
Outer.Inner obj2=new Outer.Inner();
obj2.msg();
}
}