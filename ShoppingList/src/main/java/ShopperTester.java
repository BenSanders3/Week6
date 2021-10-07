import java.util.List;

import controller.ShopperHelper;
import model.Shopper;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class ShopperTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopper bill = new Shopper("Bill");
		
		ShopperHelper sh = new ShopperHelper();
		
		sh.insertShopper(bill);
		Shopper jim = new Shopper("Jim");
		sh.insertShopper(jim);
		List<Shopper> allShoppers = sh.showAllShoppers();
		for(Shopper a: allShoppers) {
			System.out.println(a.toString());
		}
	}

}
