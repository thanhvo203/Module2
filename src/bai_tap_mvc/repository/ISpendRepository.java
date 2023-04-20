package bai_tap_mvc.repository;

import bai_tap_mvc.model.Spend;

import java.util.List;

public interface ISpendRepository {
     List<Spend> spendList();
     void addNew(Spend spend);
     boolean deleteID(int id);
     boolean editSpend(int id);
     int findByID(int id);
     int findByName(String name);
}
