package org.tnsindia.lambdaecpdemo;

public class FUnctionalExampeINterfaceExecutor {

	public static void main(String[] args) {
		FunctionalInterfaceDemo obj=(int a,int b)->
		{
			String result=(a>b)?a:b;
			
			//System.out.println("The maximum number is:" +result);
			return result;
			
		};
		System.out.println("The maximum number is:" +obj.max(34, 67));

	}

}