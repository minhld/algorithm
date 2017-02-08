package com.minhld.stackqueue;

public class testSQ extends Thread {
	public void run() {
		// testStack();
		// testStack2();
		// testQueue();
		testPostfix();
	}
	
	public void testPostfix() {
		String infix = 	"3*(1+5)-8/(1+1)";
						// "A*(B+C)-D/(E+F)";
						// "A+B*(C-D)";
						// "A+B*(C-D/(E+F))";
						// "((A+B)*C)-D";
						// "A*(B+C)";
						// "A*B+C*D";
						// "A+B+C"; // AB+C+
						// "A+B*C*D"; // ABC*D*+
		
		String postFix = Postfix.getPostfix(infix);
		System.out.println(infix + " -> " + postFix);
		System.out.println("result = " + Postfix.evalPostfix(postFix));
	}
	
	public void testQueue() {
		Queue theQueue = new Queue(6);
		theQueue.insert(10); theQueue.insert(20); theQueue.insert(30); theQueue.insert(40);
		theQueue.remove(); theQueue.remove(); theQueue.remove();
		theQueue.insert(50); theQueue.insert(60); theQueue.insert(70); theQueue.insert(80);
		
		while(!theQueue.isEmpty()) {
			int n = (Integer) theQueue.remove(); 
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}
	
	public void testStack2() {
		Stack theStack = new Stack(100);
		String str = "a{b(c[d]ab{abcabc[]}e)f}";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '{' || c == '(' || c == '[') {
				theStack.push(c);
			} else if (c == '}') {
				if ((char) theStack.peek() == '{') {
					theStack.pop();
				}
			} else if (c == ')') {
				if ((char) theStack.peek() == '(') {
					theStack.pop();
				}
			} else if (c == ']') {
				if ((char) theStack.peek() == '[') {
					theStack.pop();
				}
			}
		}
		System.out.println("is string fine?: " + theStack.isEmpty()); 
	}
	
	public void testStack() {
		Stack theStack = new Stack(100);
		theStack.push(20); theStack.push(40); theStack.push(60); theStack.push(80);
		while( !theStack.isEmpty() ) {
			Object value = theStack.pop(); 
			System.out.print(value); 
			System.out.print(" ");
		} 
			
		System.out.println("\r\nstack empty?: " + theStack.isEmpty()); 
	}
	
	public static void main(String args[]) {
		new testSQ().start();
	}
}
