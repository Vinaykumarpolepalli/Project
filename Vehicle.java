package com.project;

public class Vehicle {
	 private String make;
	 private String model;
	 private int year;
	 private double rentalRate;
	 
	 public Vehicle(String make, String model, int year, double rentalRate) {
	  this.make = make;
	  this.model = model;
	  this.year = year;
	  this.rentalRate = rentalRate;
	 }
	 
	 public void displayInfo() {
	  System.out.println("Make: " + make);
	  System.out.println("Model " + model);
	  System.out.println("Year: " + year);
	  System.out.println("Rental Rate: " + rentalRate);
	 }
	 
	 public double getRentalRate() {
	  return rentalRate;
	 }
	 
	 public String getMake() {
	  return make;
	 }
	 
	 public String getModel() {
	  return model;
	 }
	}



public class Car extends Vehicle{
	 
	 private int numDoors;
	 private boolean isConvertible;
	 private String fuelType;
	 
	 public Car(String make, String model, int year, double rentalRate, int numDoors, boolean isConvertible, String fuelType) {
	  super(make, model, year, rentalRate);
	  this.numDoors = numDoors;
	  this.isConvertible = isConvertible;
	  this.fuelType = fuelType;
	 }
	 
	 @Override
	 public void displayInfo() {
	  super.displayInfo();
	  System.out.println("Number of Doors: " + numDoors);
	  System.out.println("Convertible: " + isConvertible);
	  System.out.println("Fuel Type: " + fuelType);
	 }

	}
