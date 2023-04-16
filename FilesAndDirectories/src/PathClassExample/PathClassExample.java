package PathClassExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {

	public static void main(String[] args) {
		Path path = Paths.get("HelloWorld.txt");
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Path path2 = Paths.get("G:\\udemy\\JavaProgramming\\FilesAndDirectories\\togetPath\\example.txt");
		System.out.println(path2.getParent());
		System.out.println(path2.getRoot());
		System.out.println(path2.getFileName());
	}

}
