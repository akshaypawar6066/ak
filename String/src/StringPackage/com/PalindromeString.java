package StringPackage.com;

public class PalindromeString 
{
 public static void main(String[] args) 
 {
	String s="madam";
	String reverse="";
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
	if(s.equals(reverse))
	{
		System.out.println("Given string is palindrome");
	}
	else
	{
	System.out.println("Given string is not palindrome");	
	}
 }
}
