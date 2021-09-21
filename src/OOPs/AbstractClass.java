package OOPs;

abstract class AbstractParent {
	abstract void m1();

	abstract void m2();
	
	abstract int m4(int a, char b);

	void m3() {
		System.out.println("Barkur");
	}
	//Constructor
	AbstractParent(){
		System.out.println("Constructor");
	}

}

public class AbstractClass extends AbstractParent {

	public static void main(String[] args) {
//	AbstractParent p = new AbstractParent(); 	:Unable to create object for abstract class

		AbstractClass p1 = new AbstractClass();
		p1.m1();
		p1.m2();
	int i =  p1.m4(10, 'P');
	System.out.println(i);

		AbstractParent p2 = new AbstractClass();
		p2.m1();
		p2.m3();
	}
	
	AbstractClass(){
		super();
		System.out.println("Child Constructor");
	}

	void m1() {
		System.out.println("Prathap");

	}

	void m2() {
		System.out.println("Shwetha");
	}

	@Override
	int m4(int a, char b) {
		
		return m4(190, 'w');
	
	}

}

//Abstract methods contains only method declarations and ends with ;			: void m1();
// Represented by Abstract modifier												: abstract void m1();
//Abstract class may or may not contains abstract methods but we are not able to create object for that abstract class
//Abstract methods can have any return type and any number of arguments.
//We can overload the abstract methods
//Constructor declaration is possibles

