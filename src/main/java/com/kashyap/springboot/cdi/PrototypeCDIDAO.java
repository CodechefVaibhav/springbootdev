package com.kashyap.springboot.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PrototypeCDIDAO {

	@Inject
	private JdbcConnectionCDI connection;

	public JdbcConnectionCDI getConnection() {
		return connection;
	}

	public void setConnection(JdbcConnectionCDI connection) {
		this.connection = connection;
	}
}
