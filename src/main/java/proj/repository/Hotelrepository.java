package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.Hotel;


@Repository
public interface Hotelrepository extends JpaRepository<Hotel,Long> {

}
