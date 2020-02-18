package com.example.builderpatterndemo;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	
	private void demoConstructionTechniques() {

		final String Company = "Trek";
		final String Location = "Here";
		
		//********************** telescoping constructor,
		//works but does not scale well (what if you have 20 params, some optional some not)
		Object_Constructors myConstructors = new Object_Constructors(Company);
		//what if you mix up the first 2 params?
		Object_Constructors myConstructors1 = new Object_Constructors(Company,"",0.0,Location);
		
		//********************** Setters (JavaBeans pattern)
		//clean but cannot gurantee object is completely built
		//a constructor automatically returns a ref to the object its creating (do not return it yourself! otherwise
		//the compiler assummes its a method and not a constructor)
		Object_Setters myObject_Setters1 = new Object_Setters(Company).setLocation(Location);

		//or set one at a time
		Object_Setters myObject_Setters = new Object_Setters(Company);
		myObject_Setters.setLocation(Location);

		//throw an exception below then have a partially initialized object
		myObject_Setters.setModel("970");
		myObject_Setters.setPrice(225.0);
		
		//********************** Builder pattern
		//create the builder with any combination of fields
		//builder can also enforce other conditions
		Object_Builder.Builder myBuilder = new Object_Builder.Builder("Trek").setModel("970").setPrice(225.00).setLocation("Here");
		
		//build your object, guranteed consistant state, scales well
		Object_Builder myFields = myBuilder.build();

		//could do all of the above with 1 line since everthing returns a ref to this
		Object_Builder myfields1 =  new Object_Builder.Builder("Trek").setModel("970").setPrice(225.00).setLocation("Here").build();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		demoConstructionTechniques();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
