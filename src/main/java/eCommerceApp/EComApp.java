package eCommerceApp;

import java.util.Scanner;

class EComApp {
	private Category[] categories;
	private Scanner sc;
	Orders od = new Orders();

	public EComApp() {
		categories = new Category[5];
		sc = new Scanner(System.in);
		addValues();
	}

	private void addValues() {
		categories[0] = new Category("Electronics", 3);

		// Mobile Phones
		categories[0].addSubCat(0, new SubCategory("Mobile", 5));

		// Phone1
		categories[0].getSubCat(0).addProd(0, new Prod("M1", "Apple gphone 15", 70999));
		categories[0].getSubCat(0).getProd(0)
				.setDescription("\r\n" + "		Brand - Apple\r\n" + "		Model Name - iPhone\r\n"
						+ "		Network Service Provider - Unlocked for All Carriers\r\n"
						+ "		Operating System - iOS\r\n" + "		Cellular Technology - 5G");

		// Phone 2
		categories[0].getSubCat(0).addProd(1, new Prod("G1", "Samsung Galaxy S22 (128 GB)", 89999));
		categories[0].getSubCat(0).getProd(1)
				.setDescription("\r\n" + "		Brand - Samsung\r\n" + "		Model Name - Galaxy S22\r\n"
						+ "		Network Service Provider - Unlocked for All Carriers\r\n"
						+ "		Operating System - Android\r\n" + "		Cellular Technology - 5G");

		// Phone 3
		categories[0].getSubCat(0).addProd(2, new Prod("P1", "Google Pixel 6 Pro (256 GB)", 79999));
		categories[0].getSubCat(0).getProd(2)
				.setDescription("\r\n" + "		Brand - Google\r\n" + "		Model Name - Pixel 6 Pro\r\n"
						+ "		Network Service Provider - Unlocked for All Carriers\r\n"
						+ "		Operating System - Android\r\n" + "		Cellular Technology - 5G");

		// Phone 4
		categories[0].getSubCat(0).addProd(3, new Prod("O1", "OnePlus 9T (128 GB)", 57999));
		categories[0].getSubCat(0).getProd(3)
				.setDescription("\r\n" + "		Brand - OnePlus\r\n" + "		Model Name - 9T\r\n"
						+ "		Network Service Provider - Unlocked for All Carriers\r\n"
						+ "		Operating System - OxygenOS\r\n" + "		Cellular Technology - 5G");

		// Phone 5
		categories[0].getSubCat(0).addProd(4, new Prod("X1", "Xiaomi Mi 12 (256 GB)", 69999));
		categories[0].getSubCat(0).getProd(4)
				.setDescription("\r\n" + "		Brand - Xiaomi\r\n" + "		Model Name - Mi 12\r\n"
						+ "		Network Service Provider - Unlocked for All Carriers\r\n"
						+ "		Operating System - MIUI\r\n" + "		Cellular Technology - 5G");

		// Earphones
		categories[0].addSubCat(1, new SubCategory("Earphones", 5));
		// Earphone 1
		categories[0].getSubCat(1).addProd(0, new Prod("E1", "Sony WF-1000XM4", 27999));
		categories[0].getSubCat(1).getProd(0).setDescription("\r\n" + "		Brand - Sony\r\n"
				+ "		Model - WF-1000XM4\r\n" + "		Wireless Technology - Bluetooth 5.2\r\n"
				+ "		Noise Cancellation - Active Noise Cancellation\r\n" + "		Battery Life - Up to 8 hours");

		// Earphone 2
		categories[0].getSubCat(1).addProd(1, new Prod("E2", "Apple AirPods Pro", 24999));
		categories[0].getSubCat(1).getProd(1).setDescription("\r\n" + "		Brand - Apple\r\n"
				+ "		Model - AirPods Pro\r\n" + "		Wireless Technology - Bluetooth 5.0\r\n"
				+ "		Noise Cancellation - Active Noise Cancellation\r\n" + "		Battery Life - Up to 4.5 hours");

		// Earphone 3
		categories[0].getSubCat(1).addProd(2, new Prod("E3", "Jabra Elite 85t", 18999));
		categories[0].getSubCat(1).getProd(2)
				.setDescription("\r\n" + "		Brand - Jabra\r\n" + "		Model - Elite 85t\r\n"
						+ "		Wireless Technology - Bluetooth 5.1\r\n"
						+ "		Noise Cancellation - Hybrid Active Noise Cancellation\r\n"
						+ "		Battery Life - Up to 5.5 hours");

		// Earphone 4
		categories[0].getSubCat(1).addProd(3, new Prod("E4", "Bose QuietComfort Earbuds", 22999));
		categories[0].getSubCat(1).getProd(3).setDescription("\r\n" + "		Brand - Bose\r\n"
				+ "		Model - QuietComfort Earbuds\r\n" + "		Wireless Technology - Bluetooth 5.1\r\n"
				+ "		Noise Cancellation - Active Noise Cancellation\r\n" + "		Battery Life - Up to 6 hours");

		// Earphone 5
		categories[0].getSubCat(1).addProd(4, new Prod("E5", "Samsung Galaxy Buds Pro", 18999));
		categories[0].getSubCat(1).getProd(4).setDescription("\r\n" + "		Brand - Samsung\r\n"
				+ "		Model - Galaxy Buds Pro\r\n" + "		Wireless Technology - Bluetooth 5.0\r\n"
				+ "		Noise Cancellation - Active Noise Cancellation\r\n" + "		Battery Life - Up to 5 hours");

		// Laptop
		categories[0].addSubCat(2, new SubCategory("Laptop", 5));

		// Laptop 1
		categories[0].getSubCat(2).addProd(0, new Prod("L1", "Dell XPS 13", 99999));
		categories[0].getSubCat(2).getProd(0)
				.setDescription("\r\n" + "		Brand - Dell\r\n" + "		Model - XPS 13\r\n"
						+ "		Processor - Intel Core i7\r\n" + "		RAM - 16 GB\r\n"
						+ "		Storage - 512 GB SSD\r\n" + "		Operating System - Windows 10\r\n"
						+ "		Display - 13.3 inches");

		// Laptop 2
		categories[0].getSubCat(2).addProd(1, new Prod("L2", "Apple MacBook Pro", 129999));
		categories[0].getSubCat(2).getProd(1).setDescription("\r\n" + "		Brand - Apple\r\n"
				+ "		Model - MacBook Pro\r\n" + "		Processor - Apple M1 chip\r\n" + "		RAM - 16 GB\r\n"
				+ "		Storage - 1 TB SSD\r\n" + "		Operating System - macOS\r\n" + "		Display - 16 inches");

		// Laptop 3
		categories[0].getSubCat(2).addProd(2, new Prod("L3", "HP Spectre x360", 89999));
		categories[0].getSubCat(2).getProd(2)
				.setDescription("\r\n" + "		Brand - HP\r\n" + "		Model - Spectre x360\r\n"
						+ "		Processor - Intel Core i7\r\n" + "		RAM - 16 GB\r\n"
						+ "		Storage - 512 GB SSD\r\n" + "		Operating System - Windows 10\r\n"
						+ "		Display - 13.3 inches");

		// Laptop 4
		categories[0].getSubCat(2).addProd(3, new Prod("L4", "Lenovo ThinkPad X1 Carbon", 104999));
		categories[0].getSubCat(2).getProd(3)
				.setDescription("\r\n" + "		Brand - Lenovo\r\n" + "		Model - ThinkPad X1 Carbon\r\n"
						+ "		Processor - Intel Core i7\r\n" + "		RAM - 16 GB\r\n"
						+ "		Storage - 1 TB SSD\r\n" + "		Operating System - Windows 10\r\n"
						+ "		Display - 14 inches");

		// Laptop 5
		categories[0].getSubCat(2).addProd(4, new Prod("L5", "ASUS ROG Zephyrus G14", 89999));
		categories[0].getSubCat(2).getProd(4)
				.setDescription("\r\n" + "		Brand - ASUS\r\n" + "		Model - ROG Zephyrus G14\r\n"
						+ "		Processor - AMD Ryzen 9\r\n" + "		RAM - 16 GB\r\n"
						+ "		Storage - 1 TB SSD\r\n" + "		Operating System - Windows 10\r\n"
						+ "		Display - 14 inches");

//Furniture
		categories[1] = new Category("Furniture", 3);
		// Beds
		categories[1].addSubCat(0, new SubCategory("Beds", 5));

		// Bed 1
		categories[1].getSubCat(0).addProd(0, new Prod("B1", "Queen Size Bed with Storage", 39999));
		categories[1].getSubCat(0).getProd(0).setDescription("\r\n" + "		Type - Queen Size Bed\r\n"
				+ "		Material - Wood\r\n" + "		Color - Brown\r\n" + "		Size - 160x200 cm");

		// Bed 2
		categories[1].getSubCat(0).addProd(1, new Prod("B2", "King Size Upholstered Bed", 59999));
		categories[1].getSubCat(0).getProd(1).setDescription("\r\n" + "		Type - King Size Bed\r\n"
				+ "		Material - Fabric\r\n" + "		Color - Gray\r\n" + "		Size - 180x200 cm");

		// Bed 3
		categories[1].getSubCat(0).addProd(2, new Prod("B3", "Single Bed with Trundle", 24999));
		categories[1].getSubCat(0).getProd(2).setDescription("\r\n" + "		Type - Single Bed\r\n"
				+ "		Material - Metal\r\n" + "		Color - Black\r\n" + "		Size - 90x200 cm");

		// Bed 4
		categories[1].getSubCat(0).addProd(3, new Prod("B4", "Bunk Bed with Desk", 44999));
		categories[1].getSubCat(0).getProd(3).setDescription("\r\n" + "		Type - Bunk Bed\r\n"
				+ "		Material - Wood\r\n" + "		Color - White\r\n" + "		Size - 90x200 cm");

		// Bed 5
		categories[1].getSubCat(0).addProd(4, new Prod("B5", "Sofa Bed with Storage", 34999));
		categories[1].getSubCat(0).getProd(4).setDescription("\r\n" + "		Type - Sofa Bed\r\n"
				+ "		Material - Fabric\r\n" + "		Color - Blue\r\n" + "		Size - 140x200 cm");

		// Dining furniture

		categories[1].addSubCat(1, new SubCategory("Dinign Furniture", 5));

		// Dining Furniture 1
		categories[1].getSubCat(1).addProd(0, new Prod("DF1", "5-Piece Dining Set", 24999));
		categories[1].getSubCat(1).getProd(0).setDescription("\r\n" + "		Type - Dining Set\r\n"
				+ "		Material - Wood\r\n" + "		Color - Brown\r\n" + "		Includes - Table and 4 Chairs");

		// Dining Furniture 2
		categories[1].getSubCat(1).addProd(1, new Prod("DF2", "Extendable Dining Table", 19999));
		categories[1].getSubCat(1).getProd(1).setDescription("\r\n" + "		Type - Dining Table\r\n"
				+ "		Material - Glass and Metal\r\n" + "		Color - Black\r\n" + "		Extendable - Yes");

		// Dining Furniture 3
		categories[1].getSubCat(1).addProd(2, new Prod("DF3", "Set of 2 Dining Chairs", 9999));
		categories[1].getSubCat(1).getProd(2).setDescription("\r\n" + "		Type - Dining Chair\r\n"
				+ "		Material - Fabric and Wood\r\n" + "		Color - Gray\r\n" + "		Quantity - 2 Chairs");

		// Dining Furniture 4
		categories[1].getSubCat(1).addProd(3, new Prod("DF4", "Buffet Cabinet", 34999));
		categories[1].getSubCat(1).getProd(3)
				.setDescription("\r\n" + "		Type - Buffet Cabinet\r\n" + "		Material - Wood\r\n"
						+ "		Color - White\r\n" + "		Features - Storage Shelves and Drawers");

		// Dining Furniture 5
		categories[1].getSubCat(1).addProd(4, new Prod("DF5", "Bar Stool Set", 14999));
		categories[1].getSubCat(1).getProd(4).setDescription("\r\n" + "		Type - Bar Stool\r\n"
				+ "	Material - Metal and Leather\r\n" + "	Color - Black\r\n" + "	Includes - Set of 2 Bar Stools");

		// Kitchen Furniture
		categories[1].addSubCat(2, new SubCategory("Kitchen Furniture", 5));

		// Kitchen Product 1
		categories[1].getSubCat(2).addProd(0, new Prod("KP1", "KitchenAid Stand Mixer", 24999));
		categories[1].getSubCat(2).getProd(0).setDescription("\r\n" + "		Brand - KitchenAid\r\n"
				+ "		Type - Stand Mixer\r\n" + "		Color - Silver\r\n" + "		Capacity - 5 Quarts");

		// Kitchen Product 2
		categories[1].getSubCat(2).addProd(1, new Prod("KP2", "Instant Pot Duo", 9999));
		categories[1].getSubCat(2).getProd(1)
				.setDescription("\r\n" + "		Brand - Instant Pot\r\n" + "		Type - Multi-Functional Cooker\r\n"
						+ "		Color - Stainless Steel\r\n" + "		Capacity - 6 Quarts");

		// Kitchen Product 3
		categories[1].getSubCat(2).addProd(2, new Prod("KP3", "Cuisinart Food Processor", 14999));
		categories[1].getSubCat(2).getProd(2)
				.setDescription("\r\n" + "		Brand - Cuisinart\r\n" + "		Type - Food Processor\r\n"
						+ "		Color - Brushed Stainless Steel\r\n" + "		Capacity - 11 Cups");

		// Kitchen Product 4
		categories[1].getSubCat(2).addProd(3, new Prod("KP4", "Ninja Blender", 7999));
		categories[1].getSubCat(2).getProd(3).setDescription("\r\n" + "		Brand - Ninja\r\n"
				+ "		Type - Blender\r\n" + "		Color - Black\r\n" + "		Capacity - 72 Ounces");

		// Kitchen Product 5
		categories[1].getSubCat(2).addProd(4, new Prod("KP5", "Keurig Coffee Maker", 11999));
		categories[1].getSubCat(2).getProd(4)
				.setDescription("\r\n" + "		Brand - Keurig\r\n" + "		Type - Coffee Maker\r\n"
						+ "		Color - Matte Black\r\n" + "		Capacity - Single Serve");

//Pharmasy
		categories[2] = new Category("Pharmasy", 3);
		// Medicine
		categories[2].addSubCat(0, new SubCategory("Medicine", 5));

		// Medicine Product 1
		categories[2].getSubCat(0).addProd(0, new Prod("M1", "Paracetamol Tablets", 299));
		categories[2].getSubCat(0).getProd(0).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Pain Relief\r\n" + "		Dosage Form - Tablets\r\n" + "		Strength - 500 mg");

		// Medicine Product 2
		categories[2].getSubCat(0).addProd(1, new Prod("M2", "Amoxicillin Capsules", 499));
		categories[2].getSubCat(0).getProd(1).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Antibiotic\r\n" + "		Dosage Form - Capsules\r\n" + "		Strength - 500 mg");

		// Medicine Product 3
		categories[2].getSubCat(0).addProd(2, new Prod("M3", "Loratadine Tablets", 399));
		categories[2].getSubCat(0).getProd(2).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Antihistamine\r\n" + "		Dosage Form - Tablets\r\n" + "		Strength - 10 mg");

		// Medicine Product 4
		categories[2].getSubCat(0).addProd(3, new Prod("M4", "Omeprazole Capsules", 599));
		categories[2].getSubCat(0).getProd(3).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Gastric Medication\r\n" + "		Dosage Form - Capsules\r\n" + "		Strength - 20 mg");

		// Medicine Product 5
		categories[2].getSubCat(0).addProd(4, new Prod("M5", "Aspirin Tablets", 199));
		categories[2].getSubCat(0).getProd(4).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Pain Relief\r\n" + "		Dosage Form - Tablets\r\n" + "		Strength - 325 mg");

		// Homeopathy
		categories[2].addSubCat(1, new SubCategory("Homeopathy", 5));

		// Homeopathy Product 1
		categories[2].getSubCat(1).addProd(0, new Prod("H1", "Arnica Montana", 199));
		categories[2].getSubCat(1).getProd(0).setDescription("\r\n" + "		Remedy - Arnica Montana\r\n"
				+ "		Potency - 30C\r\n" + "		Usage - Pain and Bruises");

		// Homeopathy Product 2
		categories[2].getSubCat(1).addProd(1, new Prod("H2", "Nux Vomica", 199));
		categories[2].getSubCat(1).getProd(1).setDescription("\r\n" + "		Remedy - Nux Vomica\r\n"
				+ "		Potency - 30C\r\n" + "		Usage - Digestive Disorders");

		// Homeopathy Product 3
		categories[2].getSubCat(1).addProd(2, new Prod("H3", "Ignatia Amara", 199));
		categories[2].getSubCat(1).getProd(2).setDescription("\r\n" + "		Remedy - Ignatia Amara\r\n"
				+ "		Potency - 30C\r\n" + "		Usage - Grief and Emotional Upsets");

		// Homeopathy Product 4
		categories[2].getSubCat(1).addProd(3, new Prod("H4", "Rhus Toxicodendron", 199));
		categories[2].getSubCat(1).getProd(3).setDescription("\r\n" + "		Remedy - Rhus Toxicodendron\r\n"
				+ "		Potency - 30C\r\n" + "		Usage - Joint and Muscle Pains");

		// Homeopathy Product 5
		categories[2].getSubCat(1).addProd(4, new Prod("H5", "Apis Mellifica", 199));
		categories[2].getSubCat(1).getProd(4).setDescription("\r\n" + "		Remedy - Apis Mellifica\r\n"
				+ "		Potency - 30C\r\n" + "		Usage - Bee Sting Allergies");

		// Pain Relief
		categories[2].addSubCat(2, new SubCategory("Pain Relief", 5));

		// Pain Relief Product 1
		categories[2].getSubCat(2).addProd(0, new Prod("PR1", "Ibuprofen Tablets", 499));
		categories[2].getSubCat(2).getProd(0)
				.setDescription("\r\n" + "		Brand - Generic\r\n"
						+ "		Type - Nonsteroidal Anti-inflammatory Drug (NSAID)\r\n"
						+ "		Dosage Form - Tablets\r\n" + "		Strength - 400 mg");

		// Pain Relief Product 2
		categories[2].getSubCat(2).addProd(1, new Prod("PR2", "Acetaminophen Tablets", 399));
		categories[2].getSubCat(2).getProd(1).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Analgesic\r\n" + "		Dosage Form - Tablets\r\n" + "		Strength - 500 mg");

		// Pain Relief Product 3
		categories[2].getSubCat(2).addProd(2, new Prod("PR3", "Naproxen Sodium Tablets", 549));
		categories[2].getSubCat(2).getProd(2)
				.setDescription("\r\n" + "		Brand - Generic\r\n"
						+ "		Type - Nonsteroidal Anti-inflammatory Drug (NSAID)\r\n"
						+ "		Dosage Form - Tablets\r\n" + "		Strength - 220 mg");

		// Pain Relief Product 4
		categories[2].getSubCat(2).addProd(3, new Prod("PR4", "Aspirin Tablets", 299));
		categories[2].getSubCat(2).getProd(3).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Analgesic\r\n" + "		Dosage Form - Tablets\r\n" + "		Strength - 325 mg");

		// Pain Relief Product 5
		categories[2].getSubCat(2).addProd(4, new Prod("PR5", "Diclofenac Gel", 349));
		categories[2].getSubCat(2).getProd(4).setDescription("\r\n" + "		Brand - Generic\r\n"
				+ "		Type - Topical Pain Reliever\r\n" + "		Dosage Form - Gel\r\n" + "		Strength - 1%");

//Beauty
		categories[3] = new Category("Beauty", 3);
		// Skin Care
		categories[3].addSubCat(0, new SubCategory("Skin Care", 5));
		// Skin Care Product 1
		categories[3].getSubCat(0).addProd(0, new Prod("SC1", "Moisturizing Face Cream", 799));
		categories[3].getSubCat(0).getProd(0)
				.setDescription("\r\n" + "		Brand - Lakme\r\n" + "		Type - Face Cream\r\n"
						+ "		Skin Type - All Skin Types\r\n" + "		Features - Deep Hydration");

		// Skin Care Product 2
		categories[3].getSubCat(0).addProd(1, new Prod("SC2", "Gentle Cleansing Foam", 499));
		categories[3].getSubCat(0).getProd(1)
				.setDescription("\r\n" + "		Brand - Mamaearth\r\n" + "		Type - Cleansing Foam\r\n"
						+ "		Skin Type - Sensitive Skin\r\n" + "		Features - Non-Irritating Formula");

		// Skin Care Product 3
		categories[3].getSubCat(0).addProd(2, new Prod("SC3", "Brightening Serum", 1199));
		categories[3].getSubCat(0).getProd(2)
				.setDescription("\r\n" + "		Brand - Garnier\r\n" + "		Type - Serum\r\n"
						+ "		Skin Type - Dull and Uneven Skin Tone\r\n"
						+ "		Features - Evens Skin Tone and Reduces Dark Spots");

		// Skin Care Product 4
		categories[3].getSubCat(0).addProd(3, new Prod("SC4", "Eye Cream", 699));
		categories[3].getSubCat(0).getProd(3)
				.setDescription("\r\n" + "		Brand - Wow\r\n" + "		Type - Eye Cream\r\n"
						+ "		Skin Type - All Skin Types\r\n"
						+ "		Features - Reduces Fine Lines and Dark Circles");

		// Skin Care Product 5
		categories[3].getSubCat(0).addProd(4, new Prod("SC5", "Sunscreen Lotion", 599));
		categories[3].getSubCat(0).getProd(4)
				.setDescription("\r\n" + "		Brand - Minimalist\r\n" + "		Type - Sunscreen Lotion\r\n"
						+ "		Skin Type - All Skin Types\r\n" + "		Features - Broad Spectrum SPF 50+ Protection");

		// Hair Care
		categories[3].addSubCat(1, new SubCategory("Hair Care", 5));

		// Hair Care Product 1
		categories[3].getSubCat(1).addProd(0, new Prod("HC1", "Shampoo for Dry Hair", 199));
		categories[3].getSubCat(1).getProd(0)
				.setDescription("\r\n" + "		Brand - Tresseme\r\n" + "		Type - Shampoo\r\n"
						+ "		Hair Type - Dry Hair\r\n" + "		Features - Nourishing and Hydrating");

		// Hair Care Product 2
		categories[3].getSubCat(1).addProd(1, new Prod("HC2", "Conditioner for Damaged Hair", 199));
		categories[3].getSubCat(1).getProd(1)
				.setDescription("\r\n" + "		Brand - Tresseme\r\n" + "		Type - Conditioner\r\n"
						+ "		Hair Type - Damaged Hair\r\n" + "		Features - Repairing and Strengthening");

		// Hair Care Product 3
		categories[3].getSubCat(1).addProd(2, new Prod("HC3", "Hair Oil for Growth", 299));
		categories[3].getSubCat(1).getProd(2)
				.setDescription("\r\n" + "		Brand - Indulekha\r\n" + "		Type - Hair Oil\r\n"
						+ "		Hair Concern - Hair Growth\r\n"
						+ "		Features - Nourishes Scalp and Stimulates Hair Growth");

		// Hair Care Product 4
		categories[3].getSubCat(1).addProd(3, new Prod("HC4", "Hair Serum for Frizz Control", 249));
		categories[3].getSubCat(1).getProd(3)
				.setDescription("\r\n" + "		Brand - Livon\r\n" + "		Type - Hair Serum\r\n"
						+ "		Hair Concern - Frizz Control\r\n" + "		Features - Smoothing and Anti-Frizz");

		// Hair Care Product 5
		categories[3].getSubCat(1).addProd(4, new Prod("HC5", "Hair Mask for Deep Conditioning", 349));
		categories[3].getSubCat(1).getProd(4)
				.setDescription("\r\n" + "		Brand - mamaearth\r\n" + "		Type - Hair Mask\r\n"
						+ "		Hair Concern - Deep Conditioning\r\n"
						+ "		Features - Intense Hydration and Repair");

		// Perfumes and deo
		categories[3].addSubCat(2, new SubCategory("Perfumes and Deo", 5));

		// Perfume and Deo Product 1
		categories[3].getSubCat(2).addProd(0, new Prod("PD1", "Eau de Parfum - Floral", 799));
		categories[3].getSubCat(2).getProd(0)
				.setDescription("\r\n" + "		Brand -  Bella Vita Luxury\r\n" + "		Type - Eau de Parfum\r\n"
						+ "		Fragrance Family - Floral\r\n" + "		Features - Long-lasting and Intense");

		// Perfume and Deo Product 2
		categories[3].getSubCat(2).addProd(1, new Prod("PD2", "Eau de Toilette - Citrus", 699));
		categories[3].getSubCat(2).getProd(1)
				.setDescription("\r\n" + "		Brand - Cacharel Anais\r\n" + "		Type - Eau de Toilette\r\n"
						+ "		Fragrance Family - Citrus\r\n" + "		Features - Refreshing and Light");

		// Perfume and Deo Product 3
		categories[3].getSubCat(2).addProd(2, new Prod("PD3", "Deodorant Spray - Musk", 249));
		categories[3].getSubCat(2).getProd(2)
				.setDescription("\r\n" + "		Brand - Brut\r\n" + "		Type - Deodorant Spray\r\n"
						+ "		Fragrance Family - Musk\r\n" + "		Features - Odor Protection and Freshness");

		// Perfume and Deo Product 4
		categories[3].getSubCat(2).addProd(3, new Prod("PD4", "Morning Dew", 499));
		categories[3].getSubCat(2).getProd(3)
				.setDescription("\r\n" + "		Brand - Yardley London\r\n" + "		Type - Perfumed Body Lotion\r\n"
						+ "		Fragrance Family - Oriental\r\n" + "		Features - Moisturizing and Scented");

		// Perfume and Deo Product 5
		categories[3].getSubCat(2).addProd(4, new Prod("PD5", "Roll-on Deodorant - Fresh", 199));
		categories[3].getSubCat(2).getProd(4)
				.setDescription("\r\n" + "		Brand - Nivea\r\n" + "		Type - Roll-on Deodorant\r\n"
						+ "		Fragrance Family - Fresh\r\n"
						+ "		Features - Easy Application and 24-hour Protection");

//Sports and Fitness
		categories[4] = new Category("Sports and Fitness", 3);

		// Yoga
		categories[4].addSubCat(0, new SubCategory("Yoga", 5));

		// Yoga Product 1
		categories[4].getSubCat(0).addProd(0, new Prod("Y1", "Yoga Mat", 999));
		categories[4].getSubCat(0).getProd(0).setDescription("\r\n" + "		Brand - BoldFit\r\n"
				+ "		Type - Yoga Mat\r\n" + "		Material - PVC\r\n" + "		Features - Non-slip and Cushioned");

		// Yoga Product 2
		categories[4].getSubCat(0).addProd(1, new Prod("Y2", "Yoga Block", 299));
		categories[4].getSubCat(0).getProd(1)
				.setDescription("\r\n" + "		Brand - WiseLife\r\n" + "		Type - Yoga Block\r\n"
						+ "		Material - Foam\r\n" + "		Features - Lightweight and Supportive");

		// Yoga Product 3 (continued)
		categories[4].getSubCat(0).addProd(2, new Prod("Y3", "Yoga Strap", 199));
		categories[4].getSubCat(0).getProd(2)
				.setDescription("\r\n" + "		Brand - Boldfit\r\n" + "		Type - Yoga Strap\r\n"
						+ "		Material - Cotton\r\n" + "		Features - Adjustable Length and Durable");

		// Yoga Product 4
		categories[4].getSubCat(0).addProd(3, new Prod("Y4", "Yoga Bolster", 1299));
		categories[4].getSubCat(0).getProd(3)
				.setDescription("\r\n" + "		Brand - The Yogis\r\n" + "		Type - Yoga Bolster\r\n"
						+ "		Material - Organic Cotton\r\n" + "		Features - Supportive and Comfortable");

		// Yoga Product 5
		categories[4].getSubCat(0).addProd(4, new Prod("Y5", "Yoga Wheel", 799));
		categories[4].getSubCat(0).getProd(4)
				.setDescription("\r\n" + "		Brand - Tormeti\r\n" + "		Type - Yoga Wheel\r\n"
						+ "		Material - ABS Plastic\r\n" + "		Features - Enhances Flexibility and Balance");

		// Cycling Products
		categories[4].addSubCat(1, new SubCategory("Cycling Items", 5));

		// Cycling Product 1
		categories[4].getSubCat(1).addProd(0, new Prod("C1", "Bicycle Helmet", 599));
		categories[4].getSubCat(1).getProd(0)
				.setDescription("\r\n" + "		Brand - Fabsports\r\n" + "		Type - Helmet\r\n"
						+ "		Size - Adjustable\r\n" + "		Features - Ventilation and Impact Protection");

		// Cycling Product 2
		categories[4].getSubCat(1).addProd(1, new Prod("C2", "Cycling Shorts", 499));
		categories[4].getSubCat(1).getProd(1)
				.setDescription("\r\n" + "		Brand - NYKD\r\n" + "		Type - Shorts\r\n"
						+ "		Size - Various Sizes Available\r\n" + "		Features - Padded and Moisture-Wicking");

		// Cycling Product 3
		categories[4].getSubCat(1).addProd(2, new Prod("C3", "Bicycle Pump", 299));
		categories[4].getSubCat(1).getProd(2).setDescription("\r\n" + "		Brand - QUXIS\r\n" + "		Type - Pump\r\n"
				+ "		Features - Compact and Portable\r\n" + "		Compatibility - Presta and Schrader Valves");

		// Cycling Product 4
		categories[4].getSubCat(1).addProd(3, new Prod("C4", "Cycling Gloves", 199));
		categories[4].getSubCat(1).getProd(3)
				.setDescription("\r\n" + "		Brand - BoldFit\r\n" + "		Type - Gloves\r\n"
						+ "		Size - Various Sizes Available\r\n" + "		Features - Breathable and Shock-Absorbing");

		// Cycling Product 5
		categories[4].getSubCat(1).addProd(4, new Prod("C5", "Bicycle Lights Set", 349));
		categories[4].getSubCat(1).getProd(4)
				.setDescription("\r\n" + "		Brand - Techinsta\r\n" + "		Type - Lights Set\r\n"
						+ "		Features - Front and Rear Lights\r\n" + "		Modes - Multiple Lighting Modes");

		// Stregth Training
		categories[4].addSubCat(2, new SubCategory("Strength Training", 5));
		// Strength Training Product 1
		categories[4].getSubCat(2).addProd(0, new Prod("ST1", "Dumbbell Set", 999));
		categories[4].getSubCat(2).getProd(0)
				.setDescription("\r\n" + "		Brand - Kore\r\n" + "		Type - Dumbbell Set\r\n"
						+ "		Weight Range - Various Weight Options\r\n"
						+ "		Features - Non-Slip Grip and Hexagonal Design");

		// Strength Training Product 2
		categories[4].getSubCat(2).addProd(1, new Prod("ST2", "Resistance Bands Set", 799));
		categories[4].getSubCat(2).getProd(1)
				.setDescription("\r\n" + "		Brand - Solara\r\n" + "		Type - Resistance Bands Set\r\n"
						+ "		Resistance Levels - Various Levels Available\r\n"
						+ "		Features - Portable and Versatile");

		// Strength Training Product 3
		categories[4].getSubCat(2).addProd(2, new Prod("ST3", "Weight Bench", 1999));
		categories[4].getSubCat(2).getProd(2)
				.setDescription("\r\n" + "		Brand - Leeway\r\n" + "		Type - Weight Bench\r\n"
						+ "		Features - Adjustable and Sturdy Construction\r\n"
						+ "		Maximum Weight Capacity - Up to 300 kg");

		// Strength Training Product 4
		categories[4].getSubCat(2).addProd(3, new Prod("ST4", "Kettlebell Set", 1499));
		categories[4].getSubCat(2).getProd(3)
				.setDescription("\r\n" + "		Brand - Flexnest\r\n" + "		Type - Kettlebell Set\r\n"
						+ "		Weight Range - Various Weight Options\r\n"
						+ "		Features - Vinyl-Coated and Easy-Grip Handle");

		// Strength Training Product 5
		categories[4].getSubCat(2).addProd(4, new Prod("ST5", "Weighted Jump Rope", 299));
		categories[4].getSubCat(2).getProd(4)
				.setDescription("\r\n" + "		Brand - BoldFit\r\n" + "		Type - Jump Rope\r\n"
						+ "		Features - Adjustable Length and Weighted Handles\r\n"
						+ "		Material - PVC and Steel");

	}

	public void displayCat() {
		System.out.println("We have these all Categories: ");
		for (int i = 0; i < categories.length; i++) {
			if (categories[i] != null) {
				System.out.println((i + 1) + ". " + categories[i].getName());
			}
		}
		System.out.println(categories.length + 1 + ". Show My Orders.");
		System.out.println(categories.length + 2 + ". Exit the Application.");
		System.out.println("Enter the Category number: ");
		int catNum = sc.nextInt();
		Category selectedCat;
		if (catNum >= 1 && catNum <= categories.length) {
			selectedCat = categories[catNum - 1];
			displaySubCat(selectedCat);
		} else if (catNum == categories.length + 1) {
			od.showOrder();
			System.out.println("1. Go to Main Menu.");
			System.out.println("2. Exit the Application");
			int userInp = sc.nextInt();
			if (userInp == 1) {
				displayCat();
			}else if(userInp == 2) {
				System.out.println("Thanks for Shopping with us.");
				System.out.println("Exited from the App");
				return;
			}else {
				System.out.println("Invalid number. Exiting the app");
				return;
			}
		}else if(catNum==categories.length+2) {
			System.out.println("Thanks for shopping with us.");
			System.out.println("Exited from the App.");
			return;
		} else {
			System.out.println("Invalid number. Exiting the app");
			return;
		}

	}

	public void displaySubCat(Category cat) {
		System.out.println("We have these Sub-Categories from: " + cat.getName());
		for (int i = 0; i < cat.getSubCategoryCnt(); i++) {
			if (categories[i] != null) {
				System.out.println((i + 1) + ". " + cat.getSubCat(i).getName());
			}
		}
		System.out.println(cat.getSubCategoryCnt() + 1 + ". Go to Main Menu.");

		SubCategory selectedSubCat;
		System.out.println("Enter the Sub Category number: ");
		int subCatNum = sc.nextInt();

		if (subCatNum >= 1 && subCatNum <= cat.getSubCategoryCnt()) {
			selectedSubCat = cat.getSubCat(subCatNum - 1);
			displayProd(selectedSubCat);
		} else if (subCatNum == cat.getSubCategoryCnt() + 1) {
			displayCat();

		} else {
			System.out.println("Invalid number. Exiting the app");
		}

	}

	public void displayProd(SubCategory subCat) {
		System.out.println("We have these Products from: " + subCat.getName());
		for (int i = 0; i < subCat.getProdCnt(); i++) {

			Prod product = subCat.getProd(i);
			System.out.println((i + 1) + ". Product Name: " + product.getName() + "\n   Price: ₹"
					+ product.getPrice() + "\n   Description: " + product.getDescription());
			System.out.println();
		}
		System.out.println(subCat.getProdCnt() + 1 + ". Go to Main Menu.");

//		Prod selectedProd = getProdFromUserInput(subCat);
		System.out.println("Enter the Product number: ");
		int prodNum = sc.nextInt();
		Prod selectedProd;

		if (prodNum >= 1 && prodNum <= subCat.getProdCnt()) {
			selectedProd = subCat.getProd(prodNum - 1);
			processPurchase(selectedProd);

		} else if (prodNum == subCat.getProdCnt() + 1) {
			displayCat();
		} else {
			System.out.println("Invalid number. Exiting the app");
		}

	}

	public void processPurchase(Prod product) {
		System.out.println("\033[32m\033[1mYou have Successfully Bought: " + product.getName()+"\033[0m\033[0m");
		od.addOrder(product);

		System.out.print("Do you want to continue shopping? (Yes/No): ");
		String choice = sc.next();
		if (choice.equalsIgnoreCase("No")) {
			od.showOrder();
			System.out.println("Thanks for shopping with us.");
			System.out.println("Exited from the App.");
			return;
		} else if (choice.equalsIgnoreCase("Yes")) {
			displayCat();
		} else {
			System.out.println("Invalid number. Exiting the app");
		}

	}

	public void appRun() {
		displayCat();
	}
}