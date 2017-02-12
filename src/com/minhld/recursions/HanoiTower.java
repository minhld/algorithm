package com.minhld.recursions;

public class HanoiTower extends Thread {
	public void run() {
		int level = 5;
		move(level, "S", "I", "D");
	}
	
	public void move(int n, String s, String i, String d) {
		if (n == 1) {
			System.out.println("disk " + n + " move from " + s + " to " + d);
		} else {
			move(n - 1, s, d, i);
			System.out.println("disk " + n + " move from " + s + " to " + d);
			move(n - 1, i, s, d);
		}
	}
	
	public static void main(String args[]) {
		new HanoiTower().start();
	}
}
