package com.luv2code.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		super();
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal("100"));
	}


	public BigDecimal calculateTotalValue(int years) {
		return principal.add(principal.multiply(interest).multiply(new BigDecimal(years)));

	}

}
