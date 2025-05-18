package DSA;



public class DLL {
		private Node head;
		private Node tail;
		private int size;
		
		public boolean isEmpty(){
			return head==null && tail==null;
		}
		
		private class Node{
			int value;
			Node next;
			Node prev;
			
			Node(int value){
				this.value=value;
			}
		}
		public void display() {  //time:O(N) 
			Node temp= head; 
			StringBuffer sb= new StringBuffer("["); 
			while(temp!=null) { 
				sb.append(temp==tail ? temp.value : temp.value +" ,");
				temp=temp.next; 
				
			}
			sb.append("]");
			System.out.println(sb);
		} 
		
		public boolean append(int value) { 
			Node node = new Node(value); 
			if(isEmpty()) {			//time:O(1) there is no loop
				head=node; 			
				tail=node;	
			}
			else {
				tail.next=node; 
				node.prev=tail;
				tail=node; 
			}
			size++; 
			return true;
		}
		public boolean prepend(int value) {
			Node node = new Node(value); 
			if(isEmpty()) {
				head=node; 
				tail=node;
				
			}
			else {
				node.next=head; 
				head.prev=node;
				head=node; 
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
				node.prev=prev;
				node.next=temp;
				temp.prev=node;
				size++;
				return true;
			
		}
		public boolean deleteAtFirst() { 
			if(isEmpty() ) {
				return false;
				
			}
			else if(head==tail) {
				head=null;
				tail=null;
				return true;
				
			}
			else {
			head=head.next;
			head.prev=null;
			}
			size--;
			return true;
		}
		public boolean deleteAtlast() { 
			if(isEmpty() ) {
				return false;
				
			}
			else if(head==tail) {
				head=null;
				tail=null;
				return true;
				
			}
			else {
			Node temp=head;
			
			tail=tail.prev;
			temp.next=null;
			
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
				//Node node = new Node(value);
				Node temp=head;
				Node prev=null;
				int i=0;
				while(i!=index) {
					prev=temp;
					temp=temp.next;
					i++;
				}
				
				
				prev.next=temp.next;
				temp.next.prev=prev;
				
			}
			size--;
			return true;
		}
		
		public int getSize() {
			return size;
		}
		public int search(int value) { 
			if(isEmpty()) {
				return -1;
			}
			else {
				Node temp=head;
				int i=0;
				while(temp.next!=null) {
					if(temp.value==value) {
						return i;
						
					}
					temp=temp.next;
					
					i++;
					
				}
				return -1;
			}		
			
		}
			public boolean update(int index,int value){
				
				Node node = new Node(value);
				Node temp=head;
				
				int i=0;
				while(i!=index) {
					temp=temp.next;
					
					i++;
				}
				
				
				temp.value=value;
				return true;
			
	}
			public void reverse() {  //time:O(N) 
				Node temp= tail; 
				StringBuffer sb= new StringBuffer("["); 
				while(temp!=null) { 
					sb.append(temp==head ? temp.value : temp.value +" ,");
					temp=temp.prev; 
					
				}
				sb.append("]");
				System.out.println(sb);
			} 
			
		

	}




