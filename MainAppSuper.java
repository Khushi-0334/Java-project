package com.edu;


	class ParentClass{
		public ParentClass() {
			System.out.println("ParentClass Constructor");
		}
	}

	class ChildClass extends ParentClass{
		public ChildClass() {
			System.out.println("Childclass constructor");
		}
	}

	public class MainAppSuper {

		public static void main(String[] args) {
			ChildClass cob = new ChildClass();
		}

	}


