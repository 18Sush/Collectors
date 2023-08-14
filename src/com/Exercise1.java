package com;

import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customerList = new ArrayList<>();
		 
	        customerList.add(new Customer("Alice","M","djgifg@gmail.com",new Location("Delhi","D")));
	        customerList.add(new Customer("Bob","N","djghfg@gmail.com",new Location("Mumbai","M")));
	        customerList.add(new Customer("Ava","A","djgkfg@gmail.com",new Location("Bangalore","B")));
	        customerList.add(new Customer("John","T","djgimg@gmail.com",new Location("Mysore","M")));
	        customerList.add(new Customer("Peter","S","djaifg@gmail.com",new Location("Hassan","H")));
      
        List<String> customerInfoList = customerList.stream().map(customer -> customer.getFirstName() + " " + customer.getLastName() + " " +customer.getLocation().getLocationName() + ", " 
        + customer.getLocation().getState()).collect(Collectors.toList());

        
        System.out.println(customerInfoList);
	}

}
