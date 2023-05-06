package case_study_module_2.repository.implement_repository.facility;

import case_study_module_2.model.extend.facility.House;
import case_study_module_2.repository.extends_repository_common.facility.IHouseRepository;
import case_study_module_2.utils.read_and_write.read_and_write_facility.ReadAndWriteHouse;

import java.util.LinkedHashMap;
import java.util.List;

public class HouseRepository implements IHouseRepository {
    private static final String PATH_HOUSE = "D:\\Codegym\\module2\\src\\case_study_module_2\\data\\facitity_data\\house_data.csv";
    private static List<House> houseList = ReadAndWriteHouse.readFileHouse(PATH_HOUSE);
    @Override
    public List<House> showListHouse() {
        houseList = ReadAndWriteHouse.readFileHouse(PATH_HOUSE);
        return houseList;
    }
    @Override
    public void addNewHouse(House house) {
        houseList.add(house);
        ReadAndWriteHouse.writeFileHouse(PATH_HOUSE,houseList);
    }
}
