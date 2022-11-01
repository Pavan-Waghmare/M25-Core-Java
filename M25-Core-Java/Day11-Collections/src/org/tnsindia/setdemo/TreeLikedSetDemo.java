package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeLikedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		s.add("Pooja");
		s.add("Sonu");
		s.add("Monu");
		s.add("Raju");
		System.out.println("The elements in the TreeSet are: "+s);

	}

}