package StringPackage.com;

public class StringBuilderBasic
{
  public static void main(String[] args) 
  {		 
	 StringBuilder sb1=new StringBuilder();
	 System.out.println(sb1.capacity());
	 sb1.append("HEllo");
	 System.out.println(sb1);
	 System.out.println(sb1.length());
   }
}
