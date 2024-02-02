import java.io.File;
import java.util.Scanner;

public class _41_FileAnalyzer {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter file or directory path: ");
            analyzePath(input.nextLine());
        }
    }

    public static void analyzePath(String path) {
        File file = new File(path);
        if (file.exists()) {
            displayFileInfo(file);
            if (file.isDirectory()) {
                listDirectoryContents(file);
            }
        } else {
            System.out.printf("%s does not exist.%n", path);
        }
    }

    private static void displayFileInfo(File file) {
        System.out.printf("%s%s%n%s%n%s%n%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n",
                file.getName(), " exists",
                (file.isFile() ? "is a file" : "is not a file"),
                (file.isDirectory() ? "is a directory" : "is not a directory"),
                (file.isAbsolute() ? "is absolute path" : "is not absolute path"),
                "Last modified: ", file.lastModified(),
                "Length: ", file.length(),
                "\nPath: ", file.getPath(),
                "Absolute path: ", file.getAbsolutePath(),
                "Parent: ", file.getParent());
    }

    private static void listDirectoryContents(File directory) {
        String[] directoryContents = directory.list();
        System.out.println("\nDirectory contents:\n");
        if (directoryContents != null) {
            for (String itemName : directoryContents) {
                System.out.println(itemName);
            }
        } else {
            System.out.println("Unable to list directory contents.");
        }
    }
}
