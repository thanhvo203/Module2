package case_study_module_2.service.implement_service;

import case_study_module_2.model.extend.person.Customer;
import case_study_module_2.repository.implement_repository.CustomerRepository;
import case_study_module_2.service.extends_service_common.ICustomerService;
import case_study_module_2.utils.validate.ValidateCustomer;
import case_study_module_2.utils.validate.ValidateEmployee;
import case_study_module_2.utils.validate.facility.ValidateRoom;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner  sc  = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayList() {
        List<Customer> customerList = customerRepository.showList();
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }
    }
    @Override
    public void addNew() {
        String idCus;
        do{
            System.out.println("Enter id (KH-YYYY) with Y is number: ");
            idCus = sc.nextLine();
            if(!ValidateCustomer.checkIDCustomer(idCus)){
                System.err.println("INPUT WRONG!!");
            }
        }while (!ValidateCustomer.checkIDCustomer(idCus));
        String nameCus;
        do {
            System.out.println("Enter Full Name(With Capitalization first word) : ");
           nameCus = sc.nextLine();
           if(!ValidateCustomer.checkName(nameCus)){
               System.err.println("INPUT WRONG!!!");
           }
        }while (!ValidateCustomer.checkName(nameCus));
        String dateCus;
        do {
            System.out.println("Enter day of birth (with age above 18) : ");
            dateCus = sc.nextLine();
            if(!ValidateCustomer.checkAge(dateCus)){
                System.err.println("NOT ENOUGH 18!!");
            }
        }while (!ValidateCustomer.checkAge(dateCus));
        System.out.print("Enter gender: ");
        String genderCus = sc.nextLine();
        String identityCus;
        do {
            System.out.println("Enter identityNumber(input 9 or 12 number) : ");
            identityCus = sc.nextLine();
            if(!ValidateCustomer.checkIdentityNumberCus(identityCus)){
                System.err.println("INPUT WRONG!!!");
            }
        }while (!ValidateCustomer.checkIdentityNumberCus(identityCus));
        String phoneCus;
        do {
            System.out.println("Enter phone number(Star number 0 and enough 10 number) :");
             phoneCus = sc.nextLine();
             if (!ValidateCustomer.checkPhoneNumber(phoneCus)){
                 System.err.println("INPUT WRONG!!");
             }
        }while (!ValidateCustomer.checkPhoneNumber(phoneCus));
        System.out.print("Enter email" );
        String emailCus = sc.nextLine();
        String typeCus = null;
        System.out.println("-- Type of Customer-- \n" +
                "1. Member \n" +
                "2. Silver \n" +
                "3. Gold \n" +
                "4. Platinum \n" +
                "5. Diamond \n");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                typeCus = "Member";
                break;
            case "2":
                typeCus = "Silver";
                break;
            case "3":
                typeCus = "Gold";
                break;
            case "4":
                typeCus = "Platinum";
                break;
            case "5":
                typeCus = "Diamond";
                break;
            default:
                System.err.println("Please choose from 1 to 5!!");
        }
        System.out.print("Enter address: ");
        String addressCus = sc.nextLine();
        Customer newCustomer = new Customer(idCus,nameCus,dateCus,genderCus,identityCus,phoneCus,emailCus,typeCus,addressCus);
        customerRepository.addNew(newCustomer);
        System.out.println("Add success!!");
    }
    @Override
    public void edit() {
        System.out.print("Enter id you wanna edit(KH-YYYY) with Y is number: ");
        String editID = sc.nextLine();
        int check = customerRepository.checkId(editID);
        List<Customer> customerList = customerRepository.showList();
        boolean flag = true;
        if(check >= 0){
            do {
                System.out.println("--List Edit Option: -- \n" +
                        "1. Name \n" +
                        "2. Day of Birth \n" +
                        "3. Gender \n" +
                        "4. identityNumber \n" +
                        "5. Phone Number \n" +
                        "6. Email \n" +
                        "7. Type of Customer \n" +
                        "8. Address \n " +
                        "0. Out");
                String choice = sc.nextLine();
                switch (choice){
                    case "1":
                        String nameCus;
                        do {
                            System.out.println("Enter Full Name(With Capitalization first word): ");
                            nameCus = sc.nextLine();
                        }while (!ValidateCustomer.checkName(nameCus));
                        customerList.get(check).setFullName(nameCus);
                        break;
                    case "2":
                        String dateCus;
                        do {
                            System.out.println("Enter day of birth(With age above 18): ");
                            dateCus = sc.nextLine();
                        }while (!ValidateCustomer.checkAge(dateCus));
                        customerList.get(check).setDateOfBirth(dateCus);
                        break;
                    case "3":
                        System.out.print("Enter gender: ");
                        String genderCus = sc.nextLine();
                        customerList.get(check).setGender(genderCus);
                        break;
                    case "4":
                        String identityCus;
                        do {
                            System.out.println("Enter identityNumber(Input 9 number): ");
                            identityCus = sc.nextLine();
                        }while (!ValidateCustomer.checkIdentityNumberCus(identityCus));
                        customerList.get(check).setIdentityNumber(identityCus);
                        break;
                    case "5":
                        String phoneCus;
                        do {
                            System.out.println("Enter phone number(Start number 0 and enough 10 number):");
                            phoneCus = sc.nextLine();
                        }while (!ValidateCustomer.checkPhoneNumber(phoneCus));
                        customerList.get(check).setPhoneNumber(phoneCus);
                        break;
                    case "6":
                        System.out.print("Enter email" );
                        String emailCus = sc.nextLine();
                        customerList.get(check).setEmail(emailCus);
                        break;
                    case "7":
                        String typeCus = null;
                        System.out.println("-- Type of Customer-- \n" +
                                "1. Member \n" +
                                "2. Silver \n" +
                                "3. Gold \n" +
                                "4. Platinum \n" +
                                "5. Diamond \n");
                        String choice1 = sc.nextLine();
                        switch (choice1){
                            case "1":
                                typeCus = "Member";
                                break;
                            case "2":
                                typeCus = "Silver";
                                break;
                            case "3":
                                typeCus = "Gold";
                                break;
                            case "4":
                                typeCus = "Platinum";
                                break;
                            case "5":
                                typeCus = "Diamond";
                                break;
                            default:
                                System.err.println("Please choose from 1 to 5!!");
                        }
                        customerList.get(check).setTypeOfCustomer(typeCus);
                    case "8":
                        System.out.print("Enter address: ");
                        String addressCus = sc.nextLine();
                        customerList.get(check).setAddress(addressCus);
                        break;
                    case "0":
                        flag = false;
                        break;
                    default:
                        System.err.println("WRONG CHOOSE!!!1");
                }
            }while (flag);
            customerRepository.edit();
        }else{
            System.out.println("Not found id");
        }
    }
}
