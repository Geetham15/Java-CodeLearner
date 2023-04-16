package FileCreationExample;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {

	public static void main(String[] args) {

		File myFile = new File("G:\\udemy\\JavaProgramming\\FilesAndDirectories\\myFile.txt");
		try {
			boolean fileCreated = myFile.createNewFile();
			System.out.println(fileCreated);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
