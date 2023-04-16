package FileCopyExample;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyExample {

	private static final CopyOption REPLACE_EXISTING = null;

	public static void main(String[] args) {

		Path source = Paths.get("G:\\udemy\\JavaProgramming\\FilesAndDirectories\\myFile.txt");
		Path dest = Paths.get("G:\\udemy\\JavaProgramming\\FilesAndDirectories\\new.txt");
		try {
			Files.copy(source, dest, REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
