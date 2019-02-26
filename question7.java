package Questions;
import java.util.Scanner;

/*class DNode{
	int data;
	DNode next;
	DNode previous;
	DNode(int data){
		this.data=data;
		this.previous=null;
		this.next=null;
	}
}*/
class circular_list{
	DNode head;
	DNode tail;
	public void print(){
		DNode temp=head;
		if(temp==null){
			System.out.println("List is empty");
		}
		else{
			System.out.print(temp.data + " ");
			temp=temp.next;
			while(temp!=head){
				System.out.print(temp.data + " ");
				temp=temp.next;
			}
		}
	}
	
	public void insert_end(int data){
		DNode node=new DNode(data);
		DNode temp;
		if(head==null){
			head=node;
			node.next=node;
			node.previous=node;
		}
		else{
			temp=head;
			while(temp.next!=head){
				temp=temp.next;
			}
			temp.next=node;
			node.next=head;
			head.previous=node;
			node.previous=temp;
			tail=node;
		}
	}
	public void insert_beg(int data){
		DNode node=new DNode(data);
		
		if(head==null){
			head=node;
			node.next=node;
			node.previous=node;
		}
		else{
			node.next=head;
			node.previous=head.previous;
			head.previous.next=node;
			head.previous=node;
			head=node;
		}
	}
	public void insert_pos(int data,int pos){
		DNode node=new DNode(data);
		
		int count=1;
		if(head==null){
			insert_beg(data);
		}
		else{
			DNode temp=head;
			while(count!=pos && temp.next!=head ){
				count++;
				temp=temp.next;
			}
			if(temp==tail){
				tail=node;
			}
			node.previous=temp.previous;
			node.next=temp;
			temp.previous.next=node;
			temp.previous=node;
		}
	}
	
public void print_ele(int data){
	DNode temp=head;
	while(temp.data!=data && temp.next!=head){
		temp=temp.next;
	}
	if(temp.data!=data && temp.next==head){
		System.out.println("Element not found");
		return;
	}
	DNode ptr=temp;
	while(temp.next!=ptr){
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println(temp.data);
}



	
}

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular_list list=new circular_list();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=0)
		{
			list.insert_beg(num);
			num=sc.nextInt();
		}
		System.out.println("Enter data from where you want to print");
		list.print_ele(	num=sc.nextInt());
		
		
	sc.close();
	}

}
