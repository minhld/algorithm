package com.minhld.stackqueue;

public class Postfix {
	
	public static double evalPostfix(String postfix) {
		Stack valStack = new Stack(100);
		
		char c;
		double d, res = 0;
		for (int i = 0; i < postfix.length(); i++) {
			c = postfix.charAt(i);
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				double op2 = (double) valStack.pop();
				double op1 = (double) valStack.pop();
				switch (c) {
					case '+':{
						res = op1 + op2;
						break;
					}
					case '-':{
						res = op1 - op2;
						break;
					}
					case '*':{
						res = op1 * op2;
						break;
					}
					case '/':{
						res = op1 / op2;
						break;
					}
				}
				valStack.push(res);
			} else {
				d = Double.parseDouble(String.valueOf(c));
				valStack.push(d);
			}
			
		}
		
		return (double) valStack.pop();
	}
	
	public static String getPostfix(String infix) {
		String postFix = "";
		Stack opStack = new Stack(100);
		
		char c, p;
		for (int i = 0; i < infix.length(); i++) {
			c = infix.charAt(i);
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				if (opStack.isEmpty()) {
					opStack.push(c);
				} else {
					p = (char) opStack.peek();
					if (getOpVal(p) >= getOpVal(c)) {
						p = (char) opStack.pop();
						postFix += p;
						opStack.push(c);
					} else {
						opStack.push(c);
					}
				}
			} else if (c == '(') {
				opStack.push(c);
			} else if (c == ')') {
				while ((p = (char) opStack.pop()) != '(') {
					postFix += p;
				}
			} else {
				postFix += c;
			}
		}
		
		while (!opStack.isEmpty()) {
			postFix += opStack.pop();
		}
		
		return postFix;
	}
	
	private static int getOpVal(char op) {
		if (op == '+' || op == '-') {
			return 1;
		} else if (op == '*' || op == '/') {
			return 2;
		} else if (op == '(' || op == ')') {
			return 0;
		}
		return 0;
	}
}
