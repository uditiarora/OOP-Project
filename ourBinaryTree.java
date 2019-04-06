package dataStructure;
import java.util.*;
public class ourBinaryTree<T> {
	treeNode<T> root;

	public void dfsUtil(treeNode<T> root){
		if(root==null ){
			return;
			
		}
		if(root.visited==true){
			return;
		}
		root.visited = true;
		System.out.print(root.data+" ");
		dfsUtil(root.left);
		dfsUtil(root.right);
	}
	public void markVisited(treeNode<T> temp){
		if(temp==null){
			return;
		}
		temp.visited = false;
		markVisited(temp.left);
		markVisited(temp.right);
	}
	public void dfs(){
		treeNode<T> temp = this.root;
		markVisited(temp);
		dfsUtil(temp);
	}
	public void bfs(){
		treeNode<T> temp = this.root;
		markVisited(temp);
		Queue<treeNode<T>> q = new LinkedList<treeNode<T>>();
		q.add(temp);
		while(!q.isEmpty()){
			treeNode<T> temp2 = q.remove();
			if(temp2.left!=null){
				q.add(temp2.left);
			}
			if(temp2.right!=null){
				q.add(temp2.right);
			}
			System.out.print(temp2.data+" ");
		}
	}
	
}
