package com.sunbeam.p1;

class MyResource implements AutoCloseable {
	public MyResource() {
		System.out.println("Resource is open...");
	}

	// Autoclosable
	@Override
	public void close() throws Exception {
		// perform task to close the resource
		boolean isResourceclosed = true;

		if (isResourceclosed)
			System.out.println("MyResouce is closed...");
		else
			throw new Exception("Failed to close the resource ...");
	}

	// Closable
//	@Override
//	public void close() throws IOException {
//		// TODO Auto-generated method stub
//		
//	}

}

public class Program01 {

	public static void main(String[] args) {
		try (MyResource myResource = new MyResource()) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
