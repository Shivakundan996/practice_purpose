package bankApplication;

public class BankAccount {
	
	private String customerName;
	private int customerId;
	private int balance=1000;
	private int previousTransaction;
	
	public BankAccount(String name,int id) {
		customerId=id;
		customerName = name;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPreviousTransaction() {
		return previousTransaction;
	}

	public void setPreviousTransaction(int previousTransaction) {
		this.previousTransaction = previousTransaction;
	}
	
	

}
