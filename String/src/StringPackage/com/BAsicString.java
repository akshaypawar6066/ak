package StringPackage.com;

public class BAsicString 
{
  
  public static void main(String[] args) 
  {
	 String s1="Akshay";
	 String s2="Akshay";
	 String s3=new String("Akshay");
	System.out.println("Result1:"+(s1==s2));        //True
	System.out.println("Result2:"+s1.equals(s2));   // True
	System.out.println("Result3:"+(s1==s3));      //FAlse
	System.out.println("Result4:"+s1.equals(s3));              // True
	String s="Name=Akshay and Roll_no=101";
	System.out.println(s);
  }
}
