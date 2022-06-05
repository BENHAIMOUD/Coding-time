package codingame_tests;
/*
abstract class Animal{
	
}
class Dog extends Animal{
	String name;
	//
	// Creates a new dog with the given name
	//
	Dog (String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
}
class Cat extends Animal{
	String name;
	//
	// Creates a new cat with the given name
	//
	Cat(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
*/

abstract class Animal{

	String name;
	Animal (String name){
		this.name =name;
	}
	String getName() {
		return name;
	}
}
class Dog extends Animal{
	
	/**
	 * Creates a new dog with the given name
	 */
	Dog (String name){
		super(name);
	}
	
}
class Cat extends Animal{
	Cat (String name){
		super(name);
	}
}

public class Application {
	/**
	 * @return the name of the given animal
	 */
	static String getAnimalName(Animal a) {
		String name = null;
		if(a instanceof Dog) {
			name = ((Dog)a).getName();
		} else if (a instanceof Cat) {
			name = ((Cat) a).getName();
		}
		return name;
	}
	
	public static void main(String[] args) {
		Dog samny = new Dog("Samny");
		Cat smokey = new Cat("Smokey");
		
		System.out.println(Application.getAnimalName(samny)); 
		System.out.println(Application.getAnimalName(smokey));
	}

}
