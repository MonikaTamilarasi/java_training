package com.training;

public class CreditCard {
	private double cardNumber;
	private String cardHolderName;
	private double amountDue;
	public double getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(double cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", amountDue="
				+ amountDue + "]";
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	public CreditCard(double cardNumber, String cardHolderName, double amountDue) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.amountDue = amountDue;
	}
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
}
