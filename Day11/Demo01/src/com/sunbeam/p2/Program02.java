package com.sunbeam.p2;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

class MyRersource implements Closeable {
	boolean SqlConnection;

	public MyRersource() {
		// database connection is established
		SqlConnection = true;
		System.out.println("Sql connection is opened...");
	}

	public void getAllProducts() {
		System.out.println("All products fetched...");
	}

	public void addProduct() {
		System.out.println("Product Added...");
	}

	@Override
	public void close() throws IOException {
		// sql connection is now disconnected
		// SqlConnection = false;
		if (SqlConnection)
			throw new IOException(new SQLException("Connection not able to close..."));// Exception Chaining
		else
			System.out.println("Sql connection is closed...");
	}

}

public class Program02 {

	public static void main(String[] args) {
		try (MyRersource myRersource = new MyRersource()) {
			myRersource.addProduct();
			myRersource.getAllProducts();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
