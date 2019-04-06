package dataStructure;

public class treeNode<T>{
		T data;
		treeNode<T> right,left;
		boolean visited;
		public treeNode() {
			data = null;
			right = null;
			left = null;
			visited = false;
			
		}
		public treeNode(T data){
			this.data = data;
			this.right = null;
			this.left = null;
			this.visited = false;
		}
		
		public T getData()
		{
			return data;
		}
		public void setRight(treeNode<T> x)
		{
			right = x;
		}
		
		public void setLeft(treeNode<T> x)
		{
			left = x;
		}

		public treeNode<T> getRight(treeNode<T> x)
		{
			return right;
		}
		public treeNode<T> getLeft(treeNode<T> x)
		{
			return left;
		}

		
}