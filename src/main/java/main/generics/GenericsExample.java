package main.generics;

import java.util.List;

public class GenericsExample<T> {
	
	private List<T> values;
	
	void add(T value) {
	 values.add(value);
	}
	
	void remove(T value) {
		this.values.remove(value);
	}

	T getIndex(int index) {
		return this.values.get(index);
	}
	
	
	public static void main(String []args) {
		
		GenericsExample<String> g = new GenericsExample<String>();
		g.add("abc");
		g.add("a");
		g.add("b");
	System.out.println(g.getIndex(0));
		
	}
}
