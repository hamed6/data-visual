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
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	// Ship info specific
	//IMO column shouldn't be empty and updatable
		//@Column(nullable = false, updatable = false)
	private int imo;
	private String shipName;
	
	// Log files details
	private Date logTime;
	private String logClass;
	private String logDescrption;
	private String logMore;
	
	// *** panel ID and filename extracted from log
	//private String logHCID;
	private String logFilename;
	
	public shipModel() {
		
	}
	public shipModel(int id, int imo, String shipName, Date logTime, String logClass, String logDescrption,
			String logMore, String logFilename) {
		super();
		this.id = id;
		this.imo = imo;
		this.shipName = shipName;
		this.logTime = logTime;
		this.logClass = logClass;
		this.logDescrption = logDescrption;
		this.logMore = logMore;
		this.logFilename = logFilename;
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

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public String getLogClass() {
		return logClass;
	}

	public void setLogClass(String logClass) {
		this.logClass = logClass;
	}

	public String getLogDescrption() {
		return logDescrption;
	}

	public void setLogDescrption(String logDescrption) {
		this.logDescrption = logDescrption;
	}

	public String getLogMore() {
		return logMore;
	}

	public void setLogMore(String logMore) {
		this.logMore = logMore;
	}

	public String getLogFilename() {
		return logFilename;
	}

	public void setLogFilename(String logFilename) {
		this.logFilename = logFilename;
	}

	
	
/*	# To get and convert date and time
  	java.util.Date dt = new java.util.Date();
	java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String currentTime = sdf.format(dt);
*/
}
