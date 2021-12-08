package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.shipModel;
import repo.ShipRepo;

@Service
public class ShipService {
	
	@Autowired
	private ShipRepo shipRepo;
	
	public shipModel addshipModel(shipModel shipmodel) {
		return shipRepo.save(shipmodel);
	}
	
	public shipModel updateshipModel(shipModel shipmodel) {
		return shipRepo.save(shipmodel);
	}
	
	public List<shipModel> findallshipModel(){
		return shipRepo.findAll();
	}
	public shipModel findshipModelById(int imo) {
		return shipRepo.findshipModelById(imo);
//		return shipRepo.findshipModelById(imo).orElseThrow(()) -> new UserPrincipalNotFoundException("this ship doenst exist"));
	}
}
