package com.test;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import com.Hotel.Hotel;
import com.Hotel.HotelReservation;

public class HotelReservationTest {
	@Test
	public void givendetailsOf3Hotels_WhenAddedToHotelList_SizeOfListIs3(){

		HotelReservation.addHotel("Lakewood",110);
		HotelReservation.addHotel("Bridgewood",160);
		HotelReservation.addHotel("Ridgewood",220);
		Assert.assertEquals(3, HotelReservation.countNoOfHotels());
	}

	@Test
	public void givenDetailsOf3Hotels_InAGivenDataRage_shouldReturnCheapesthotel() {

		HotelReservation.addHotel("Lakewood",110);
		HotelReservation.addHotel("Bridgewood",160);
		HotelReservation.addHotel("Ridgewood",220);
		String cheapestHotelInfo = HotelReservation.findCheapestHotel("10 Sep 2020","11 Sep 2020");
		Assert.assertEquals("Lakewood Total Cost: $220",cheapestHotelInfo);
	}

}
