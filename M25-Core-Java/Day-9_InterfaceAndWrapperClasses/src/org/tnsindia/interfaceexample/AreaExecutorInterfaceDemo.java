package org.tnsindia.interfaceexample;

import java.awt.Shape;

public class AreaExecutorInterfaceDemo {

	public static void main(String[] args) {
		Shape a=new ShapeArea();
		((Object) a).circle();
		((Object) a).square();

	}

}