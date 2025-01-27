package topico04arquivos.aula01file_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String filePath = Program.class.getClassLoader().getResource("test.txt").getPath();
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
