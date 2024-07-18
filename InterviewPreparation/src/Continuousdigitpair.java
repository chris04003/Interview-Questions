import java.util.Scanner;
public class Continuousdigitpair {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
String b=Long.toString(a);
int count=0;
for(int i=0;i<b.length()-1;i++)
{
	char curr=b.charAt(i);
	char next=b.charAt(i+1);
	String curr1=Character.toString(curr);
	String next1=Character.toString(next);
	int c=Integer.parseInt(curr1);
	int d=Integer.parseInt(next1);
	
	if(d==c+1||d==c-1)
	{
		count++;
	}
	
}

    System.out.print(count);
	
}

}

	
	
