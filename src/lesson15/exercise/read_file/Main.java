package lesson15.exercise.read_file;

import java.io.*;

public class Main {
    public void display() throws FileNotFoundException {
        File file = new File("lesson15/exercise/read_file/country.csv");
        if (!file.exists()){
            throw new FileNotFoundException();
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String temp;
            while ((temp = bufferedReader.readLine())!= null){
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        main.display();
    }

}
