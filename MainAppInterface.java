package interfaceproject;

interface Calculator{
	void add();
	void sub();
	
	
	//java-8 feature -->can Write method body inside interface
	default void display() {
		System.out.println("Default method in interface");
	}
	
	//java-9 static method cannot be overridden
	static void staticmethod() {
		System.out.println("Static method in interface");
	}
}

class MyCalculator implements Calculator
{
      @Override
      public void add() {
      System.out.println("Add method");	
   }

      @Override
      public void sub() {
	    System.out.println("Sub method");
    }
      public class MainAppInterface {
    	  
    	  public static void main(String Args[]) {
    	  	MyCalculator calc = new MyCalculator();
    	  	calc.add();
    	  	calc.sub();
    	  	calc.display();
    	  	
    	  	
    	  Calculator.staticmethod();//call static method with interface name
    	     }
    	  }
}