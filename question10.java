package Questions;

import java.util.Scanner;

/*
class DNode{
	int data;
	DNode next;
	DNode previous;
	DNode(int data){
		this.data=data;
		this.previous=null;
		this.next=null;
	}
}*/
class q10{
	DNode head;
	DNode tail;
	public void insert_end(int data){
		DNode node=new DNode(data);
		if(head==null){
			head=node;
			tail=node;
		}
		else{
		DNode temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		node.previous=temp;
		tail=node;
		}
	}
	public void print(){
		DNode temp=head;
		if(head!=null){
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		}
	}
	public void rotate(int rotations){
		int count=0;
		DNode temp=head;
		if(head==null){
			System.out.println("The list is empty");
			return ;
		}
		while(count < rotations){
			temp=temp.next;
			if(temp==null){
				temp=head;
			}
			count++;
		}
		tail.next=head;
		head.previous=tail;
		tail=temp.previous;
		head=temp;
		head.previous=null;
		tail.next=null;
	}
	
}

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		q10 list=new q10();
	int num=sc.nextInt();
	while(num!=0){
		list.insert_end(num);
		num=sc.nextInt();
	}
	System.out.println("Enter the number of rotaions you want");
	num=sc.nextInt();
	list.rotate(num);
	list.print();
	sc.close();
	}

}
