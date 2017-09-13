package exercise02;

import java.util.Date;

public class Transaction {
	private Date date = new Date();			// getter/setter
	private char type;			// getter/setter		
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private double amount;		// getter/setter
	private double balance;		// getter/setter
	private String description;	// getter/setter

}
