package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Product;
import utilities.PriceUptade;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Car",50000.00));
		list.add(new Product("Bike",5000.00));
		list.add(new Product("Tablet",2000.00));
		list.add(new Product("Fan",300.00));
		
		System.out.println("Original List");
		for (Product nickname : list) {
			System.out.println(nickname);
		}
		
		System.out.println();
		System.out.println("Update Price in 20%");
		
		//Scroll through the collection and execute a consumer on that collection
		list.forEach(new PriceUptade());
		list.forEach(System.out::println);
		
	}

}
