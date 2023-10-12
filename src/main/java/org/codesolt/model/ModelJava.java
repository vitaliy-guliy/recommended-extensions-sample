package org.codesolt.model;

import org.apache.log4j.Logger;

public class ModelJava {

	private static final Logger log = Logger.getLogger(ModelJava.class);
	
	private String stringValue;
	private Integer integerValue;
	private static final Double doubleValue = calculateDoubleValue();
	
	public ModelJava(String stringValue, Integer integerValue) {
		super();
		this.stringValue = stringValue;
		if(integerValue != null)
			this.integerValue = integerValue;
		else
			throw new NullPointerException("integerValue");
	}

	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Integer getIntegerValue() {
		return integerValue;
	}
	public void setIntegerValue(Integer integerValue) {
		if(integerValue != null)
			this.integerValue = integerValue;
		throw new NullPointerException("integerValue");
	}
	
	public Double getDoubleValue() {
		return doubleValue;
	}
	
	private static Double calculateDoubleValue() {
		log.info("Calculating double value");
		double a = 2.0;
		for(int i=0; i<9; i++)
			a = a * 1.5;
		return a;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((integerValue == null) ? 0 : integerValue.hashCode());
		result = prime * result + ((stringValue == null) ? 0 : stringValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelJava other = (ModelJava) obj;
		if (integerValue == null) {
			if (other.integerValue != null)
				return false;
		} else if (!integerValue.equals(other.integerValue))
			return false;
		if (stringValue == null) {
			if (other.stringValue != null)
				return false;
		} else if (!stringValue.equals(other.stringValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ModelImp [stringValue=" + stringValue + ", integerValue=" + integerValue + "]";
	}	
}
