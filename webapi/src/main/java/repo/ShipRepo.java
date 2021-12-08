package repo;


import org.springframework.data.jpa.repository.JpaRepository;
import model.shipModel;

public interface ShipRepo extends JpaRepository<shipModel, Integer> {

	

	
	// *Optional* if adding instead of shipModle, then in case that the ship doesnt exists, it wont complain.
	//Optional findshipModelById(int imo);
	shipModel findshipModelById(int imo);

}
