package com.cognixia.jump.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Set;

public class DateRunner {

	public static void main(String[] args) {

//		getDate();
		getLocalDateTime();
		getZonedDateTime();
	}
	
	// old date API (pre Java 8), otherwise it is depreciated.
	public static void getDate() {
		Date today = new Date();
		System.out.println(today);
	}
	
	public static void getLocalDateTime() {
		LocalDate july3 = LocalDate.of(2020, 07, 03);
		System.out.println(july3);
		
		LocalDate july6 = july3.plusDays(3);
		System.out.println(july6 + " was a " + july6.getDayOfWeek());
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime eight45 = LocalTime.of(8, 45);
		LocalTime ten15 = LocalTime.parse("10:15");
		System.out.println(eight45 + " " + ten15);
		System.out.println(ten15.isAfter(eight45));
		
		LocalDateTime ldt = LocalDateTime.of(july6, now);
		System.out.println(ldt);
	}
	
	public static void getZonedDateTime() {
		
		ZonedDateTime zdt;
		LocalDateTime ldt;
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println(zones);
		
		ZoneId zid = ZoneId.of("Australia/Tasmania");
		ldt = LocalDateTime.now();
		zdt = ZonedDateTime.of(ldt, zid);
		System.out.println(zdt);
	}

}
