package BasicOOP1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();	
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
				
		

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
				
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);		
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("0511111111");
		individualCustomer.setFirstName("Kadir");
		individualCustomer.setLastName("Köroğlu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Craquelin");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("052222222");
		corporateCustomer.setTaxNumber("33333333333");
		
		Customer[] customers = {individualCustomer,corporateCustomer};	
		for (Customer customer : customers) {
			System.out.println("----------------");
		System.out.println(customer.getPhone());
		System.out.println(customer.getId());
				

	}

	}
}
