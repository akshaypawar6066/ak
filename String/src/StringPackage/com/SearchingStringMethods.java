package StringPackage.com;

public class SearchingStringMethods
{
public static void main(String[] args)
{
	String s="akshayakshay";
	int i=s.indexOf('a');
	System.out.println(i);
	System.out.println(s.lastIndexOf('a'));
	System.out.println(s.indexOf("sh"));
	System.out.println(s.lastIndexOf("sh"));
	System.out.println(s.indexOf('k',7));
	System.out.println(s.lastIndexOf('k',6));
	System.out.println(s.lastIndexOf("sh",9));
	System.out.println(s.charAt(10));
  boolean b=(s.contains("sh"));
  boolean b1=(s.contains("shk"));
  System.out.println(b+","+b1);
  boolean m=(s.startsWith("ak"));
  System.out.println(m);
  boolean b3=(s.endsWith("ay"));
  System.out.println(b3);
  boolean b4=(s.endsWith("ak"));
  System.out.println(b4);
  
  
}
}
