package com.celcom.week2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+ n +" elements: ");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		
		Collections.reverse(list);
		System.out.println(list);
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	

		
		
	}
}
