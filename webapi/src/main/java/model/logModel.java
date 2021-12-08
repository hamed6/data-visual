package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class logModel {


	//IMO column shouldn't be empty and updatable
	//@Column(nullable = false, updatable = false)
	@Id
	private int imo;
	// *** panel ID and filename extracted from log
	//private String logHCID;
	private String logFilename;

	// Log files details
	private Date logTime;
	private String logClass;
	private String logDescrption;
	private String logMore;
	
	
	
	
	public logModel() {
	}
	
	
	
	public logModel(int imo, String logFilename, Date logTime, String logClass, String logDescrption, String logMore) {
		super();
		this.imo = imo;
		this.logFilename = logFilename;
		this.logTime = logTime;
		this.logClass = logClass;
		this.logDescrption = logDescrption;
		this.logMore = logMore;
	}



	public int getImo() {
		return imo;
	}
	public void setImo(int imo) {
		this.imo = imo;
	}
	public String getLogFilename() {
		return logFilename;
	}
	public void setLogFilename(String logFilename) {
		this.logFilename = logFilename;
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
	
	
}
