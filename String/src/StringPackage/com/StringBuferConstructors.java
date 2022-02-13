package StringPackage.com;

public class StringBuferConstructors
{
 public static void main(String[] args)
    {
	 StringBuffer sb=new StringBuffer();
	 System.out.println(sb.capacity());
	 
	 StringBuffer sb1=new StringBuffer("Akshay");
	 System.out.println(sb1.capacity());
	 StringBuffer sb2=new StringBuffer(1000);
	 System.out.println(sb2.capacity());
	 StringBuffer sb3=new StringBuffer('A');
	 System.out.println(sb3.capacity());
	 
    }
}
