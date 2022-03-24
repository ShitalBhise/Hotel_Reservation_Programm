package com.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
	
	private String hotelName;
	private double ratesforWeekdayRegularCustomer;
	private double ratesforWeekendRegularCustomer;
	private double ratesforWeekdayRewardCustomer;
	private double ratesforWeekendRewardCustomer;
	private double rating;

	public Hotel(String hotelName, double ratesforWeekdayRegularCustomer, double ratesforWeekendRegularCustomer,
			double ratesforWeekdayRewardCustomer, double ratesforWeekendRewardCustomer, double rating) {
		super();
		this.hotelName = hotelName;
		this.ratesforWeekdayRegularCustomer = ratesforWeekdayRegularCustomer;
		this.ratesforWeekendRegularCustomer = ratesforWeekendRegularCustomer;
		this.ratesforWeekdayRewardCustomer = ratesforWeekdayRewardCustomer;
		this.ratesforWeekendRewardCustomer = ratesforWeekendRewardCustomer;
		this.rating = rating;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRatesforWeekdayRegularCustomer() {
		return ratesforWeekdayRegularCustomer;
	}

	public void setRatesforWeekdayRegularCustomer(double ratesforWeekdayRegularCustomer) {
		this.ratesforWeekdayRegularCustomer = ratesforWeekdayRegularCustomer;
	}

	public double getRatesforWeekendRegularCustomer() {
		return ratesforWeekendRegularCustomer;
	}

	public void setRatesforWeekendRegularCustomer(double ratesforWeekendRegularCustomer) {
		this.ratesforWeekendRegularCustomer = ratesforWeekendRegularCustomer;
	}

	public double getRatesforWeekdayRewardCustomer() {
		return ratesforWeekdayRewardCustomer;
	}

	public void setRatesforWeekdayRewardCustomer(double ratesforWeekdayRewardCustomer) {
		this.ratesforWeekdayRewardCustomer = ratesforWeekdayRewardCustomer;
	}

	public double getRatesforWeekendRewardCustomer() {
		return ratesforWeekendRewardCustomer;
	}

	public void setRatesforWeekendRewardCustomer(double ratesforWeekendRewardCustomer) {
		this.ratesforWeekendRewardCustomer = ratesforWeekendRewardCustomer;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", ratesforWeekdayRegularCustomer=" + ratesforWeekdayRegularCustomer
				+ ", ratesforWeekendRegularCustomer=" + ratesforWeekendRegularCustomer
				+ ", ratesforWeekdayRewardCustomer=" + ratesforWeekdayRewardCustomer
				+ ", ratesforWeekendRewardCustomer=" + ratesforWeekendRewardCustomer + ", rating=" + rating + "]";
	}
}
