package com.mani.gayi.dp;

public class NQueensSingleDimensional {

	private int[] queensArray;
	private int numberofqueens;

	// constructor which takes the number of queens that should be present in
	// the chess board.s
	public NQueensSingleDimensional(int numberofqueens) {
		this.numberofqueens = numberofqueens;
		queensArray = new int[numberofqueens];
	}

	public void solveQueensProblem() {
		arrangeQueens(0);
	}

	private void arrangeQueens(int rowIndex) {

		System.out.println("Arranging Queen "+rowIndex);
		for (int numberofqueeniterator = 0; numberofqueeniterator < numberofqueens; numberofqueeniterator++) {
			if (isPlaceValid(rowIndex, numberofqueeniterator)) {

				queensArray[rowIndex] = numberofqueeniterator;

				if (rowIndex == numberofqueens - 1) {
					printQueens();
				} else {
					arrangeQueens(rowIndex + 1);
				}

			}
		}
	}

	private void printQueens() {

		for (int rowiter = 0; rowiter < numberofqueens; rowiter++) {
			for (int coliter = 0; coliter < numberofqueens; coliter++) {
				if (queensArray[rowiter] == coliter) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}

			System.out.println();
		}

		System.out.println();
	}

	private boolean isPlaceValid(int rowIndex, int columnindex) {

		for (int i = 0; i < rowIndex; i++) {

			if (queensArray[i] == columnindex) {
				return false;
			}

			if ((i - rowIndex) == (queensArray[i]) - columnindex) {
				return false;
			}
			if ((i - rowIndex) == (columnindex - queensArray[i])) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		NQueensSingleDimensional nqueen = new NQueensSingleDimensional(4);
		nqueen.solveQueensProblem();

	}

}
