package case_study_module_2.service.implement_service.facility;

import case_study_module_2.model.absract.facility.AbstractFacility;
import case_study_module_2.repository.implement_repository.facility.FacilityRepository;
import case_study_module_2.service.extends_service_common.facility.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
      FacilityRepository facilityRepository = new FacilityRepository();
      Scanner sc = new Scanner(System.in);


      @Override
      public void displayFacilityMenu() {
           Map<AbstractFacility,Integer> getRepo =  facilityRepository.showListFacitity();
           Set<AbstractFacility> display= getRepo.keySet();
            for (AbstractFacility facility: display) {
                  System.out.println(facility + "-" + getRepo.get(facility));
            }
      }
      @Override
      public void displaymaintainFacility() {
          Map<AbstractFacility,Integer> getRepo = facilityRepository.displayMaintain();
          Set<AbstractFacility> display = getRepo.keySet();
          for (AbstractFacility maintain  : display) {
              System.out.println(maintain+"-" +getRepo.get(maintain));
          }
      }

}
