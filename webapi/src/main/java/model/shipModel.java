package model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class shipModel {
	
	// Unique, index, 
	private int id;
	
	// Ship info specific 
	private int imo;
	private String shipName;
	
	// Log files details
	private Date logTime;
	private String logClass;
	private String logDescrption;
	private String logMore;
	
	// *** panel ID and filename extracted from log
	private String logHCID;
	private String logFilename;
	
	
/*	# To get and convert date and time
  	java.util.Date dt = new java.util.Date();
	java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String currentTime = sdf.format(dt);
*/
}
