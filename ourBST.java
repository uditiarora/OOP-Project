package dataStructure;
import java.util.*;
public class ourBST<T extends Comparable<? super T>> extends ourBinaryTree<T>{
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void insert(T data)
	{
		root=insert(root,data);
	}
	
	public treeNode<T> insert(treeNode<T>temp,T data)
	{
		if(temp == null)
		{
			temp= new treeNode<T>(data);
		}
		
		else
		{
			if(data.compareTo(temp.data)<0)
			{
				temp.left =insert(temp.left,data);
			}
			else
			{
				temp.right = insert(temp.right,data);
			}
		}
		return temp;
		
	}
	public T minValue(treeNode<T> temp)
	{
		T minv = temp.data;
		while(temp.left != null)
		{
			minv=temp.left.data;
			temp=temp.left;
		}
		return minv;
	}
	public void delete(T k)
	{
		if(isEmpty())
		{
			System.out.println("Tree is Empty");
		}
		else if(search(k)==false)
		{
			System.out.println(k + " Not Found");
		}
		else
		{
			root=delete(root,k);
			System.out.println(k + " Deleted");
		}
	}
	
	
	public treeNode<T> delete(treeNode<T> temp,T key)
	{
		if(temp==null)
			return temp;
		if((temp.getData()).compareTo(key) < 0){
			temp.left = delete(temp.left,key);
		}
		else if((temp.getData()).compareTo(key)>0){
			temp.right = delete(temp.right,key);
		}
		else 
		{
			if(temp.left==null)
				return temp.right;
			else if(temp.right==null)
				return temp.left;
			temp.data = minValue(temp.right);
			temp.right = delete(temp.right,temp.getData());
		}
		return temp;
	}
	
	public int size()
	{
		return size(root);
	}
	
	int size(treeNode<T> temp)
	{
		if(temp==null)
		{
			return 0;
		}
		
		else
		{
			int l=1;
			l += size(temp.getLeft(temp));
			l +=size(temp.getRight(temp));
			return l;
		}
	}
	
	public boolean search(T key)
	{
		return search(this.root,key);
	}
	
	public boolean search(treeNode<T> temp ,T key)
	{
		if(temp==null){
			return false;
		}
		if(temp.getData() == key){
			return true;
		}
		if((temp.getData()).compareTo(key) < 0){
			return search(temp.left,key);
		}
		else{
			return search(temp.right,key);
		}
	}
	
	

}
