package Questions;

import java.util.Scanner;



class linklist{
	 Node head;
	 
	 public void insertbeg(int data){
		 Node temp=new Node(data);
		 if(head==null){
			 head=temp;
			 temp.next=null;
		 }
		 else{
			 temp.next=head;head=temp;
		 }
		 
	 }
	 public void print(){
		 Node temp=head;
		 while(temp!=null){
			 System.out.print(temp.data + " ");
			 temp=temp.next;
		 }
	 }
	 public void crete_loop(){
		 Node ptr=head;
		 while(ptr.next!=null){
			 ptr=ptr.next;
		 }
		 ptr.next=head.next.next.next.next;
	 }
	 public void remove_loop(Node ptr){
		 Node ptr1=ptr.next;
		 while(ptr1.next!=ptr){
			 ptr1=ptr1.next;
		 }
		 ptr1.next=null;
	 }
	 public void detect_loop(){
		 Node slow=head;
		 Node fast=head;
		 while(slow!=null && fast!=null && fast.next!=null){
			 
			 slow=slow.next;
			 fast=fast.next.next;
			 if(slow==fast){
				 remove_loop(slow);
				 System.out.println("Loop removed");
				 return ;
			 }
		 }
		 
	 }
	 
}


public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		linklist list=new linklist();
		while(num!=0){
			list.insertbeg(num);
			num=sc.nextInt();
		}
		list.crete_loop();
		list.detect_loop();
		list.print();
sc.close();
	}

}
