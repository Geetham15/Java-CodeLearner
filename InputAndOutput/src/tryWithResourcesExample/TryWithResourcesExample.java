package tryWithResourcesExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
				StringWriter writer = new StringWriter();) { // preventing resource leaks
			writer.write(reader.readLine());
			System.out.println(writer.toString());
		} catch (IOException e) {

		}

	}

}
