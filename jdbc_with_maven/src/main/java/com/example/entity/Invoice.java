package com.example.entity;

public class Invoice {
	private int invoiceNumber;
	private String invoiceName;
	private double quantity;
	private int productref;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceNumber, String invoiceName, double quantity, int productref) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.invoiceName = invoiceName;
		this.quantity = quantity;
		this.productref = productref;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public int getProductref() {
		return productref;
	}
	public void setProductref(int productref) {
		this.productref = productref;
	}
	
	
	
	
}
