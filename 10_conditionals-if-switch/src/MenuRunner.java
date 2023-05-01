import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.println("The number you entered is - " + number1);
		int number2 = scanner.nextInt();
		System.out.println("The number2 is - " + number2);
		System.out.println(" 1 - Add \n 2 - Subtract \n 3 - Divide \n 4- Multiply");
		int operation = scanner.nextInt();
		System.out.println("Choose Operation: " + operation);
		int result = performOperationUsingSwitch(number1, number2, operation);
		System.out.println("Result is - " + result);
	}

	private static int performOperationUsingNestedIfElse(int number1, int number2, int operation) {
		int result = 0;
		if (operation == 1) {
			result = number1 + number2;
		} else if (operation == 2) {
			result = number1 - number2;
		} else if (operation == 3) {
			result = number1 / number2;
		} else if (operation == 4) {
			result = number1 * number2;
		} else {
			System.out.println("Operation selected is not in the list");
		}
		return result;
	}

	private static int performOperationUsingSwitch(int number1, int number2, int operation) {
		int result = 0;
		switch (operation) {
		case 1:
			result = number1 + number2;
			break;
		case 2:
			result = number1 - number2;
			break;
		case 3:
			result = number1 / number2;
			break;
		case 4:
			result = number1 * number2;
			break;
		default:
			System.out.println("Operation selected is not in the list");
		}

		return result;
	}
}
