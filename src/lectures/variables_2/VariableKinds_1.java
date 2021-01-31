package variables_2;

public class VariableKinds_1 {
	// instance variables
	int currentSpeed = 0;

	// class variables
	static int numGears = 8;

	// parameters
	public static void main(String[] args) {
		// local variables
		String currentNumGears = "numGears : " + numGears;

		System.out.println(currentNumGears);
	}

	void printStatus(int idealSpeed) {
		System.out.println("currentSpeed : " + currentSpeed + " / idealSpeed : " + idealSpeed);
	}
}
