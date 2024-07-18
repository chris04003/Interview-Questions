import java.util.*;
public class findmissingnumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Hash Array is ");
		int hash[]=new int[a+1];
		for(int i=0;i<a-1;i++) {
			hash[arr[i]]++;
			System.out.println("for i "+i +" "+arr[i]+"  "+hash[arr[i]]+"  ");
		}
		
		System.out.println();
		for(int i=1;i<=a;i++) {
			if(hash[i]==0) {
			System.out.print(i);
		}
	}
		
	}}

