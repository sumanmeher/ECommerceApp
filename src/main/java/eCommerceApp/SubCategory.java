package eCommerceApp;

class SubCategory {
	private String name;
	private Prod[] products;

	public SubCategory(String name, int prodcnt) {
		this.name = name;
		this.products = new Prod[prodcnt];
	}

	public String getName() {
		return name;
	}

	public void addProd(int index, Prod product) {
		products[index] = product;
	}

	public Prod getProd(int index) {
		return products[index];
	}

	public int getProdCnt() {
		return products.length;
	}
}