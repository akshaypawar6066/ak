package StringPackage.com;

public class DuplicateString 
{
	public static void main(String[] args) 
	{
		String []a= {"Akshay", "Rahul","Rajat","Shubham","Jyoti","Pooja","Rahul"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("The duplicate string is:"+a[i]);
				}
			}
		}
	}
}
