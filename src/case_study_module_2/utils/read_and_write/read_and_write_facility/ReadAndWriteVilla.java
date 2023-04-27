package case_study_module_2.utils.read_and_write.read_and_write_facility;

import case_study_module_2.model.extend.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteVilla {
    public static void writeFileVilla(String locationFile, List<Villa> villaList){
         File file = new File(locationFile);
         if(!file.exists()){
             try {
                 throw new FileNotFoundException();
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             }
         }
         BufferedWriter bufferedWriter = null;
         try {
             bufferedWriter = new BufferedWriter(new FileWriter(file,false));
             for (Villa villa: villaList) {
                bufferedWriter.write(villa.saveFileVilla());
                bufferedWriter.newLine();
             }
             bufferedWriter.flush();
             bufferedWriter.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
    public static List<Villa> readFileVilla(String locationFile){
        List<Villa> villaList = new LinkedList<>();
        File file = new File(locationFile);
        if(!file.exists()){
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(file));
            String temp = "";
            while ((temp = bufferedReader.readLine())!= null && temp.equals("")){
                String[] villaArr = temp.split(",");
                Villa newVilla = new Villa(villaArr[0],villaArr[1],Double.parseDouble(villaArr[2]),Double.parseDouble(villaArr[3]),
                        Integer.parseInt(villaArr[4]),villaArr[5],villaArr[6],Double.parseDouble(villaArr[7]),Integer.parseInt(villaArr[8]));
                villaList.add(newVilla);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
}
