package lesson16.exercise.copy_file;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File sourceFile = new File("lesson16/exercise/copy_file/source_file");
        File targetFile = new File("lesson16/exercise/copy_file/target_file");
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Source File . Size: " + sourceFile.length() + " bytes.");
        System.out.println("Target File. Size: " + targetFile.length() + " bytes.");
    }
}
