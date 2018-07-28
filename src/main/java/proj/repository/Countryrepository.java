package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.Country;


@Repository
public interface Countryrepository extends JpaRepository<Country,Long> {

}
