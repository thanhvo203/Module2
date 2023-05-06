package case_study_module_2.service.implement_service;

import case_study_module_2.model.contract.Contract;
import case_study_module_2.repository.implement_repository.ContactRepository;
import case_study_module_2.service.extends_service_common.IContactService;
import case_study_module_2.utils.validate.ValidateContract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
     private ContactRepository contactRepository = new ContactRepository();
     Scanner sc = new Scanner(System.in);

    @Override
    public void displayList() {
        List<Contract> contractList = contactRepository.showList();
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }
    @Override
    public void addNew() {
       String codeContract ;
       do {
           System.out.println("Enter code contract(CT-YYYY) with Y is number");
           codeContract = sc.nextLine();
           if(!ValidateContract.checkCodeContract(codeContract)){
               System.err.println("WRONG INPUT");
           }
       }while (!ValidateContract.checkCodeContract(codeContract));
       String codeBooking ;
       do {
           System.out.println("Enter code booking(BK-YYYY) with Y is number");
           codeBooking = sc.nextLine();
           if(!ValidateContract.checkCodeBooking(codeBooking)){
               System.err.println("WRONG INPUT");
           }
       }while (!ValidateContract.checkCodeBooking(codeBooking));
        System.out.print("Input advanceMoney : ");
        double advanceMoney = sc.nextDouble();
        double totalMoney = advanceMoney *10;
        System.out.println("Total money customer have pay is :" + totalMoney);
        Contract newContract = new Contract(codeContract,codeBooking,advanceMoney,totalMoney);
        contactRepository.addNew(newContract);
        System.out.println("Add Success");
    }
    @Override
    public void edit() {
        System.out.println("Input id you wanna edit(CT-YYYY) with Y is number: ");
        String codeEdit = sc.nextLine();
        int check  = contactRepository.checkIDContract(codeEdit);
        List<Contract> contractList = contactRepository.showList();
        double keepMoney = contractList.get(check).getTotalMoney();
        if(check >= 0){
            System.out.print("Input advance money");
            double advanceMoney = sc.nextDouble();
            contractList.get(check).setAdvanceMoney(advanceMoney);
            contractList.get(check).setTotalMoney(keepMoney);
            contactRepository.edit();
        }
    }
}
