package com.spring;

public class Test {

	public static void main(String[] args) {

		int sum = 0, i = 1;

		while (i < 1000) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
