package com.sunbeam.p1;

// custom checked exception
class InvalidTimeException extends Exception {
	public InvalidTimeException() {
	}

	public InvalidTimeException(String message) {
		super(message);
	}
}

class Time {
	private int hr;
	private int min;

	public Time() {
	}

	public void setHr(int hr) throws InvalidTimeException {
		if (hr < 0 || hr > 23)
			throw new InvalidTimeException(); // custom checked
		this.hr = hr;
	}

	public void setMin(int min) throws InvalidTimeException {
		if (min < 0 || min > 59)
			throw new InvalidTimeException("min should be between 0 and 59");
		this.min = min;
	}

	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	}

}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		try {
			t1.setHr(20); // 0 to 23
			t1.setMin(70); // 0 to 59
			System.out.println(t1);
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
	}

}
