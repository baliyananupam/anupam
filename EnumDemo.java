class EnumDemo
{
enum Day(SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY);
public static void main(String arg[])
{
Day day=Day.SATURDAY;

switch(day)
{
case SUNDAY:
System.out.println("sunday");
case MONDAY:
System.out.println("monday");
break;
default:
System.out.println("other day");
}
}
}
