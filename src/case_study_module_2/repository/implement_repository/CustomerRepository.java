package case_study_module_2.repository.implement_repository;

import case_study_module_2.model.extend.person.Customer;
import case_study_module_2.repository.extends_repository_common.ICustomerRepository;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    @Override
    public List showList() {
        return null;
    }

    @Override
    public void addNew(Customer customer) {

    }

    @Override
    public void edit(){
    }
}
