package case_study_module_2.utils.read_and_write.read_and_write_facility;

import case_study_module_2.model.extend.facility.House;


import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteHouse {
    public static void writeFileHouse(String locationFile, List<House> houseList){
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
            for (House house: houseList) {
                bufferedWriter.write(house.saveFileHouse());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<House> readFileHouse(String locationFile){
        List<House> houseList = new LinkedList<>();
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
                String[] houseArr = temp.split(",");
                House newHouse = new House(houseArr[0],houseArr[1],Double.parseDouble(houseArr[2]),Double.parseDouble(houseArr[3]),
                        Integer.parseInt(houseArr[4]),houseArr[5],houseArr[6],Integer.parseInt(houseArr[7]));
                houseList.add(newHouse);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
