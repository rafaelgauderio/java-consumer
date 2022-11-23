package utilities;

import java.util.function.Consumer;

import entities.Product;

public class PriceUptade implements Consumer<Product>{

	@Override
	public void accept(Product pro) {
		pro.setPrice(pro.getPrice()*1.20);
		
	}

}
