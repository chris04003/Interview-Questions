import java.util.*;

public class maximumsubarray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int [] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		int maxsum=Integer.MIN_VALUE;
		int currsum=0;
		int s=0,start=0,end=0;
		
		for(int i=0;i<a;i++) {
			currsum+=arr[i];
			if(currsum>maxsum)
			{
				maxsum=currsum;
				start=s;
				end=i;
			}
			
			if(currsum<0)
			{
				s=i+1;
				currsum=0;
			}
			
			
			System.out.println("The Maximum sum is "+ maxsum);
			
			System.out.println(start+"  "+end);
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
