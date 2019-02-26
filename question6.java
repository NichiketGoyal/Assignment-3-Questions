package Questions;

import java.util.Scanner;

/*class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
}*/

class q6{
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
	 
	 public void sort(){
		 Node temp=head;
		 
		 while(temp!=null){
			 Node temp2=temp.next;
			 while(temp2!=null){
				 if(temp.data>temp2.data){
					 int num;
					 num=temp.data;
					 temp.data=temp2.data;
					 temp2.data=num;
				 }
				 temp2=temp2.next;
			 }
			 temp=temp.next;
		 }
		 
	 }
	 public void remove_duplicate(){
		 Node ptr=head;
		 Node temp;
		 while(ptr.next!=null){
			 if(ptr.data==ptr.next.data){
				 temp=ptr.next;
				 ptr.next=temp.next;
				 temp.next=null;
			 }
			 else{
				 ptr=ptr.next;
			 }
		 }
	 }
}





public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		q6 list=new q6();
		int num=sc.nextInt();
		while(num!=0){
			list.insertbeg(num);
			num=sc.nextInt();
		}
		list.sort();
		list.remove_duplicate();
		list.print();
		sc.close();
	}

}
