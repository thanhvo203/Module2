package lesson15.exercise.copy_file;

import java.io.*;

public class CopyFile {
    public String readFile(String nameFile){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String saveWord = "";
        try{
            File file = new File(nameFile);
            if(!(file.exists())){
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                saveWord += line;
            }
            System.out.println("Content in file: " +saveWord);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return saveWord;
    }
    public void writeFile(String text ,String newFile) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(newFile);
            if (!(file.exists())) {
                throw new FileNotFoundException();
            }
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        String firstFile = "lesson15/exercise/copy_file/first_file";
        String lastFile =  "lesson15/exercise/copy_file/last_file";
        CopyFile copyFile  = new CopyFile();
        String copy = copyFile.readFile(firstFile);
        copyFile.writeFile(copy,lastFile);

    }
}
