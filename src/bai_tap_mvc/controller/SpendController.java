package bai_tap_mvc.controller;

import bai_tap_mvc.service.SpendService;

import java.util.Scanner;

public class SpendController {
    private SpendService spendService = new SpendService();
    public void displaySpend(){
        Scanner sc  = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----MENU----- \n" +
                    "1.Display \n" +
                    "2.Add \n" +
                    "3.Delete \n" +
                    "4.Edit \n" +
                    "5.Find by ID \n" +
                    "6. Find by name \n" +
                    "0.Out list");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    spendService.spendList();
                    break;
                case "2":
                    spendService.addNew();
                    break;
                case "3":
                    spendService.deleteByID();
                    break;
                case "4":
                    spendService.editSpend();
                    break;
                case "5":
                    spendService.findByID();
                    break;
                case "6":
                    spendService.findByName();
                    break;
                case "0":
                    flag = false;
            }
        }while (flag);
    }


}
