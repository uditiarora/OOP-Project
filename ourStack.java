package dataStructure;

public class ourStack<T> extends ourLinkedList<T>{
	public ourStack() {
		super();
	}
	
	public void push(T data){
		this.append(data);
	}
	public T pop() throws listIndexOutOfBound{
		T temp = this.get(this.size-1);
		this.delete(this.size-1);
		return temp;
	}
	public ourStack<T> reverse() throws listIndexOutOfBound{
		ourStack<T> temp = new ourStack<T>();
		int count = this.size-1;
		while(count>-1){
			temp.push(this.get(count));
			count--;
		}
		return temp;
	}
	
	public void swap(ourStack<T> st2) throws listIndexOutOfBound
	{
		if(this.size != st2.size)
		{
			System.out.println("Can not be swap");
		}
		ourStack<T> temp = new ourStack<T>();
		int i;
		while(!this.isEmpty())
		{
			temp.append(this.pop());
		}
		
		while(!st2.isEmpty())
		{
			this.append(st2.pop());
			
		}
		while(!temp.isEmpty())
		{
			st2.append(temp.pop());
		}
		
		
	}
}
