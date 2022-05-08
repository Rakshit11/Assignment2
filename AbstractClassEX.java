package assignment2;

public class AbstractClassEX {
	public static void main(String[] args) {
		Car a = new Maruti();
		a.run();
		a.changeGear();
		
	}
}
abstract class Car{
	Car(){
		System.out.println("Car is made");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Changed gear");
	}
}
class Maruti extends Car{
	void run() {
		System.out.println("Runs safely");
	}
}