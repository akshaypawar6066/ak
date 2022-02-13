package PracticeSet;

public class StringClassMethods
  {
     public static void main(String[] args) 
     {
    	 /*
		String a="Akshay";
		String b="akshay";
		String c=new String("Akshay");
		String d=new String("Akshay");
	/*	System.out.println(a==b); //Address comparison of string.
		System.out.println(c==d);
		System.out.println(a==c);
		System.out.println(a==d);
		
		
	     b="Velocity";
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(a==b);
		 
		b="Akshay";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.equalsIgnoreCase(b));
		*/
		String s1="Akshay";
		String s2="Java";
	//	s1=s1.concat(s2);
		/* System.out.println(s1);
		s1=(s1+s2);
		System.out.println(s1);
		s1=(s1+30/10);
		System.out.println(s1);
		System.out.println(s1.length());
		s1=s1.concat("Java");
	   System.out.println(s1);
	   String s3="Java";
	   System.out.println(s2+10+s3);
	   System.out.println(10+20+s2);
	   System.out.println(20+s2);
	   System.out.println(s2+10+20);
	   System.out.println(s1.charAt(5));
	   System.out.println(s1.indexOf("k"));
	   System.out.println(s1.length());
	   System.out.println(s1.lastIndexOf("a"));
	   System.out.println(s1.lastIndexOf("Jav"));
	   System.out.println(s1.substring(5));
	   System.out.println(s1.substring(5,10));
	   
	   System.out.println(s1);
	   String t="";
	   for(int i=s1.length()-1;i>=0;i--)
	   {
		   System.out.println(s1.charAt(i));
		  t=t+s1.charAt(i);
	   }
	    s1=t;
	   System.out.println(s1);
	   */
		String a="Akshay";
		String b="Pawar";
		System.out.println(a.isEmpty());  //Return boolean value based on condn.
		System.out.println(String.join(",", s1,s2));
		System.out.println(a.subSequence(1, 5));
		String c="This is demo";
		System.out.println(String.join(",", a,s2,c));
		System.out.println(c.replace("is", "was"));
		System.out.println(c.replaceFirst("is","was"));
		System.out.println(c.replaceAll("is(.*)", "was"));
		System.out.println(c.replaceAll("is(.)", "was"));
		System.out.println(c.contains("is "));
		System.out.println(c.startsWith("Th"));
		System.out.println(c.endsWith("mom"));
		char[]d=c.toCharArray();
		System.out.println(d);
		System.out.println(d.length);
		System.out.println(c.length());
		String z="  Akshay   ";
		System.out.println(z);
		System.out.println(z.trim());
		String x="  Akshay  Pawar ";
		System.out.println(x);
		System.out.println(x.trim());
		String j="Akshay";
		String k="akshay";
		System.out.println(j.compareTo(k));  //Return o/p in integer form.
		String l="Akshay";
		String m="Akshay";
		System.out.println(l.compareTo(m));
		System.out.println(j.compareToIgnoreCase(k));
		
		int p=10;
		String g=String.valueOf(p);
		System.out.println(g);
		String f="My name is bond";
		String h[]=f.split(" ");
		for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]);
		}
		
     }
  }
