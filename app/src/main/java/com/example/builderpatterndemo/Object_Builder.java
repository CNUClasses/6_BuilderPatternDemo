package com.example.builderpatterndemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Object_Builder {

	final String Company;
	final String Model;
	final Double Price;
	final String Location;

	//NOTE THIS IS PRIVATE!
	//no way to construct this object unless you use 
	//the builders build method below
	private Object_Builder(Builder b) {
		this.Company = b.Company;
		this.Model = b.Model;
		this.Price = b.Price;
		this.Location = b.Location;
	}

	/**
	 * @author lynn builder pattern, see page 11 Effective Java UserData mydata
		 */
	public static class Builder {
		//NOTE Company is final MUST be initialized in constructor,
		//NOTE only required field
		final String Company;
		String Model;
		Double Price;
		String Location;

		//NOTE Company required
		Builder(String Company) {
			this.Company = Company;
		}

		//NOTE Setters
		//each returns this builder
		//makes it suitable for chaining
		Builder setModel(String Model) {
			this.Model = Model;
			return this;
		}

		Builder setPrice(Double Price) {
			this.Price = Price;
			return this;
		}

		Builder setLocation(String Location) {
			this.Location = Location;
			return this;
		}

		//NOTE This is the only place where we can
		//construct a DEMOOptionalFields object
		//builder ensures that it is not partially constructed
		public Object_Builder build() {
			return new Object_Builder(this);
		}
	}
}
