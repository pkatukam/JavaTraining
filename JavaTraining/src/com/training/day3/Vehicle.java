package com.training.day3;

public class Vehicle {
	
	private int no_of_tyres;
	private int no_of_seaters;
	
	/**
	 * @return the no_of_tyres
	 */
	public int getNo_of_tyres() {
		return no_of_tyres;
	}

	/**
	 * @param no_of_tyres the no_of_tyres to set
	 */
	public void setNo_of_tyres(int no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}

	/**
	 * @return the no_of_seaters
	 */
	public int getNo_of_seaters() {
		return no_of_seaters;
	}

	/**
	 * @param no_of_seaters the no_of_seaters to set
	 */
	public void setNo_of_seaters(int no_of_seaters) {
		this.no_of_seaters = no_of_seaters;
	}

	public void rides() {
		System.out.println("rides.....");
	}
	
	public void makesSound() {
		System.out.println("sounds.....");
	}
}
