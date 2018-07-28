package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.City;


@Repository
public interface Cityrepository extends JpaRepository<City,Long> {

}
