package entities;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
			return name;
						
		}
	
	public void setName(String name) {
		this.name=name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	// static method does not mess with the object itself.
	// it changes tha object that the method will receive as a parameter
	public static void staticPriceUpdate(Product pro) {
		pro.setPrice(pro.getPrice()*1.1);
	}
	
	public void nonStaticPriceUpdate() {
		this.setPrice(getPrice()*1.20);
	}


	@Override
	public String toString() {
		return "Product [name= " + name + ", price= " + String.format("U$%.2f",price) + "]";
	}
	
	
}