package case_study_module_2.repository.implement_repository;


import case_study_module_2.model.contract.Contract;
import case_study_module_2.repository.extends_repository_common.IContactRepository;

import java.util.List;

public class ContactRepository implements IContactRepository {

    @Override
    public List showList() {
        return null;
    }

    @Override
    public void addNew(Contract contract) {

    }

    @Override
    public void edit(){
    }
}
