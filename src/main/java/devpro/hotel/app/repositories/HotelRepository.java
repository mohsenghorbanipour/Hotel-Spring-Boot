package devpro.hotel.app.repositories;

import devpro.hotel.app.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Optional<Hotel> getHotelByCity(String city);
}
