package topico04arquivos.aula01file_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        URL fileResource = Program.class.getClassLoader().getResource("test.txt");

        if (fileResource == null) {
            System.out.println("Resource not found");
            return;
        }

        String filePath = fileResource.getPath();
        File testFile = new File(filePath);
        Scanner scanner = null;

        try {
            scanner = new Scanner(testFile);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
