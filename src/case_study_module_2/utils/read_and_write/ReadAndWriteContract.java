package case_study_module_2.utils.read_and_write;

import case_study_module_2.model.contract.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteContract {
    public static List<Contract> readFileContract(String location){
        List<Contract> contractList = new ArrayList<>();
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
            while ((temp = bufferedReader.readLine()) != null && temp.equals("")){
                String[] contractArr = temp.split(",");
                Contract newContract = new Contract(contractArr[0],contractArr[1],
                        Double.parseDouble(contractArr[2]),Double.parseDouble(contractArr[3]));
                contractList.add(newContract);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractList;
    }
    public static void writeFileContract(String location, List<Contract> contractList){
        File file = new File(location);
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            for (Contract contract: contractList) {
                bufferedWriter.write(contract.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
