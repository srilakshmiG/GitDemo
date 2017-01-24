package com.medicationDemo;

import java.util.Date;

public class Medication {
	
	String name;
	Dosage frequency;
	Date startDate;
	Period stop;
	public enum Dosage
	{
		AFTER_MEALS, DAY_NIGHT,WEEKLY_ONCE,DAILY_ONCE;
	}
	
	public enum Period
	{
		ONE_WEEK, ONE_MONTH, TWO_DAYS, YEAR;
	}

	public String toString()
	{
		return "Medication [ name =" + name + ", Frequency=" + frequency + ", StartDate="+ startDate + ", period=" + stop +  "]";         
	}
}
