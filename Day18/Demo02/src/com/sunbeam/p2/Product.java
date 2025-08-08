package com.sunbeam.p2;

public class Product implements Comparable<Product> {
	int pid;
	String name;
	double price;

	public Product() {
	}

	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		return this.pid - o.pid;
	}

}
