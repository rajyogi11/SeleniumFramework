package Programs40;

public class ArmstrongNumberUsingForloop {
	
public static void main(String[] args) {
	
	int n=153;
	int temp=n;
	int sum=0,r;
	
	//while(n>0)
		for(int i=0;i<=temp;i++)
	{
		r= n%10;
		
		n=n/10;
		
		sum= sum+(r*r*r);  // pallindrome and armstromg only this logic change
		
	}
	
	if(temp==sum)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Not armstrong number");
	}
	
	

}

}
