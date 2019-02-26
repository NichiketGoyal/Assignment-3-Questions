package Questions;
import java.util.Scanner;

/*class Node{
int data;
Node next;

Node(int data){
	this.data=data;
}
}*/

class List{
	Node head;
	 
	public void insertend(int data){
		 Node node=new Node(data);
		 Node temp=head;
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
	 public void print(){
		 Node temp=head;
		 while(temp!=null){
			 System.out.print(temp.data + " ");
			 temp=temp.next;
		 }
	 }
	 public void merge(Node head2){
		 Node Final_head=null;
		 Node temp=Final_head;
		 Node ptr1=head;
		 Node ptr2=head2;
		 while(ptr1!=null && ptr2!=null){
			 if(ptr1.data<ptr2.data){
				 if(Final_head==null){
					 Final_head=ptr1;
					 head=head.next;
					 temp=Final_head;
					 temp.next=null;
				 }
				 else{
				 temp.next=ptr1;
				 temp=temp.next;
				 head=head.next;
				 temp.next=null;}
			 }
			 else{
				 if(Final_head==null){
					 Final_head=ptr2;
					 head=head.next;
					 temp=Final_head;
					 temp.next=null;
				 }
				 else{
					 temp.next=ptr2;
					 head2=head2.next;
					 temp=temp.next;
					 temp.next=null;
				 }
				 
			 }
			 
			 
			 ptr1=head;
			 ptr2=head2;
		 }
		 if(ptr1!=null){
			 temp.next=ptr1;
		 }
		 if(ptr2!=null){
			 temp.next=ptr2;
		 }
		 head=Final_head;
	 }
	 
	 
	 
}


public class question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List list1=new List();
		List list2=new List();
		System.out.println("Enter elements of First List");
		int num=sc.nextInt();
		while(num!=0){
			list1.insertend(num);
			num=sc.nextInt();
		}
		System.out.println("Enter elements of Second List");
		num=sc.nextInt();
		while(num!=0){
			list2.insertend(num);
			num=sc.nextInt();
		}
		list1.merge(list2.head);
		list1.print();
		sc.close();

	}

}
