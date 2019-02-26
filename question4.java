package Questions;

import java.util.Scanner;



class DNode{
	int data;
	DNode next;
	DNode previous;
	DNode(int data){
		this.data=data;
		this.previous=null;
		this.next=null;
	}
}
class DoublyList{
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
		
public void del_node(DNode ptr){
	DNode p1=head;
	while(p1.next!=ptr){
		p1=p1.next;
	}
	p1.next=ptr.next;
}

public void remove_alter(){
	int count=1;
	DNode ptr=head;
while(ptr!=null){
	if(count%2==0){
		DNode temp=ptr;
		count++;
		ptr=ptr.next;
		del_node(temp);
		
	}
	else{
		count++;
		ptr=ptr.next;
	}

}	
	}


}
		

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyList list=new DoublyList();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=0){
			list.insert_end(num);
			num=sc.nextInt();
		}
		list.remove_alter();
		list.print();
		sc.close();
	}

}
