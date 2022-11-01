package org.tnsindia.enumdemo;

import java.awt.Menu;

public class EnumMealDemo {

	public static void main(String[] args) {
		//Meal m=new.Mael();
		for (Menu m: Meal.values()) {
			
			System.out.println(m+" "+m.getValue());
		}

	}

}