package ESB_4;

public class Expressions_1 {
	public static void main(String[] args) {
		int[] anArray = new int[1];

		anArray[0] = 100;
		System.out.println("Element 1 at index 0: " + anArray[0]);

		int result;

		result = 100 + 200 / 100;
		System.out.println(result);

		result = (100 + 200) / 100; // recommended
		System.out.println(result);

		result = 100 + (200 / 100); // recommended
		System.out.println(result);
	}
}
