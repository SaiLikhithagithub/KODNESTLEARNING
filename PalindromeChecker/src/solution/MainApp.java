package solution;

public class MainApp {
	public void palindrome(int original)
	{
		int n=original;
		int rev=0;
	while(n>0)
	{
		int lastdigit=n%10;
		rev=rev*10+lastdigit;
		n=n/10;
	}
	if(rev==original)
	{
		System.out.println("Palindrome");
	}
	}
	
}
