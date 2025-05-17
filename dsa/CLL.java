package DSA;

public class CLL {
	private Node head;
	private Node tail;
	private int size=0;
	
	private class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value=value;		
			}
	}
	public void display() { 
		if(isEmpty()){
			return; 
		}
		Node temp= head; 
		StringBuffer sb= new StringBuffer("[");
		do {
			
			sb.append(temp==tail ? temp.value : temp.value +" ,");
			temp=temp.next; 
		}
		while(temp!=head);
			sb.append("]");
			System.out.println(sb);
			
		}
		
	 
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	public boolean append(int value) {
		Node node = new Node(value); 
		if(isEmpty()) {			//time:O(1) there is no loop
			head=node; 			
			tail=node;
			node.next=head;
			
		}
		else {
			tail.next=node; 
			tail=tail.next; 
			tail.next=head;
		}
		size++; 
		return true;
	}
	public boolean prepend(int value) {
		Node node = new Node(value); 
		if(isEmpty()) {
			head=node; 
			tail=node;
			tail.next=head;
			
			
		}
		else {
			node.next=head; 
			head=node; 
			tail.next=head;
		}
		size++; 
		return true;
	} 
	public boolean insert(int index,int value) {
		if(index<0 ) {
			return prepend(value);
			
		}
		else if(index>=size) {
			return append(value);
			
		}
		
			Node node = new Node(value);
			Node temp=head;
			Node prev=null;
			int i=0;
			while(i!=index) {		
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=node;
			node.next=temp;
			tail.next=head;
			
			size++;
			return true;
		
	}
	public boolean deleteAtFirst() { 
		if(isEmpty() ) {
			return false;
			
		}
		else if(head==tail) {
			return true;
			
		}
		else {
		head=head.next;
		tail.next=head;
		}
		size--;
		return true;
	}
	public boolean deleteAtlast() { //time:O(1) there is no loop
		if(isEmpty() ) {
			return false;
			
		}
		else if(head==tail) {
			return true;
			
		}
		else {
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
			
		}
		temp.next=null;
		tail=temp;
		//tail.next=node; 
		//tail=tail.next; 
		tail.next=head;
		
			
		}
		size--;
		return true;
	}
	public boolean deleteAt(int index,int value) { //time:O(N) 
		if(isEmpty() || index<0 || index>=size) {
			return false;
			
		}
		else if(index==0) {
			return deleteAtFirst();
			
		}
		else if(index==size-1){
			return deleteAtlast();
			
		}
		else {
			Node node = new Node(value);
			Node temp=head;
			Node prev=null;
			int i=0;
			while(i!=index) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			
			prev.next=temp.next;
			tail.next=head;
			
		}
		size--;
		return true;
	}
	public int getSize() {
		return size;
	}
	public boolean update(int index,int value){
		Node temp=head;
		int i=0;
		while(i!=index) {
			temp=temp.next;
			i++;
		}
		temp.value=value;
		return true;
	
}
	public void reverse() {
		Node next,prev=null;
		Node current=head;
		tail=head;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		tail.next=head;
		display();
	}
	public int search(int value) { 
		if(isEmpty()) {
			return -1;
		}
		else {
			Node temp=head;
			int i=0;
			while(temp!=null) {
				if(temp.value==value) {
					return i;
				}
				temp=temp.next;
				i++;
					
			}
			tail.next=head;
			return -1;
		}
	}
	
}
			
		
		
	
	
		
	
	


