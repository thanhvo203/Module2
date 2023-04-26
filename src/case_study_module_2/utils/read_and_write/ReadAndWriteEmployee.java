package case_study_module_2.utils.read_and_write;



import case_study_module_2.model.extend.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static List<Employee> readFile(String locationFile) {
        List<Employee> employeeList =  new ArrayList<>();
        File file = new File(locationFile);
        if (!(file.exists())) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String temp = "";
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] employeeArr = temp.split(",");
                Employee employee = new Employee(employeeArr[0],employeeArr[1],employeeArr[2],employeeArr[3],
                        employeeArr[4],employeeArr[5],employeeArr[6],employeeArr[7],employeeArr[8],Double.parseDouble(employeeArr[9]));

                employeeList.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

    public static void writeFile(List<Employee> employeeList,String locationFile ) {
        File file = new File(locationFile);
        if (!(file.exists())) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            for (Employee employee: employeeList) {
                bufferedWriter.write(employee.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
