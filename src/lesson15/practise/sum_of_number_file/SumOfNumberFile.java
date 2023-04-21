package lesson15.practise.sum_of_number_file;

import java.io.*;
import java.util.Scanner;

public class SumOfNumberFile {
    public  void readFileText(String filePath) throws FileNotFoundException {
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line  = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum = "+sum);
        } catch (IOException e) {
            System.out.println("File doesn't exit");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input link file: ");
        String linkFile = sc.nextLine();

        SumOfNumberFile sumOfNumberFile = new SumOfNumberFile();
        sumOfNumberFile.readFileText(linkFile);
    }
}
