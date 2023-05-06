package case_study_module_2.repository.implement_repository.facility;

import case_study_module_2.model.extend.facility.Room;
import case_study_module_2.repository.extends_repository_common.facility.IRoomRepository;
import case_study_module_2.utils.read_and_write.read_and_write_facility.ReadAndWriteRoom;

import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static final String PATH_ROOM = "D:\\Codegym\\module2\\src\\case_study_module_2\\data\\facitity_data\\room_data.csv";
    private static List<Room> roomList = ReadAndWriteRoom.readFileRoom(PATH_ROOM);

    @Override
    public List<Room> showListRoom() {
        roomList = ReadAndWriteRoom.readFileRoom(PATH_ROOM);
        return roomList;
    }
    @Override
    public void addNewRoom(Room room) {
       roomList.add(room);
       ReadAndWriteRoom.writeFileRoom(PATH_ROOM,roomList);
    }
}
