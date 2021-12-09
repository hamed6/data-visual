package controller;

import service.ShipService;

import java.net.http.HttpRequest;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.shipModel;

@RestController
@RequestMapping("/ship")
public class shipController {
	final ShipService shipService;
	
//	@Autowired
	public shipController (ShipService shipService){
		this.shipService=shipService; 	
	}
	
	public ResponseEntity<List<shipModel>> getAllShips(){
		List<shipModel> shipmodels=shipService.findallshipModel();
		return new ResponseEntity<>(shipmodels, HttpStatus.OK);
	}
	
	@GetMapping("/{imo}")
	public ResponseEntity<shipModel> getOneShip(@PathVariable("imo")  int imo){
			shipModel shipmodel=shipService.findshipModelById(imo);
			return new ResponseEntity<>( shipmodel, HttpStatus.OK);
	}
	
	
}
