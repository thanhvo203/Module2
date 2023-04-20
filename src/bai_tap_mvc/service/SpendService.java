package bai_tap_mvc.service;

import bai_tap_mvc.model.Spend;
import bai_tap_mvc.repository.SpendRepository;

import java.util.List;
import java.util.Scanner;

public class SpendService implements ISpendService{
    Scanner sc = new Scanner(System.in);
    private SpendRepository spendRepository = new SpendRepository();
    @Override
    public void spendList() {
        List<Spend> spends = spendRepository.spendList();
        for (Spend spend: spends) {
            System.out.println(spend);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name spend: ");
        String name = sc.nextLine();
        System.out.println("Enter date");
        String date = sc.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Comment: ");
        String comment = sc.nextLine();
        Spend newSpend = new Spend(id,name,date,price,comment);
        spendRepository.addNew(newSpend);
        System.out.println("Add success: " + newSpend.getNameSpend());
    }

    @Override
    public void deleteByID() {
        System.out.println("Enter id you want delete: ");
        int id = sc.nextInt();
        boolean check = spendRepository.deleteID(id);
        if(check){
            System.out.println("Delete success!!!");
        }else{
            System.out.println("Delele failed");
        }
    }

    @Override
    public void editSpend() {
        System.out.println("Enter id want to edit: ");
        int id = Integer.parseInt(sc.nextLine());
        List<Spend> spends = spendRepository.spendList();
        if(spendRepository.editSpend(id)) {
            for (int i = 0; i < spends.size(); i++) {
                    System.out.println("Enter name : ");
                    String name = sc.nextLine();
                    spends.get(i).setNameSpend(name);
                    System.out.println("Enter date");
                    String date = sc.nextLine();
                    spends.get(i).setDate(date);
                    System.out.println("Enter price:");
                    double money = Double.parseDouble(sc.nextLine());
                    spends.get(i).setMoney(money);
                    System.out.println("Enter comment: ");
                    String comment = sc.nextLine();
                    spends.get(i).setComment(comment);
                }
        }else {
            System.out.println("Not found id");
        }
    }

    @Override
    public void findByID() {
        System.out.println("Enter id wanna find: ");
        int findID = sc.nextInt();
        int checkID = spendRepository.findByID(findID);
        if(checkID >= 0){
            System.out.println(spendRepository.spendList().get(checkID));
        }else{
            System.out.println("Not found id!!!!1");
        }
    }

    @Override
    public void findByName() {
        System.out.println("Enter name wanna find: ");
        String name = sc.nextLine();
        int checkName = spendRepository.findByName(name);
        if(checkName >=0){
            System.out.println(spendRepository.spendList().get(checkName));
        }else{
            System.out.println("Not found id!!!!");
        }

    }
}
