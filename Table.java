class Table
{
Synchronized void printTable(int n)
{
for(int i=1;i<=5;i++)
{
System.out.println("n*i");
try
{
Thread.Sleep(400);
}
catch(Exception e)
{
System.out.println("e");
}
}
}
}