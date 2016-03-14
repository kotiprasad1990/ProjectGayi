package com.mani.gayi.threads;

public class MemoryCOnsistency {
	int isReady = 0;
	int answer = 0;

	void publishMessage() {
		answer = 42; // (1)
		isReady = 1; // (2)
	}

	}
