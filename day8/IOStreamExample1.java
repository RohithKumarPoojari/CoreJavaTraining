package com.celcom.day8;

import java.io.IOException;
import java.io.FileReader;

public class IOStreamExample1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://Example.txt");
		int ch = 0;
		while((ch =  fr.read()) !=-1) {
			System.out.print((char) ch);
		}
		fr.close();
	}
}
