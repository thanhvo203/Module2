package case_study_module_2.service.implement_service;

import case_study_module_2.model.extend.person.Customer;
import case_study_module_2.repository.implement_repository.CustomerRepository;
import case_study_module_2.service.extends_service_common.ICustomerService;
import case_study_module_2.utils.validate.ValidateCustomer;
import case_study_module_2.utils.validate.ValidateEmployee;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner  sc  = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayList() {
        List<Customer> customerList = customerRepository.showList();
        for (Customer customer: customerList) {
            System.out.println(customer.writeToFileCustomer());
        }
    }
    @Override
    public void addNew() {
        String idCus;
        do{
            System.out.println("Enter id: ");
            idCus = sc.nextLine();
        }while (!ValidateCustomer.checkIDCustomer(idCus));
        String nameCus;
        do {
            System.out.println("Enter Full Name: ");
           nameCus = sc.nextLine();
        }while (!ValidateCustomer.checkName(nameCus));
        String dateCus;
        do {
            System.out.println("Enter day of birth: ");
            dateCus = sc.nextLine();
        }while (!ValidateCustomer.checkAge(dateCus));
        System.out.println("Enter gender: ");
        String genderCus = sc.nextLine();
        String identityCus;
        do {
            System.out.println("Enter identityNumber: ");
            identityCus = sc.nextLine();
        }while (!ValidateCustomer.checkIdentityNumberCus(identityCus));
        String phoneCus;
        do {
            System.out.println("Enter phone number:");
             phoneCus = sc.nextLine();
        }while (!ValidateCustomer.checkPhoneNumber(phoneCus));
        System.out.println("Enter email" );
        String emailCus = sc.nextLine();
        System.out.println("Enter type of customer: ");
        String typeCus = sc.nextLine();
        System.out.println("Enter address: ");
        String addressCus = sc.nextLine();
        Customer newCustomer = new Customer(idCus,nameCus,dateCus,genderCus,identityCus,phoneCus,emailCus,typeCus,addressCus);
        customerRepository.addNew(newCustomer);
        System.out.println("Add success!!");
    }
    @Override
    public void edit() {
        System.out.println("Enter id you wanna edit: ");
        String editID = sc.nextLine();
        int check = customerRepository.checkId(editID);
        List<Customer> customerList = customerRepository.showList();
        if(check >= 0){
            String idCus;
            do{
                System.out.println("Enter id: ");
                idCus = sc.nextLine();
            }while (!ValidateCustomer.checkIDCustomer(idCus));
            customerList.get(check).setId(idCus);
            String nameCus;
            do {
                System.out.println("Enter Full Name: ");
                nameCus = sc.nextLine();
            }while (!ValidateCustomer.checkName(nameCus));
            customerList.get(check).setFullName(nameCus);
            String dateCus;
            do {
                System.out.println("Enter day of birth: ");
                dateCus = sc.nextLine();
            }while (!ValidateCustomer.checkAge(dateCus));
            customerList.get(check).setDateOfBirth(dateCus);
            System.out.println("Enter gender: ");
            String genderCus = sc.nextLine();
            customerList.get(check).setGender(genderCus);
            String identityCus;
            do {
                System.out.println("Enter identityNumber: ");
                identityCus = sc.nextLine();
            }while (!ValidateCustomer.checkIdentityNumberCus(identityCus));
            customerList.get(check).setIdentityNumber(identityCus);
            String phoneCus;
            do {
                System.out.println("Enter phone number:");
                phoneCus = sc.nextLine();
            }while (!ValidateCustomer.checkPhoneNumber(phoneCus));
            customerList.get(check).setPhoneNumber(phoneCus);
            System.out.println("Enter email" );
            String emailCus = sc.nextLine();
            customerList.get(check).setEmail(emailCus);
            System.out.println("Enter type of customer: ");
            String typeCus = sc.nextLine();
            customerList.get(check).setTypeOfCustomer(typeCus);
            System.out.println("Enter address: ");
            String addressCus = sc.nextLine();
            customerList.get(check).setAddress(addressCus);
            customerRepository.edit();
        }else{
            System.out.println("Not found id");
        }
    }
}
