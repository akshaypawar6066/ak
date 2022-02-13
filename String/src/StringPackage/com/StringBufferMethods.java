package StringPackage.com;

public class StringBufferMethods
{
     public static void main(String[] args) 
     {
		/* StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("akshay");
		System.out.println(sb.capacity());
		sb.append("Pawar");
		
		System.out.println(sb.capacity());
		sb.append("Akshay");
		System.out.println(sb.capacity());
		*/
		StringBuffer sb2=new StringBuffer("Akshay");
		System.out.println(sb2.length());       // 6
		System.out.println(sb2.append("Pawar"));   //AkshayPawar
		System.out.println(sb2.length());   // 11
		System.out.println(sb2.charAt(5));   // y
		System.out.println(sb2.delete(2, 5));   //AkyPawar
		System.out.println(sb2.deleteCharAt(0));  //kyPawar
		StringBuffer sb1=new StringBuffer("Akshay");
		System.out.println(sb1.deleteCharAt(0));
		System.out.println(sb2);
		
		StringBuffer s1=new StringBuffer("Akshay");   
		StringBuffer s2=new StringBuffer("Akshay");
		System.out.println(s1.equals(s2));   //equals() method of object class does not override by StringBuffer Class.
		
		StringBuffer s3=new StringBuffer("Akshay");   
		StringBuffer s4=s3.append("Pawar");
		System.out.println(s3.equals(s4));   //here equals() method check the object ref. are same or not.
		System.out.println(s3.indexOf("k"));
		System.out.println(s3.indexOf("ay"));
		StringBuffer s5=new StringBuffer("akshay");
		System.out.println(s5.indexOf("a"));
		System.out.println(s5.lastIndexOf("a"));
		System.out.println(s5.lastIndexOf("ha"));
		System.out.println(s5.insert(3,"zzz"));
		System.out.println(s5.replace(3, 7,"@"));
		StringBuffer s6=new StringBuffer("Akshay");
		System.out.println(s6.replace(3, 6,"@"));
		System.out.println(s6.reverse());
		StringBuffer s7=new StringBuffer("Akshay");
		System.out.println(s7.subSequence(3, 5));
		System.out.println(s7.substring(3));
		System.out.println(s7.substring(3,5));
		System.out.println(s7.toString());
		StringBuffer s8=new StringBuffer("Akshay");
		System.out.println(s8.capacity());
		s8.ensureCapacity(100);
		System.out.println(s8.capacity());
		s8.setCharAt(2, '@');
		System.out.println(s8);
		s8.setLength(4);
		System.out.println(s8);
		System.out.println(s8.capacity());
		System.out.println(s8);
		s8.trimToSize();
		System.out.println(s8.capacity());
     }
     
}
