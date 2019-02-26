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

class DoubleList{
	DNode head;
	DNode tail;
	public void insert_beg(int data){
		DNode node=new DNode(data);
		if(head==null){
			head=node;
			tail=node;
		}
		else{
			node.next=head;
			head.previous=node;
			head=node;
		}
	}
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
	public DNode clone(){
		DNode root=null;
		DNode rTail=null;
		DNode temp=head;
		
		while(temp!=null){
		DNode node=new DNode(temp.data);
			if(root==null){
				root=node;
				rTail=node;
				
		}
			else{
				rTail.next=node;
				node.previous=rTail;
				rTail=node;
				
			}
			temp=temp.next;
		}
		return root;
	}
	public void print1(DNode root){
		DNode temp=root;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
		
}

public class question9 {

	public static void main(String[] args) {
		DoubleList list=new DoubleList();
		Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	while(num!=0){
		list.insert_end(num);
		num=sc.nextInt();
	}
	DNode root=list.clone();
		list.print1(root);
		sc.close();
	}

}

