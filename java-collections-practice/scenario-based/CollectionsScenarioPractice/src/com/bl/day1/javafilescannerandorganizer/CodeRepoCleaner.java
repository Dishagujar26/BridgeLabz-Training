package com.bl.day1.javafilescannerandorganizer;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

/*
  4. CodeRepoCleaner – Java File Scanner and Organizer
Story: In a developer team, thousands of Java source files are dumped into a shared folder.
Over time, many have become redundant, duplicate, or poorly formatted.
The tool CodeRepoCleaner should:
● Scan all .java files in nested folders using I/O
● Use regex to detect:
○ Methods not following naming conventions
○ Unused import statements
● Categorize files into folders (Valid, Warnings, Errors)
● Use List<Path>, Map<FileType, List<File>>, and Set<String> to manage file types
● Allow filtering files based on size, date modified, etc. using streams
*/
public class CodeRepoCleaner {

	// Regex for method naming (camelCase)
	private static final Pattern METHOD_PATTERN = Pattern.compile("void\\s+([a-z][a-zA-Z0-9_]*)\\s*\\(");

	// Regex for imports (to detect unused imports, simple heuristic)
	private static final Pattern IMPORT_PATTERN = Pattern.compile("import\\s+([\\w\\.]+);");

	public static void main(String[] args) throws IOException {

		Path rootFolder = Paths.get("D:\\Assignment1"); // folder containing .java files

		// Map<FileType, List<Path>>
		Map<FileType, List<Path>> categorizedFiles = new HashMap<>();
		categorizedFiles.put(FileType.VALID, new ArrayList<>());
		categorizedFiles.put(FileType.WARNING, new ArrayList<>());
		categorizedFiles.put(FileType.ERROR, new ArrayList<>());

		// Set for unique imports (for demonstration)
		Set<String> uniqueImports = new HashSet<>();

		// Scan nested folders
		List<Path> javaFiles = new ArrayList<>();
		Files.walkFileTree(rootFolder, new SimpleFileVisitor<>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				if (file.toString().endsWith(".java")) {
					javaFiles.add(file);
				}
				return FileVisitResult.CONTINUE;
			}
		});

		for (Path file : javaFiles) {
			String content = Files.readString(file);

			// Detect methods not following camelCase
			Matcher methodMatcher = METHOD_PATTERN.matcher(content);
			boolean invalidMethod = false;
			while (methodMatcher.find()) {
				String methodName = methodMatcher.group(1);
				if (!Character.isLowerCase(methodName.charAt(0))) {
					invalidMethod = true;
					break;
				}
			}

			// Detect unused imports (simplified: import exists but class name never used)
			Matcher importMatcher = IMPORT_PATTERN.matcher(content);
			boolean unusedImport = false;
			while (importMatcher.find()) {
				String importClass = importMatcher.group(1).substring(importMatcher.group(1).lastIndexOf('.') + 1);
				uniqueImports.add(importClass);
				if (!content.contains(importClass)) {
					unusedImport = true;
					break;
				}
			}

			// Categorize file
			if (invalidMethod || unusedImport) {
				categorizedFiles.get(FileType.WARNING).add(file);
			} else {
				categorizedFiles.get(FileType.VALID).add(file);
			}
		}

		// Filter example: Files > 1KB
		List<Path> largeFiles = javaFiles.stream().filter(f -> f.toFile().length() > 1024).collect(Collectors.toList());

		// Print results
		System.out.println("Valid Files:");
		categorizedFiles.get(FileType.VALID).forEach(System.out::println);

		System.out.println("\nWarning Files:");
		categorizedFiles.get(FileType.WARNING).forEach(System.out::println);

		System.out.println("\nLarge Files (>1KB):");
		largeFiles.forEach(System.out::println);

		System.out.println("\nUnique Imports Found:");
		uniqueImports.forEach(System.out::println);
	}
}
