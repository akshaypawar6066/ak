package StringPackage.com;

public class TypeConvesion
{
public static void main(String[] args)
   {
	String s="Akshay";
	int a=10; int b=20;
	System.out.println(a+b);   //30
	String s1=String.valueOf(a);
	String s2=String.valueOf(b);
	System.out.println(s1+s2);  //1020
	 char []c=(s.toCharArray());
	System.out.println(c);
   } 
}
