package com.sunbeam.p1;

public class Program01 {
	static boolean isSunbeamDisplayed = false;

	public static void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Object obj = new Object(); // monitor

		class SunbeamThread extends Thread {
			String str = "sunbeam";

			@Override
			public void run() {
				synchronized (obj) {
					for (int i = 0; i < str.length(); i++) {
						delay();
						System.out.print(str.charAt(i));
						isSunbeamDisplayed = true;
						obj.notify();
					} // obj unlock
			}
		}

		class InfotechThread extends Thread {
			String str = " Infotech";

			@Override
			public void run() {
				synchronized (obj) {
					try {
						if (!isSunbeamDisplayed)
							obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					for (int i = 0; i < str.length(); i++) {
						delay();
						System.out.print(str.charAt(i));
					} // unlock obj
				}
			}
		}

		InfotechThread it = new InfotechThread();
		it.start();
		SunbeamThread st = new SunbeamThread();
		st.start();

		System.out.println("st state - " + st.getState());
		System.out.println("it state - " + it.getState());
	}
}
