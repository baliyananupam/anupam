class info
{
String fname,lname;
info(String fname,String lname)
{
this.fname=fname;
this.lname=lname;
}
void disp()
{
System.out.println("user name:"+fname+" "+lname);
}
public static void main(String arg[])
{
info obj=new info("anupam","baliyan");
obj.disp();
}
}