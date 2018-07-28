package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.Continent;


@Repository
public interface Continentrepository extends JpaRepository<Continent,Long> {

}
