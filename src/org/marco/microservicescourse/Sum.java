package org.marco.microservicescourse;

public class Sum implements Operation {

	@Override
	public Integer apply(Integer a, Integer b) {
		return a + b;
	}

}
