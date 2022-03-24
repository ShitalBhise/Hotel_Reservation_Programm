package com.Hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HotelReservation {
	static Scanner scanner = new Scanner(System.in);

	private static String hotelName;
	private static double ratesforWeekdayRegularCustomer;
	private static double ratesforWeekendRegularCustomer;
	private static double ratesforWeekdayRewardCustomer;
	private static double ratesforWeekdendRewardCustomer;
	private static double rating;

	public void addHotel() {
		System.out.println("Enter Hotel name");
		hotelName = scanner.next();
		System.out.println("Enter a rates for weekday Regular Customer");
		ratesforWeekdayRegularCustomer = scanner.nextDouble();

		System.out.println("Enter a rates for weekend Regular Customer");
		ratesforWeekendRegularCustomer = scanner.nextDouble();

		System.out.println("Enter a rates for weekday Reward Customer");
		ratesforWeekdayRewardCustomer = scanner.nextDouble();

		System.out.println("Enter a rates for weekend Reward Customer");
		ratesforWeekdendRewardCustomer = scanner.nextDouble();
		System.out.println("Enter a rating");
		rating = scanner.nextDouble();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Hotel Reservation Program");
		HotelReservation hotelReservation = new HotelReservation();
		List<Hotel> hotellist = new ArrayList<Hotel>();

		for (int i = 0; i < 3; i++) {
			hotelReservation.addHotel();
			Hotel hotel = new Hotel(hotelName, ratesforWeekdayRegularCustomer, ratesforWeekendRegularCustomer,
					ratesforWeekdayRewardCustomer, ratesforWeekdendRewardCustomer, rating);
			hotellist.add(hotel);

			System.out.println(hotellist);

		}
	}
	}
	