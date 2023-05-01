package com.exceptionhandling;

class Money {
	private String currency;
	private int amount;

	public Money(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Money that) {
		if (!this.currency.equals(that.currency)) {
			// throw new RuntimeException("Currencies Don't Match " + this.currency + " & "
			// + that.currency);
			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}
	@Override
	public String toString() {
		return amount + " " + currency;
	}

}

//Custom Exception
class CurrenciesDoNotMatchException extends RuntimeException {

	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}
public class CustomException {
	public static void main(String[] args) {
		Money amount1 = new Money("USD", 10);
		Money amount2 = new Money("EUR", 20);
		amount1.add(amount2);
		System.out.println("amount1 " + amount1);
	}
}
