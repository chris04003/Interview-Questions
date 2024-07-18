import java.util.Scanner;
public class longestsubstring {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String maxString="";
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length();j++) {
				String s1=str.substring(i,j);
				StringBuilder ss1=new StringBuilder(s1);
				StringBuilder ss2=ss1.reverse();
				if(ss1==ss2)
				{
					if(ss1.length()>maxString.length())
					{
						maxString=ss1.toString();
					}
				}
			}
		}
		System.out.print(maxString);
	}
	
	

}
