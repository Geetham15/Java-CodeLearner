package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		// List files and folders in Directory with files list method
		Path currentDirectory = Paths.get(".");
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		// Files.list(currentDirectory).forEach(System.out::println);
		Files.walk(currentDirectory, 4).filter(predicate) // filter the path which contains .java
				.forEach(System.out::println); // gives the list 2 level 2 to the currentDirectory

		System.out.println("Print javaMatcher files");
		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path)
				.contains(".java");
		Files.find(currentDirectory, 4, javaMatcher).forEach(System.out::println);

		System.out.println("Print directory");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println);


	}

}
