package org.codesolt;

import static org.junit.Assert.assertTrue;

import org.codesolt.model.ModelJava;
import org.codesolt.model.ModelLombokData;
import org.codesolt.model.ModelLombokValue;
import org.junit.Test;

public class ModelTest {
	
	@Test(expected = NullPointerException.class)
	public void testJava() {
		//Notice (on log) how the static property initializes constructor call
		ModelJava model = new ModelJava("Hello Java", 6);
		assertTrue(model.equals(new ModelJava("Hello Java", 6)));

		//Ensure not allowing to set Null values
		model.setIntegerValue(null);
	}
	
	@Test(expected = NullPointerException.class)
	public void testLombokData() {
		//Creates the same POJO but without repetitive code trhough the @Data annotation
		ModelLombokData model = new ModelLombokData("Hello Java", 6);

		//Notice (on log) how the static property intializes until is nedded
		Double value = model.getDoubleValue();
		assertTrue(value != null);
		
		//Ensure not allowing to set Null values (with annotation)
		model.setIntegerValue(null);
	}
	
	@Test
	public void testLombokValue() {
		//Creates an Inmutable Object with one only annotation (@Value)
		ModelLombokValue model = new ModelLombokValue("Hello Java", 6);
		assertTrue(model.hashCode() ==  new ModelLombokValue("Hello Java", 6).hashCode());
		
		//Notice how Set Method are unavailable
		//model.set
	}
}
