package com.tutorial.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintToFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("jjjjtest.txt");
		PrintStream ps = new PrintStream(fos);
		ps.print("This ");
		ps.println("file is print by");
		ps.println("a java program");
		ps.close();
	}

}
