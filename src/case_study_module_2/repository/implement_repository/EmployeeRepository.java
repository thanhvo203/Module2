package case_study_module_2.repository.implement_repository;

import case_study_module_2.model.extend.person.Employee;
import case_study_module_2.repository.extends_repository_common.IEmployeeRepository;
import case_study_module_2.utils.read_and_write.ReadAndWriteEmployee;


import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH = "D:\\Codegym\\case_study_module_2\\src\\data\\employee_data.csv";
    private static List<Employee> employeeList = ReadAndWriteEmployee.readFile(PATH);

    @Override
    public List<Employee> showList() {
       employeeList = ReadAndWriteEmployee.readFile(PATH);
       return employeeList;
    }

    @Override
    public void addNew(Employee employee) {
        employeeList.add(employee);
        ReadAndWriteEmployee.writeFile(employeeList,PATH);
    }

    @Override
    public void edit() {
        ReadAndWriteEmployee.writeFile(employeeList,PATH);
    }
    public int checkId(String id){
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
