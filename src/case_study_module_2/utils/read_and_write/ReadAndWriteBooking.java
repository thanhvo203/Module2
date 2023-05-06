package case_study_module_2.utils.read_and_write;

import case_study_module_2.model.booking.Booking;
import com.sun.source.tree.Tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    public static TreeSet<Booking> readFileBooking(String location){
        TreeSet<Booking> bookingList = new TreeSet<>();
        File file = new File(location);
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
            String temp ="";
            while ((temp = bufferedReader.readLine())!= null && !temp.equals("")){
                String[] bookingArr = temp.split("");
                Booking newBooking  = new Booking(bookingArr[0],bookingArr[1], bookingArr[3], bookingArr[2],
                        bookingArr[4],bookingArr[5]);
                bookingList.add(newBooking);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }
    public static void writeFileBooking(String location, TreeSet<Booking> bookingList){
        File file = new File(location);
        if(!file.exists()){
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter(file,false));
            for (Booking booking: bookingList) {
                bufferedWriter.write(booking.writeFileBooking());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
