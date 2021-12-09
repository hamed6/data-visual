package repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import model.shipModel;

public interface ShipRepo extends JpaRepository<shipModel, Integer> {

	

	// Query method
	// *Optional* if adding instead of shipModle, then in case that the ship doesnt exists, it wont complain.
	//Optional findshipModelById(int imo);
	Optional<shipModel> findshipModelById(int imo);

}
