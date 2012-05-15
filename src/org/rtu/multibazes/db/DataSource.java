package org.rtu.multibazes.db;

public abstract class DataSource {
	
	private String name;
	private String type;
	private String dsn;
	

	
	/**
	 * Constructor takes in <source></source> XML tag from schema and creates
	 * representation of database schema internally.
	 */
	public DataSource() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	
	
}
