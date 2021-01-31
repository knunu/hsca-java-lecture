package operators_3;

public class InstanceofDemo_6 {
	class Parent {}
	class Child extends Parent implements MyInterface {}
	interface MyInterface {}

	public static void main(String[] args) {
		InstanceofDemo_6 demo = new InstanceofDemo_6();

		demo.printExample();
	}

	void printExample() {
		Parent obj1 = new Parent();
		Parent obj2 = new Child();

		System.out.println("obj1 instanceof Parent: "
			+ (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: "
			+ (obj1 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: "
			+ (obj1 instanceof MyInterface));
		System.out.println("obj2 instanceof Parent: "
			+ (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: "
			+ (obj2 instanceof Child));
		System.out.println("obj2 instanceof MyInterface: "
			+ (obj2 instanceof MyInterface));
	}
}
