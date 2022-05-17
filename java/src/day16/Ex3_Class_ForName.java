package day16;

import java.util.Scanner;

import day12.Car;

public class Ex3_Class_ForName {

	public static void main(String[] args) {
		//<ForName> ClassNotFound예외
		Class c = null;
		try {
			c = Class.forName("java.util.Scanner");
			System.out.println(c);
			c = Class.forName("day12.Car");
			System.out.println(c);
			//newInstance는 자바 9버전 이후에 없어짐
			//Car car = (Car)c.newInstance();
			//System.out.println(car);
			c = Class.forName("java.util.Scanner1");
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
