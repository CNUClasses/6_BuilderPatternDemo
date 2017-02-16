package com.example.builderpatterndemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Object_Constructors {

	final String Company;
	final String Model;
	final Double Price;
	final String Location;
	
	public Object_Constructors(String Company){
	 this(Company,"",0.0,"");
	}
	public Object_Constructors(String Company,String Model){
		 this(Company,Model,0.0,"");
		}
	public Object_Constructors(String Company,String Model, Double Price){
		 this(Company,Model,Price,"");
		}
	
	public Object_Constructors(String Company, String Model, Double Price, String Location) {
		this.Company = Company;
		this.Model = Model;
		this.Price = Price;
		this.Location =Location;
	}
}
