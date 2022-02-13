package StringPackage.com;

public class MaximumCharString 
{
// Write a program to find maximum occurring characters in string.
  
	public static void main(String[] args)
	{
		String s="aabbbcccd$$$%%%%";
		int []arr=new int[127];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int max=-1;
		char c=' ';
		for(int i=0; i<s.length()-1;i++)
		{
			if(max<arr[s.charAt(i)])
			{
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
			
		}
		System.out.println("Maximum repeted charecter is:"+c);
		
		
	}
}
