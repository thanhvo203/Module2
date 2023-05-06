package case_study_module_2.repository.extends_repository_common.facility;

import case_study_module_2.model.extend.facility.House;
import case_study_module_2.repository.implement_repository.facility.HouseRepository;

import java.util.List;

public interface IHouseRepository {
    List<House> showListHouse();
    void addNewHouse(House house);


}
