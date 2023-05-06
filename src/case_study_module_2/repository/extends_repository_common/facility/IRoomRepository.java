package case_study_module_2.repository.extends_repository_common.facility;

import case_study_module_2.model.extend.facility.Room;

import java.util.List;

public interface IRoomRepository {
    List<Room> showListRoom();
    void addNewRoom(Room room);
}
