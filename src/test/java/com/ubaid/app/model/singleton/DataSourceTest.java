package com.ubaid.app.model.singleton;

import java.sql.Connection;

import junit.framework.TestCase;

public class DataSourceTest extends TestCase {

	public void testGetConnection()
	{
		Connection connection = DataSource.getConnection();
		assertNotNull(connection);
	}

}
