package case_study_module_2.repository.implement_repository;


import case_study_module_2.model.contract.Contract;
import case_study_module_2.repository.extends_repository_common.IContactRepository;
import case_study_module_2.utils.read_and_write.ReadAndWriteContract;

import java.util.List;

public class ContactRepository implements IContactRepository {
    private static final String PATH_CONTRACT ="D:\\Codegym\\module2\\src\\case_study_module_2\\data\\contact_data.csv";
    private static List<Contract> contractList = ReadAndWriteContract.readFileContract(PATH_CONTRACT);

    @Override
    public List<Contract> showList() {
        contractList = ReadAndWriteContract.readFileContract(PATH_CONTRACT);
        return contractList;
    }

    @Override
    public void addNew(Contract contract) {
      contractList.add(contract);
      ReadAndWriteContract.writeFileContract(PATH_CONTRACT,contractList);
    }@Override
    public void edit() {
        ReadAndWriteContract.writeFileContract(PATH_CONTRACT,contractList);
    }
    public int checkIDContract(String id){
        for (int i = 0; i < contractList.size(); i++) {
            if(contractList.get(i).getCodeContract().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
