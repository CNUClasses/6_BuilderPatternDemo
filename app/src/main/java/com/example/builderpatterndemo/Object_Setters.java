package com.example.builderpatterndemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Object_Setters {

	//NOTE Company is final MUST be initialized in constructor,
	//NOTE only required field
	final String Company;
	String Model;
	Double Price;
	String Location;

	public Object_Setters(String Company) {
		this.Company = Company;
	}

	// NOTE Setters
	// each returns this 
	// makes it suitable for chaining
	Object_Setters setModel(String Model) {
		this.Model = Model;
		return this;
	}

	Object_Setters setPrice(Double Price) {
		this.Price = Price;
		return this;
	}

	Object_Setters setLocation(String Location) {
		this.Location = Location;
		return this;
	}
}
