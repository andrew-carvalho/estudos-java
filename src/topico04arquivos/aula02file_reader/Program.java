package topico04arquivos.aula02file_reader;

import java.io.*;
import java.net.URL;

public class Program {
    public static void main(String[] args) {
        URL fileResource = Program.class.getClassLoader().getResource("test.txt");

        if (fileResource == null) {
            System.out.println("Resource not found");
            return;
        }

        String filePath = fileResource.getPath();
        File testFile = new File(filePath);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(testFile))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error opening a file: " + e.getMessage());
        }
    }
}
