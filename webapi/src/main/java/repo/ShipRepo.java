package repo;


import org.springframework.data.jpa.repository.JpaRepository;
import model.shipModel;

public interface ShipRepo extends JpaRepository<shipModel, int> {

}
