package eCommerceApp;

class Prod {
	private String name;
	private double price;
	private String description;
	private String productID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	Prod(String productID, String name, double price) {
		this.productID= productID;
		this.name = name;
		this.price = price;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

}
