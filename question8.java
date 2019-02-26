package Questions;

import java.util.Scanner;
class Node3{
	int data;
	Node3 next;
	
	Node3(int data){
		this.data=data;
	}
}

class q8{
	Node3 head;
	public void insertend(int data){
		 Node3 node=new Node3(data);
		 Node3 temp=head;
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
		 Node3 temp=head;
		 while(temp!=null){
			 System.out.print(temp.data + " ");
			 temp=temp.next;
		 }
	 }
	 public int count(Node3 root){
		 Node3 temp=root;
		 int count=0;
		 while(temp!=root){
			 count++;
			 temp=temp.next;
		 }
		 return count;
	 }
	 
	 public Node3 get_intersection(Node3 root){
		 Node3 ptr=null;
		
		 int s1=count(head);
		 int s2=count(root);
		 int dif;
		 if(s1>s2){
			 Node3 temp1=head,temp2=root;
			 dif=s1-s2;
			 return point(temp1,temp2,dif);
			 /*		 for(int i=0;i<dif;i++){
				 if(temp1==null){
					 System.out.println("diff less");
					 return ptr;
				 }
				 temp1=temp1.next;
			 }
			 while( temp1!=null && temp2!=null){
				 if(temp1==temp2){
					 System.out.println("Found");
					 return temp1;
				 }
				 temp1=temp1.next;
				 temp2=temp2.next;
			 }
*/
		 }
		 else{
			 
				 Node3 temp2=head,temp1=root;
				 dif=s2-s1;
				 return point(temp1,temp2,dif);}
				 /*for(int i=0;i<dif;i++){
					 if(temp1==null){
						 System.out.println("diff less");
						 return ptr;
					 }
					 temp1=temp1.next;
				 }
				 while( temp1!=null && temp2!=null){
					 if(temp1==temp2){
						 System.out.println("Found");
						 return temp1;
					 }
					 temp1=temp1.next;
					 temp2=temp2.next;
				 }
				 
			 
			 
		 }
		 System.out.println("returning null");
		 return ptr;*/
	 }
	 public Node3 point(Node3 temp1,Node3 temp2,int dif){
		 Node3 ptr=null;
		 for(int i=0;i<dif;i++){
			 if(temp1==null){
				 //System.out.println("diff less");
				 return ptr;
			 }
			 temp1=temp1.next;
		 }
		 while( temp1!=null && temp2!=null){
			 if(temp1==temp2){
				 System.out.println("Found");
				 return temp1;
			 }
			 temp1=temp1.next;
			 temp2=temp2.next;
		 }
		 System.out.println("returned");
		 return ptr;
	 }
	 public Node3 create_intersection(Node3 root){
		 Node3 temp=root;
		 Node3 ptr=head;
		 while(temp.next!=null){
			 temp=temp.next;
			// System.out.println("moving");
		 }
		 temp.next=ptr.next.next.next.next.next;
		// System.out.println("moved");
		 return root;
	 }
}
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		q8 list=new q8();
		q8 list2=new q8();
		int num=sc.nextInt();
		while(num!=0){
			list.insertend(num);
			num=sc.nextInt();
		}
		 num=sc.nextInt();
			while(num!=0){
				list2.insertend(num);
				num=sc.nextInt();
			}
		list2.head=list.create_intersection(list2.head);
		Node3 ptr=list.get_intersection(list2.head);
		list2.print();
		
		System.out.println("Data of intersecting node was" + ptr.data);
		sc.close();
	}

}
