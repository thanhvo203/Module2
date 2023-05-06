package case_study_module_2.repository.extends_repository_common.facility;

import case_study_module_2.model.absract.facility.AbstractFacility;
import case_study_module_2.repository.repository_common.IRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public interface IFacilityRepository<E> {
    Map<E,Integer> showListFacitity();
    Map<E,Integer> displayMaintain();

}
