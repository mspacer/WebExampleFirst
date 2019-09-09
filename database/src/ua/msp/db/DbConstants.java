package ua.msp.db;

public interface DbConstants {

	// DATABASE CONFIGURATION DETAILS
	public static final String DB_URL = "jdbc:oracle:thin:@srvoracle10:1521:orcl";
	public static final String DB_USERNAME = "scott";
	public static final String DB_PASSWORD = "tiger";

	// SELECT QUERY
	public static final String DB_SELECT_QUERY = "SELECT * FROM employee"; 
}