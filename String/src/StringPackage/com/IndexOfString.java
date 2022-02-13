package StringPackage.com;

public class IndexOfString 
{
	public static void main(String[] args)
	{
		String s1="Maharastra";
		int i=s1.indexOf('a');
		 System.out.println(i);
		 i=s1.indexOf('a', 7);
		System.out.println(i);
		int k=s1.indexOf("ras");
		System.out.println(k);
		 k=s1.indexOf("ras", 4);
		System.out.println(k);
		i=s1.lastIndexOf('t');
		System.out.println(i);
		i=s1.lastIndexOf('t',2);
		System.out.println(i);
		i=s1.lastIndexOf("ras");
		System.out.println(i);
		i=s1.lastIndexOf("ras", 3);
		System.out.println(i);
		
	}
  
  
}
