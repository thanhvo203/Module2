package case_study_module_2.utils.read_and_write.read_and_write_facility;

import case_study_module_2.model.extend.facility.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteRoom {
    public static void writeFileRoom(String locationFile, List<Room> roomList){
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
            for (Room room: roomList) {
                bufferedWriter.write(room.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Room> readFileRoom(String locationFile){
        List<Room> roomList = new ArrayList<>();
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
            while ((temp = bufferedReader.readLine())!= null && !temp.equals("")){
                String[] houseArr = temp.split(",");
                Room newRoom = new Room(houseArr[0],houseArr[1],Double.parseDouble(houseArr[2]),Double.parseDouble(houseArr[3]),
                        Integer.parseInt(houseArr[4]),houseArr[5],houseArr[6]);
                roomList.add(newRoom);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
