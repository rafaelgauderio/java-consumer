package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

import entities.Product;
import utilities.PriceUptade;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Consumer is a functional interface\n"
				+ "Consumer has only one method called accept that receives a generics as an argument.\n");
		
		list.add(new Product("Car",50000.00));
		list.add(new Product("Bike",5000.00));
		list.add(new Product("Tablet",2000.00));
		list.add(new Product("Fan",300.00));
		list.add(new Product("Computer",1500.00));
		
		System.out.println("Original List");
		for (Product nickname : list) {
			System.out.println(nickname);
		}
		
		System.out.println();
		System.out.println("Update Price in 20%");
		
		//Scroll through the collection and execute a consumer on that collection
		list.forEach(new PriceUptade());
		// reference method to println
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Update price in 10% with methot reference static");
		list.forEach(Product::staticPriceUpdate);
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Update price in 20% with a method reference non static");
		list.forEach(Product::nonStaticPriceUpdate);
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.print("Inform a factor to update price:");
		double factor=sc.nextDouble();
		
		Consumer<Product> consumer = pro -> {
			
			pro.setPrice(pro.getPrice()* factor);
		};
		System.out.println("Declared lambda expression");
		System.out.println("Prices update by factor "+factor);
		list.forEach(consumer);
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Update prices in 25% with a inline lambada expression");
		
		double factor2=1.25;
		list.forEach(pro ->pro.setPrice(pro.getPrice()*factor2));
		list.forEach(System.out::println);
		
		sc.close();
		
		
		
	}

}
