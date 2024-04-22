package pkg1;

public class Palindrome_number {

	public static void main(String[] args) 
	{
	   int n=1001,res=0;
	   int temp;
	   int rem;
	   temp=n;
	   while(n>0)
	   {
		   rem=n%10;
		   res=(res*10)+rem;
		  n=n/10; 
		   
	   }
	   if(temp==res)
	   {
		   System.out.println("palindrome no");
	   }
	   else
	   {
		   System.out.println("not palindrome");
	   }
	}

}
