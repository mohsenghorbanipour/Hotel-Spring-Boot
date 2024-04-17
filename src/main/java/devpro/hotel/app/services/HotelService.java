package devpro.hotel.app.services;

import devpro.hotel.app.repositories.HotelRepository;
import devpro.hotel.app.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return  hotelRepository.findAll();
    }

    public Optional<Hotel> getHotelById(long id) {
        return hotelRepository.findById(id);
    }

    public Optional<Hotel> getHotelByCity(String city) {
        return hotelRepository.getHotelByCity(city);
    }

    public void saveOrUpdateHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public void deleteHotel(long id) {
        hotelRepository.deleteById(id);
    }



}
