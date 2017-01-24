package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) throws ParseException
	{
		Patient p = new Patient();
		String date = "1990-02-13 10:20:56";
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		p.setDOB(df.parse(date));
		System.out.println(p.getDOB());
		
		Patient p1 = new Patient();
		p1.setDOB(new Date());
		System.out.println(p1.getDOB());
	}

}
