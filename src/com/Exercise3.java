package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customers> customerList = new ArrayList<>();
		 
        customerList.add(new Customers(1,new Product("Coffee",34,5,true,"ACD"),24,34,"Mumbai"));
        customerList.add(new Customers(1,new Product("Tea",45,4,true,"BCD"),24,34,"Chennai"));
        customerList.add(new Customers(1,new Product("Chocolate",65,45,false,"ABD"),24,34,"Bangalore"));
        customerList.add(new Customers(1,new Product("Sweet",67,50,false,"ABE"),24,34,"Mysore"));
        customerList.add(new Customers(1,new Product("Nuts",76,12,true,"ABC"),24,34,"Kolkata"));
        
        Map<String, List<Customers>> customersByLocation = customerList.stream().collect(Collectors.groupingBy(Customers::getLocation));
		System.out.println("List of customers as per location: " + customersByLocation);
      
		//Map<String, List<CustomerStore>> customersByProduct = customer.stream().collect(Collectors.groupingBy(Product::getProductName));
		//System.out.println("List of customers as per product: " + customersByProduct);
		
		//Map<String, List<Customers>> customersByPaymentType = customerList.stream().collect(Collectors.groupingBy(Customers::getPayment_type));
		//System.out.println("List of customers as per payment type: " + customersByPaymentType);
		
		double averageAmount = customerList.stream().mapToDouble(Customers::getAmount_paid).average().orElse(0.0);
		System.out.println("Average amount_paid by customer: " + averageAmount);
		
		//Map<String, Double> sumByProduct = customer.stream().collect(Collectors.groupingBy(Customer::getProduct, Collectors.summingDouble(CustomerStore::getAmount_Paid)));
        
	}

}
