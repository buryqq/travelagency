package proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.model.PurchasedTrip;


@Repository
public interface Purchasedtriprepository extends JpaRepository<PurchasedTrip,Long> {

}
