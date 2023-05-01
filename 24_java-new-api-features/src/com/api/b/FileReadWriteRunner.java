package com.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//To read and write a string to a file - java 11 feature
public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./resources/sample.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		String newFileContent = fileContent.replace("Line", "Lines");
		Path newFilePath = Paths.get("./resources/sample-new.txt");
		Files.writeString(newFilePath, newFileContent);

	}

}
