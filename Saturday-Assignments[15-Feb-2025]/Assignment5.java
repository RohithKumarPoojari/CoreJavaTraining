package com.celcom.week2assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+ n +" elements: ");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		for(int i=0;i<list.size(); i++) {
			System.out.println("Element at index " + i +":  " +list.get(i));
		}
	}
}
