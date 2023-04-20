package bai_tap_mvc.repository;

import bai_tap_mvc.model.Spend;

import java.util.ArrayList;
import java.util.List;

public class SpendRepository implements ISpendRepository{
    private static ArrayList<Spend> lists = new ArrayList<>();
    static {
        lists.add(new Spend(1,"Coca","12/2/2003",10000,"A"));
        lists.add(new Spend(2,"Sprite","14/2/2003",11000,"B"));
        lists.add(new Spend(3,"Water","16/2/2003",5000,"C"));
    }
    @Override
    public List<Spend> spendList() {
        return lists;
    }

    @Override
    public void addNew(Spend spend) {
        lists.add(spend);
    }

    @Override
    public boolean deleteID(int id) {
        for (int i = 0; i < lists.size(); i++) {
            if(id == lists.get(i).getIdSpend()){
                lists.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editSpend(int id) {
        for (int i = 0; i < lists.size(); i++) {
            if(id == lists.get(i).getIdSpend()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int findByID(int id) {
        for (int i = 0; i < lists.size(); i++) {
            if(id == lists.get(i).getIdSpend()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < lists.size(); i++) {
            if ((lists.get(i).getNameSpend().contains(name))) {
                return i;
            }
        }
        return -1;
    }
}
