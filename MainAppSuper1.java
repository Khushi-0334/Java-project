package com.edu;
//Object is parent
class ParentClass{
private int cardno;
	public ParentClass() {
		super();
		System.out.println("ParentClass Constructor");
	}
	public ParentClass(int cardno) {
		super();
		this.cardno = cardno;
		System.out.println("Card no is "+cardno);
	}
}

class ChildClass extends ParentClass{

	public ChildClass() {
		super(); //super() should be first statement in child class constructor
		System.out.println("Childclass constructor ");
		
		
	}
	public ChildClass(int cn) {
		super(cn); //explicit call
		
	}
}

public class MainAppSuper1 {

	public static void main(String[] args) {
		ChildClass cob = new ChildClass();
		ChildClass cob1 = new ChildClass(111233);
	}

}
