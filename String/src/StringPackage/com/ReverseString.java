package StringPackage.com;

public class ReverseString 
{
public static void main(String[] args)
{
	String s="Akshay";
	String reverse="";
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
	s=reverse;
	System.out.println("Reverse String:"+s);
}
}
