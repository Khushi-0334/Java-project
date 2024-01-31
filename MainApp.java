package interfaceproject;

	interface One{
	    void m1();
	}

	interface Two{
	    void m2();
	}

	interface Three extends One,Two{

	    void m3();
	    void m4();
	}
	abstract class MyClass implements Three{
	     public void m1(){
	           System.out.println("m1");
	      }
	     public void m2(){
	           System.out.println("m2");
	      }
	    public void m3(){
	            System.out.println("m3");
	    }
	}

	class TestClass extends MyClass{

		@Override
		public void m4() {
			System.out.println("m4 method");
			
		}
		
	}

	public class MainApp{
	     public static void main(String args[]){ 
	    	 TestClass ob = new TestClass();
	              ob.m1();
	              ob.m2();
	              ob.m3();
	              ob.m4();
	   }
	}

