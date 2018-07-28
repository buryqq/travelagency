package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.Airport;


@Repository
public interface Airportrepository extends JpaRepository<Airport,Long> {

}
