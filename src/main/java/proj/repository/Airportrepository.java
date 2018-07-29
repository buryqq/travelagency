package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import proj.model.Airport;

import java.util.List;


@Repository
public interface Airportrepository extends JpaRepository<Airport,Long> {

    @Query("SELECT a FROM Airport a INNER JOIN a.cityid c WHERE c.name=:name")
    List<Airport> getAirportsByCityName(@Param("name")String name);




}
