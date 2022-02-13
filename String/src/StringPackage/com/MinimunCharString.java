package StringPackage.com;

public class MinimunCharString 
{
  public static void main(String[] args)
  {
	  String s="aabbbcccdddddd$$$%%%%";
		int []arr=new int[127];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int min=Integer.MAX_VALUE;
		char c=' ';
		for(int i=0; i<s.length()-1;i++)
		{
			if(arr[s.charAt(i)]<min)
			{
				min=arr[s.charAt(i)];
				c=s.charAt(i);
			}
			
		}
		System.out.println("Minimum repeted charecter is:"+c);
		
  }
}
