package org.members;

public class Inherit extends Family {
		
		public void companyName() {
			System.out.println("infosys");
		}
    public static void main(String[] args) {
		Inherit d=new Inherit();
		d.companyName();
		d.child();
		d.childAge();
	}

}

