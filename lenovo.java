import java.io.*;

class mobile
{
 String m;
 int p;

 void accept()throws IOException
{
 InputStreamReader sr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(sr);

 System.out.println("enter the model you are looking for :");
 m=br.readLine();

 System.out.println("enter the price :");
 p=Integer.parseInt(br.readLine());
}
 void display()
{
 System.out.println("the model name and its price is :"+m+" "+p);
}
public static void main()throws IOException
{
 mobile obj=new mobile();
 obj.accept();
 obj.display();
}
}