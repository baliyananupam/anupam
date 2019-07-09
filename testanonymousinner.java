abstract class person
{
abstract void eat();
}
abstract class testanonymousinner
{
public static void main(String arg[])
{
person p=new person()
{
void eat()
{
System.out.println("nice fruits");
}
};
p.eat();
}
}