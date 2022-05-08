package assignment2;

public class MethodOverriding {
	public static void main(String[] args) {
		animal Animal = new animal();
		Animal.vocal();
		dog Dog = new dog();
		Dog.vocal();
		cat Cat = new cat();
		Cat.vocal();
	}
}
class animal{
	void vocal() {
		System.out.println("aniamls have different vocals.");;
	}
}
class dog extends animal{
	void vocal() {
		System.out.println("A dog barks.");
	}
}
class cat extends animal{
	void vocal() {
		System.out.println("A cat meows.");
	}
}
