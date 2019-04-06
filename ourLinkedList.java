package dataStructure;


public class ourLinkedList<T>{
	LinkedListNode head;
	public int size;
	public ourLinkedList() {
		size = 0;
		head = null;
	}
	class LinkedListNode<T>{
		T data;
		LinkedListNode<T> next;
		public LinkedListNode() {
			data = null;
			next = null;
			
		}
		public LinkedListNode(T data){
			this.data = data;
			this.next = null;
		}
		
	}
	public void append(T data){
		size++;
		if(head == null){
			head = new LinkedListNode<T>(data);
			return;
		}
		LinkedListNode<T> temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = new LinkedListNode<T>(data);
	}
	public void delete(int index) throws listIndexOutOfBound{
		
		if(index>=size){
			throw new listIndexOutOfBound();
		}
		size--;		
		if(index==0){
			head = head.next;
			return;
		}
		int count = 0;
		LinkedListNode<T> temp = head;
		while(count<index-1 && temp!=null){
			temp = temp.next;
			count++;
		}
		if(temp.next!=null){
			temp.next = temp.next.next;
		}
		
	}
	public void insert(T data,int index) throws listIndexOutOfBound{
		if(index>size){
			throw new listIndexOutOfBound();
		}
		size++;
		LinkedListNode<T> temp = head;
		LinkedListNode<T> ins = new LinkedListNode<T>(data);
		if(index==0){
			ins.next = head;
			head = ins;
			return;
		}
		int count = 0;
		while(count<index-1 && temp!=null){
			temp = temp.next;
			count++;
		}
		ins.next = temp.next;
		temp.next = ins;
		
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(this.size==0){
			return true;
		}
		else{
			return false;
		}
		
	}
	public String toString(){
		LinkedListNode<T> temp = head;
		String ans = "";
		while(temp!=null){
			ans += temp.data + " ";
			temp = temp.next;
		}
		return ans;
	}
	public T get(int index) throws listIndexOutOfBound{
		if(index>=size){
			throw new listIndexOutOfBound();
		}
		LinkedListNode<T> temp = head;
		int count = 0;
		while(count<index && temp!=null){
			temp = temp.next;
			count++;
		}
		return temp.data;
	}
	
	
}
