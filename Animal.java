package interfaceproject;

 interface Animals {
	    void bark();
	}

	class Dog implements Animals {
	    @Override
	    public void bark() {
	        System.out.println("Dog is barking");
	    }
	}
	public class Animal {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.bark();
	    }
	}

