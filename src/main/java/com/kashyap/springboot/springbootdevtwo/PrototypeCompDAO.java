package com.kashyap.springboot.springbootdevtwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PrototypeCompDAO {

	@Autowired
	private JdbcConnectionComp connection;

	public JdbcConnectionComp getConnection() {
		return connection;
	}

	public void setConnection(JdbcConnectionComp connection) {
		this.connection = connection;
	}
}
