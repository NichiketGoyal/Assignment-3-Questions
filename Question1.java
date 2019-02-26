package Questions;
import java.util.Scanner;
class Node1{
char data;
Node1 next;
Node1(char c){
	this.data=c;
	next=null;
}
}


class LinkedListChar{
	Node1 head;
	Node1 head2;
	
	public void insertend(char data){
		 Node1 node=new Node1(data);
		 Node1 temp=head;
		 if(head==null){
			 head=node;
		 }
		 else{
			 while(temp.next!=null){
				 temp=temp.next;
			 }
			 temp.next=node;
		 }
	 }
	public void reverse(){
		Node1 temp=head;

		while(temp!=null){
			Node1 node=new Node1(temp.data);
			if(head2==null){
				head2=node;
			}
			
			else{
				node.next=head2;
				head2=node;
			}
			
			temp=temp.next;
		}
	}
	
	public int check(){
		Node1 ptr=head;
		Node1 ptr2=head2;
		while(ptr!=null && ptr2!=null){
			if(ptr.data!=ptr2.data){
				return 0;
			}
			ptr=ptr.next;ptr2=ptr2.next;
		}
		if(ptr!=null){
			return 0;
		}
		if(ptr2!=null){
			return 0;
		}
		
		return 1;
	}
	public void print(){
		Node1 temp=head2;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListChar list=new LinkedListChar();
		
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		while(c!='0'){
			list.insertend(c);
			c=sc.next().charAt(0);
		}
		list.reverse();
		list.print();
		int num=list.check();
		if(num==1){
			System.out.println("It is a pallindrome");
		}
		else{
			System.out.println("It is not a pallindrome");

		}
	
sc.close();
	}
	}
