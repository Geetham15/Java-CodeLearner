package methodReferencesExample;

public class Main {

	public static void main(String[] args) {
		Square s = new Square(4);
		// lambda
//		Shapes shapes = (Square square) -> {
//			return square.calculateArea();
//		};
		// method reference
		Shapes shapes = Square::calculateArea;
		System.out.println("Area : " + shapes.getArea(s));
	}

}
