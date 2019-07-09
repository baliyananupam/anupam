class M implements Runnable
{
int i;
public void run()
{
try
{
for(i=0;i<10;i++)
{
System.out.println("M");
Thread.Sleep(1000);
}
}
catch(Exception e)
{
}
}
}
class R implements Runnable
{
int i;
public void run()
{
try
{
for(i=0;i<10;i++)
{
System.out.println("R");
Thread.Sleep(1000);
}
}
catch(Exception e)
{
}
}
}
class threadDemo
{
public static void main(String arg[])
{
M o1=new M();
R o2=new R();

Thread t1=new Thread(01);
Thread t2=new Thread(02);
t1.Start();
t2.Start();
}
}