package case_study_module_2.repository.implement_repository;

import case_study_module_2.model.extend.person.Customer;
import case_study_module_2.repository.extends_repository_common.ICustomerRepository;
import case_study_module_2.utils.read_and_write.ReadAndWriteCustomer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH = "D:\\Codegym\\module2\\src\\case_study_module_2\\data\\person_data\\customer_data.csv";
    private static List<Customer> customerList = ReadAndWriteCustomer.readFileCustomer(PATH);
    @Override
    public List<Customer> showList() {
        customerList = ReadAndWriteCustomer.readFileCustomer(PATH);
        return customerList;
    }

    @Override
    public void addNew(Customer customer) {
       customerList.add(customer);
       ReadAndWriteCustomer.writeFileCustomer(customerList,PATH);
    }

    @Override
    public void edit(){
      ReadAndWriteCustomer.writeFileCustomer(customerList,PATH);
    }
    public int checkId(String id){
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
