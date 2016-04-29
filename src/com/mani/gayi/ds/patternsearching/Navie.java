package com.mani.gayi.ds.patternsearching;

public class Navie {

	public static void main(String[] args) {
		String txt = "AABAACAADAABAAABAA";
		String pat = "AAB";
		search(pat, txt);

	}

	public static void search(String pattern, String text) {
		int M = pattern.length();
		int N = text.length();

		char pat[] = pattern.toCharArray();
		char txt[] = text.toCharArray();

		/* A loop to slide pat[] one by one */
		for (int i = 0; i <= N - M; i++) {
			int j;

			/* For current index i, check for pattern match */
			for (j = 0; j < M; j++)
				if (txt[i + j] != pat[j])
					break;

			if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
				System.out.println("Pattern found at index " + i);
		}
	}

}
