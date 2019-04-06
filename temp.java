package dataStructure;
import java.util.*;
public class temp {
	public static void main(String[] args) throws listIndexOutOfBound{
		ourHashMap<Integer, Integer> m = new ourHashMap<>();
		m.insert(20, 40);
		m.insert(10, 20);
		m.insert(10, 30);
		System.out.println(m.search(10));
		System.out.println(m.search(30));
		m.remove(10);
		System.out.println(m.search(10));
	}
}
