package dataStructure;
import java.util.ArrayList;

public class ourPriorityQueue<T extends Comparable<? super T>> {
	ArrayList<T> data;
	
	public ourPriorityQueue() {
		data = new ArrayList<T>();
		data.add(null);
	}
	
	void insert(T element) {
		data.add(element);
		int childIndex = data.size() - 1;
		while(childIndex > 1) {
			int parentIndex = childIndex / 2;
			if((data.get(parentIndex)).compareTo(data.get(childIndex))<0) {
				return;
			}
			T temp = data.get(childIndex);
			data.set(childIndex, data.get(parentIndex));
			data.set(parentIndex, temp);
			
			childIndex = parentIndex;
 		}
	}
	
	public T getMin() {
		if(data.size() == 1) {
			return null;
		}
 		return data.get(1);
	}
	
	public T removeMin() {
		if(data.size() == 1) {
			return null;
		}
		T ans = data.get(1);
		data.set(1, data.get(data.size() - 1));
		data.remove(data.size() - 1);
		
		int parentIndex = 1;
		while(true) {
			int leftIndex = parentIndex * 2;
			int rightIndex = leftIndex + 1;
					
			int minIndex = parentIndex;
			if(leftIndex < data.size() && (data.get(leftIndex)).compareTo(data.get(minIndex))<0) {
				minIndex = leftIndex;
			}
			if(rightIndex < data.size() && (data.get(rightIndex).compareTo(data.get(minIndex))<0)) {
				minIndex = rightIndex;
			}
			if(minIndex == parentIndex) {
				break;
			}
			T temp = data.get(minIndex);
			data.set(minIndex, data.get(parentIndex));
			data.set(parentIndex, temp);
			parentIndex = minIndex;
		}
		return ans;
	}
	
}

