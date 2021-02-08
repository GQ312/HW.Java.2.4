package com.company;

public class Main {

    public static void main(String[] args) {
	Runner runner = new Runner(1, new Runner(2, new Runner(3, new Runner(4, new Runner()))));

	runner.start();
    }
}
