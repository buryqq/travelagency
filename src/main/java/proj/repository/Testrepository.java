package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.Testmodel;



@Repository
public interface Testrepository extends JpaRepository<Testmodel,Long> {


}
