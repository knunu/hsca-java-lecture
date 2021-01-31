package control_flow_5.branch;

public class ReturnDemo {
	public static void main(String[] args) {
		ReturnDemo returnDemo = new ReturnDemo();

		System.out.println(returnDemo.returnResult());
	}

	int returnResult() {
		int result = 0;

		return ++result;
	}

	void returnNothing() {
		return;
	}
}
