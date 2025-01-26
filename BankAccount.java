package com.project;


import java.util.Scanner;

	class BankAccount {
	    private String accountholdername;
	    private double balance;
		

	    // Constructor
	    public BankAccount(String accountholdername, double initialBalance) {
	        this.accountholdername = accountholdername;
	        this.balance = initialBalance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount >= 500) {
	            balance = balance+amount;
	            System.out.println("Deposited: Rs" + amount);
	        } else {
	            System.out.println("Invalid deposit amount! you must be desposit only above 500 only");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 500 && amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdrawn: Rs" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance!");
	        } else {
	            System.out.println("Invalid withdrawal amount!you must be withdrawn amount above 500Rupess");
	        }
	    }

	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Current Balance: Rs" + balance);
	    }

	    // Method to get account holder's name
	    public String getaccountholdername() {
	        return accountholdername;
	    }



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Create a bank account
	        System.out.println("Enter account holder name: ");
	        String name = scanner.nextLine();
	        System.out.println("Enter initial deposit amount: ");
	        double initialBalance = scanner.nextDouble();

	        BankAccount account = new BankAccount(name, initialBalance);
	        
	        System.out.println("Account created for " + account.getaccountholdername() + " with balance: Rs" + initialBalance);

	        while (true) {
	            // Step 2: Display menu
	            System.out.println("=== Menu ===");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawalAmount = scanner.nextDouble();
	                    account.withdraw(withdrawalAmount);
	                    break;
	                case 3:
	                    account.checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the system!");
	                    
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	                    scanner.close();
	            }
	          
	        }
	       
	    }
	

	   
	 

}
