package com.celcom.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list);
		
		System.out.println(list.get(0));
		list.add(1, 15);
		System.out.println(list);
		
		list.add(1, 150);
		System.out.println(list);
		
		list.remove(new Integer(10));
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		System.err.println(list.size());
		System.out.println(list.contains(30));
		
		//Travesing ways for list
		
		//way - 1
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//way - 2
		for(Integer e : list) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		//way - 3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}
