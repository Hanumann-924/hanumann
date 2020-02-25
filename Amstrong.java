class Amstrong 
{
	public static void main(String arg[])
	{
		int n=371,num,r,result=0;
		num=n;
		while(num!=0)
		{
			r=num%10;
			result=result+r*r*r;
			num/=10;
		}
		if(result==n)
		{
			System.out.println(n+"is a amstrong number");
		}
		else
			System.out.println(n+"is not a amstrong number");
	}
}