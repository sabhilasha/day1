package com.ibm.Stack;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}

}
