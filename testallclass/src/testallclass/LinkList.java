package testallclass;

public class LinkList {

<<<<<<< HEAD
	protech
=======
	Node Head;
	class Node{
		int data;
		Node next;
	}
	public void insert(int data){
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(Head==null){
			Head=node;
		}else{
			Node n=Head;
			while(n.next!=null){
				n= n.next;
			}
			n.next=node;
			
		}
	}
	public void show(){
		Node node= Head;
		while(node.next!=null){
			System.out.println("data-->"+node.data+" node-->"+node.next);
			node=node.next;
		}
		System.out.println("data-->"+node.data+" node-->"+node.next);
	}
	
	public void insertAtStart(int data){
		Node n = new Node();
		n.data=data;
		n.next=null;
		n.next=Head;
		Head=n;
	}
	public void insertDataIndex(int index,int data){
		Node node= new Node();
		node.data=data;
		node.next=null;
		
		if(index==0){
			insertAtStart(data);
		}else{
		Node n=Head;
		for(int i=0;i<index-1;i++){
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
		
	}
	
	public static void main(String arg[]){
		LinkList list=new LinkList();
		list.insert(15);
		list.insert(17);
		list.insert(20);
		list.insertAtStart(12);
		list.insertDataIndex(1, 6);
		list.show();
	}
>>>>>>> 4cf4329123d7ec559337f4144094c5d9c260bd9d
}
