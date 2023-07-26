package eCommerceApp;

class Category {
	private String name;
	private SubCategory[] subCategories;

	public Category(String name, int subCatcnt) {
		this.name = name;
		this.subCategories = new SubCategory[subCatcnt];
	}

	public String getName() {
		return name;

	}

	public void addSubCat(int index, SubCategory subCat) {
		subCategories[index] = subCat;
	}

	public SubCategory getSubCat(int index) {
		return subCategories[index];

	}

	public int getSubCategoryCnt() {
		return subCategories.length;
	}

}
