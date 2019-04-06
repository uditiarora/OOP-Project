package dataStructure;

public class ourQueue<T> extends ourLinkedList<T> {
	public ourQueue() {
		super();
	}
	
	public void enqueue(T data){
		this.append(data);
	}
	public T dequeue() throws listIndexOutOfBound{
		T temp = this.get(0);
		this.delete(0);
		return temp;
	}
	
	public T peek()throws listIndexOutOfBound
	{
		return this.get(0);

	}

}
