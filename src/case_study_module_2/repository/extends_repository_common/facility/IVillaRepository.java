package case_study_module_2.repository.extends_repository_common.facility;

import case_study_module_2.model.extend.facility.Villa;

import java.util.List;

public interface IVillaRepository {
    List<Villa> showListVilla();
    void addNewVilla(Villa villa);
}
