package DefaultMethod_Intro;

interface Animal{
	void eating();
	void sleeping();
	
	
	//Concept of overriding is not mandatory on this two
	default void thinking() {
		System.out.println("Animal are also thinking.....");
	}
	
	//we are not going to change 
	default void running() {
		System.out.println("Animal Are running....");
	}
}

class Dog implements Animal{

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating()....");
	}

	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Sleeping().....");
		
	}
	
	public void thinking() {
		System.out.println("Dog is thinking().....");
	}
	
}

class Cat implements Animal{

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("cat is eating().....");
		
	}

	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("cat is thinking()......");
		
	}
	
	public void running() {
		System.out.println("cat is running()....");
	}
	
}
public class Test {
	public static void main(String[] args) {
		
		Animal animal=new Cat();
		animal.sleeping();
		animal.eating();
		animal.running();
		animal.thinking();
		
		System.out.println("**********************************");
		
		Animal animal2=new Dog();
		animal2.eating();
		animal2.sleeping();
		animal2.running();
		animal2.thinking();
		
//		Animal.thinking();
//	    Animal.running();
		
	}
}
