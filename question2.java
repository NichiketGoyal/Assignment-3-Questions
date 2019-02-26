package Questions;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
}

class link{
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
}


public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		link list=new link();
		while(num!=0){
			list.insertbeg(num);
			num=sc.nextInt();
		}
		list.sort();
		list.print();
		sc.close();
	}

}
