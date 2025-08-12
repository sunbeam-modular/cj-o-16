package com.sunbeam.p1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// meta-annotation
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@interface TestAnnotation {

}

@TestAnnotation()
class Test {

	@TestAnnotation
	int num1;

	@TestAnnotation
	public void method() {

	}

}

class TestSub extends Test {

}

public class Program03 {

	@Deprecated
	public static void dowork() {
	}

	public static void doMywork() {
	}

	public static void main(String[] args) {
		// do the work
		dowork();
		doMywork();
	}

}
