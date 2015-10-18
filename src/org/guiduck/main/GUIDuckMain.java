package org.guiduck.main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import co.guiduck.scope.Scope;


public class GUIDuckMain {
	private static Stack<Scope> callStack; //Scope holds map var->data, return address
	private static List<String[]> sourceCode;
	private static int currentIndex;
	
	public static void main(String[] args) throws FileNotFoundException {
		callStack = new Stack<Scope>();
		sourceCode = new ArrayList<String[]>();
		currentIndex = 0;
		buildCode(new File("test"));
		for (String[] i : sourceCode) {
			System.out.println(Arrays.toString(i));
		}
	}

	private static void buildCode(File file) throws FileNotFoundException {
		Scanner reader = new Scanner(file);
		while (reader.hasNextLine()) {
			sourceCode.add(buildStringArr(reader.nextLine()));
		}
	}
	
	//for now, all things must be separated by whitespace. To be improved!
	private static String[] buildStringArr(String nextLine) {
		return nextLine.split(" ");
	}
	
	

}
