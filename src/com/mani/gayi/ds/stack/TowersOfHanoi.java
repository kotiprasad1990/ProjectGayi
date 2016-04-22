package com.mani.gayi.ds.stack;

public class TowersOfHanoi {
	public void solve(int n, String start, String auxiliary, String end) {
		if (n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			solve(n - 1, start, end, auxiliary);
			System.out.println(start + " -> " + end);
			solve(n - 1, auxiliary, start, end);
		}
	}

	public static void main(String[] args) {
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		int NO_DISKS = 3;
		System.out.print("Number of discs: " + NO_DISKS);
		towersOfHanoi.solve(NO_DISKS, "A", "B", "C");

	}
}
