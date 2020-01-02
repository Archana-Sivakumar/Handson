
abstract public class Animal {
	void livingThing() {
		System.out.println("Animal is living");
	}

	abstract void mobility();
}

class Snake extends Animal {
	void sound() {
		System.out.println("Snake hisses");
	}

	void mobility() {
		System.out.println("Snake is moving");
	}

}

abstract class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
	// void mobility()
//	{
//		System.out.println("Dog is moving");
//	}
}

class Cat extends Dog {
//	void sound()
//	{
	// System.out.println("Cat meows");
//	}

	void mobility() {
		System.out.println("Cat walks");

	}

}
