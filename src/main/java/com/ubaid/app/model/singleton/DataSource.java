package com.ubaid.app.model.singleton;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSource
{
	private static Connection connection = createConnection();
	
	private DataSource()
	{
		
	}
	
	public static void main(String [] args)
	{
		getConnection();
	}
	
	public static Connection getConnection()
	{
		try
		{
			if(connection.isClosed())
				connection = createConnection();			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	private static Connection createConnection()
	{
		MysqlDataSource dataSource = new MysqlDataSource();
		Connection connection = null;
		try
		{
			dataSource.setAllowPublicKeyRetrieval(true);
			dataSource.setUseSSL( false );
		    dataSource.setServerTimezone("GMT");
		    dataSource.setAutoReconnect(true);
		    dataSource.setServerName("localhost");	
		    dataSource.setUseSSL(false);
		    dataSource.setDatabaseName("SMSSP");
		    dataSource.setPortNumber(3306);
		    dataSource.setUser("root");
		    dataSource.setPassword("password");
		    dataSource.setRewriteBatchedStatements(true);
		    connection = dataSource.getConnection();
		    System.out.println("Connected");
			
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
		
	    return connection;			
	}
}
