package com.imf.jvm.basics;

public class HelloStackOverFlow {
	private int counter;

	public void count() {
		counter++;
		System.out.println("The stack frame depth is : "+counter);
		count();
	}

	public static void main(String[] args) {
		System.out.println("HelloStackOverFlow");

		HelloStackOverFlow helloStackOverFlow = new HelloStackOverFlow();
		try {
			helloStackOverFlow.count();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
