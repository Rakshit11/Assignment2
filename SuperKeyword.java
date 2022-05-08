package assignment2;

public class SuperKeyword {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.functions();
	}
}
class Animal{
	void eat() {
		System.out.println("Eats");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Eating bread");
	}
	void bark() {
		System.out.println("Dog barks");
	}
	void functions(){
		super.eat();
		bark();
	}
}