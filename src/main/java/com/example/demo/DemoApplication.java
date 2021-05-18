package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "root";

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl,username, password);
			System.out.println("Connected to PostgreSQL Server");
			connection.close();
		} catch (SQLException throwables) {
			System.out.println("Error in Connecting to PostgreSQL Server");
			throwables.printStackTrace();
		}

//		SpringApplication.run(DemoApplication.class, args);
	}

}
