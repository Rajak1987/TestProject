package utility;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	 

public class DbQuery {

	Connection con;
	Statement stmt;
	ResultSet rs;
	String entityType,dbUrl,username,password;

	public void getConnection() throws  ClassNotFoundException, SQLException {	

		entityType=null;

		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		

		Class.forName("oracle.jdbc.driver.OracleDriver");
		dbUrl = "jdbc:oracle:thin:@IN2NPVTMMOB2.dev.corp.local:1521:O18C3";

		//Database Username		
		username = "TMGR";	

		//Database Password		
		password = "TMGR";
	}

	public String executeSqlQuery(String Id)throws  ClassNotFoundException, SQLException {

		//Query to Execute		
		String query = "select PARENT_ENT_TYP from ONDUTY_ENT_T where PARENT_ENT_ID="+Id;

		//Create Connection to DB		
		con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
		stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
		rs= stmt.executeQuery(query);					

		// While Loop to iterate through all data and print results		
		while (rs.next()){
			entityType = rs.getString(1);								        

		}

		return entityType;


	}

	public void closeConnection() throws  ClassNotFoundException, SQLException {

		con.close();
		stmt.close();
		rs.close();

	}

}
