package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.Trip;


@Repository
public interface Triprepository extends JpaRepository<Trip,Long> {

}
