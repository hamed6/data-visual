package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repo.ShipRepo;

@Service
public class ShipService {
	
	@Autowired
	private ShipRepo shipRepo;

}
