package org.tnsindia.client;

import org.tnsindia.appication.GSNormalAcc;
import org.tnsindia.appication.GSPrimeAcc;
import org.tnsindia.appication.GSShopFactory;
import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(12121, "Pavan Waghmare", 840, true);
		NormalAcc n=new GSNormalAcc(13171, "Vidya Paygude", 840,50 );
		
		System.out.println("Prime Account Details: ");
		p.bookProduct(p.getCharges());
		
		System.out.println();
		System.out.println("Normal Account Details: ");
		n.bookProduct(n.getCharges());
		
		//System.out.println(p);
		//System.out.println(n);


	}

}