package com.tcs;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnUtils {

	static BasicDataSource dataSource = null;
	
	static {
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite:C://Users//USER//sqlite//Customer.db");
//		dataSource.setMaxActive(10);
	}

}
