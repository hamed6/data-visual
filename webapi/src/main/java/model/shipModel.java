package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipModel")
public class shipModel implements Serializable { 
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	// Ship info specific
	//IMO column shouldn't be empty and updatable
	//@Column(nullable = false, updatable = false)
	@Id
	private int imo;
	private String shipName;


	public shipModel() {
	}
	

	public shipModel(int id, int imo, String shipName) {
		super();
		this.id = id;
		this.imo = imo;
		this.shipName = shipName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getImo() {
		return imo;
	}


	public void setImo(int imo) {
		this.imo = imo;
	}


	public String getShipName() {
		return shipName;
	}


	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	
	
/*	# To get and convert date and time
  	java.util.Date dt = new java.util.Date();
	java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String currentTime = sdf.format(dt);
*/
}
