import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		next=null;
	}
		
}



public class LinkedList {

	
	public static Node main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		Node head=new Node(a);
		Node curr=head;
		
		while(true) {
			
			int ab=sc.nextInt();
			
			if(ab==-1) {
				break;
			}
			
			Node newhead =new Node(ab);
			curr.next=newhead;
			curr=newhead;
				
		}
		
		sc.close();
		return curr;
		
		
	}
	
}
