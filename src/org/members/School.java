package org.members;

public class School extends Family {
	public void name() {
		System.out.println("my name is saranya");
	}
	public void work() {
		System.out.println("workig in chennai");
	}
	public static void main(String[] args) {
		School y=new School();
		y.name();
		y.work();
		y.child();
		y.childAge();
	}

}
