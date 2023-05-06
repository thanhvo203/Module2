package case_study_module_2.repository.implement_repository.facility;

import case_study_module_2.model.extend.facility.Villa;
import case_study_module_2.repository.extends_repository_common.facility.IVillaRepository;
import case_study_module_2.utils.read_and_write.read_and_write_facility.ReadAndWriteVilla;

import java.util.List;

public class VillaRepository implements IVillaRepository {
    private static final String PATH_VILLA ="D:\\Codegym\\module2\\src\\case_study_module_2\\data\\facitity_data\\villa_data.csv";
    private static List<Villa> villaList = ReadAndWriteVilla.readFileVilla(PATH_VILLA);
    @Override
    public List<Villa> showListVilla() {
       villaList = ReadAndWriteVilla.readFileVilla(PATH_VILLA);
       return villaList;
    }


    @Override
    public void addNewVilla(Villa villa) {
        villaList.add(villa);
        ReadAndWriteVilla.writeFileVilla(PATH_VILLA,villaList);
    }

}
