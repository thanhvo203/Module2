package case_study_module_2.repository.implement_repository.facility;


import case_study_module_2.model.absract.facility.AbstractFacility;
import case_study_module_2.model.extend.facility.House;
import case_study_module_2.model.extend.facility.Room;
import case_study_module_2.model.extend.facility.Villa;
import case_study_module_2.repository.extends_repository_common.facility.IFacilityRepository;
import case_study_module_2.utils.read_and_write.read_and_write_facility.ReadAndWriteHouse;
import case_study_module_2.utils.read_and_write.read_and_write_facility.ReadAndWriteRoom;
import case_study_module_2.utils.read_and_write.read_and_write_facility.ReadAndWriteVilla;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final String PATH_ROOM = "D:\\Codegym\\module2\\src\\case_study_module_2\\data\\facitity_data\\room_data.csv";
    private static final String PATH_HOUSE = "D:\\Codegym\\module2\\src\\case_study_module_2\\data\\facitity_data\\house_data.csv";
    private static final String PATH_VILLA = "D:\\Codegym\\module2\\src\\case_study_module_2\\data\\facitity_data\\villa_data.csv";
    private List<Room> roomList = ReadAndWriteRoom.readFileRoom(PATH_ROOM);
    private List<Villa> villaList = ReadAndWriteVilla.readFileVilla(PATH_VILLA);
    private List<House> houseList = ReadAndWriteHouse.readFileHouse(PATH_HOUSE);
    private static LinkedHashMap<AbstractFacility, Integer> linkedHashMap = new LinkedHashMap<>();


    @Override
    public Map<AbstractFacility, Integer> showListFacitity() {
        for (AbstractFacility villa : villaList) {
            linkedHashMap.put(villa, 0);
        }
        for (AbstractFacility house : houseList) {
            linkedHashMap.put(house, 0);
        }
        for (AbstractFacility room : roomList) {
            linkedHashMap.put(room, 0);
        }
        return linkedHashMap;
    }

    @Override
    public Map<AbstractFacility, Integer> displayMaintain() {
        Set<AbstractFacility> takeValue = linkedHashMap.keySet();
        boolean flag = true;
        for (AbstractFacility facility : takeValue) {
            if (linkedHashMap.get(facility) >= 4) {
                flag = false;
                System.out.println("This facility is maintain : " + facility.getServiceName());
                linkedHashMap.put(facility,0);
            }
        }
        if (flag) {
            System.out.println("Doesn't have facility need to maintain!!!!");
        }
        return linkedHashMap ;

    }
//    public Map<AbstractFacility,Integer> usedFacility(){
//
//    }
}
