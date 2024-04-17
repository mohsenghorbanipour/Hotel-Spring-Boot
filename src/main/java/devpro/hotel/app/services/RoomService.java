package devpro.hotel.app.services;

import devpro.hotel.app.repositories.RoomRepository;
import devpro.hotel.app.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return  roomRepository.findAll();
    }

    public Optional<Room> getRoomById(long id) {
        return roomRepository.findById(id);
    }

    public Optional<Room> getRoomByRoomNumber(String roomNumber) {
        return roomRepository.getRoomByRoomNumber(roomNumber);
    }

    public void saveOrUpdateRoom(Room room) {
        roomRepository.save(room);
    }

    public void deleteRoom(long id) {
        roomRepository.deleteById(id);
    }
}
