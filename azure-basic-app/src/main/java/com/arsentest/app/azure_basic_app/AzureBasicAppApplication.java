package com.arsentest.app.azure_basic_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureBasicAppApplication {

	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/firsttest?useSSL=false&serverTimezone=UTC";
		String user="root";
		String password = "amiars05052006A!";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,user,password);
			
			System.out.println("Grats u connected to " + url);
			
			String query = "Insert into userstest(name) values ('Arsen')";
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			
			System.out.println("Data  inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
