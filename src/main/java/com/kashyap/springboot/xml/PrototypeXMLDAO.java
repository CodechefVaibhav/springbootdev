package com.kashyap.springboot.xml;


public class PrototypeXMLDAO {

	public PrototypeXMLDAO(){
		System.out.println("PrototypeXMLDAO Constructor Called");
	}
	
	private JdbcConnectionXML connection;

	public JdbcConnectionXML getConnection() {
		return connection;
	}

	public void setConnection(JdbcConnectionXML connection) {
		this.connection = connection;
	}
}
