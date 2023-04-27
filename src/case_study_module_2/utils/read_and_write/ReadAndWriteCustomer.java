package case_study_module_2.utils.read_and_write;

import case_study_module_2.model.extend.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static List<Customer> readFileCustomer(String locationFile) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(locationFile);
        if (!(file.exists())) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        BufferedReader bufferedReader = null;
        try{
             bufferedReader = new BufferedReader(new FileReader(file));
             String temp ="";
             while ((temp = bufferedReader.readLine())!= null && !temp.equals("")){
                 String[] customerArr = temp.split(",");
                 Customer newCustomer = new Customer(customerArr[0], customerArr[1],customerArr[2],customerArr[3],
                         customerArr[4],customerArr[5],customerArr[6],customerArr[7],customerArr[8]);
                 customerList.add(newCustomer);
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }
    public static void writeFileCustomer(List<Customer> customerList, String locationFile){
        File file = new File(locationFile);
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter(file,false));
            for (Customer customer: customerList) {
                bufferedWriter.write(customer.writeToFileCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
