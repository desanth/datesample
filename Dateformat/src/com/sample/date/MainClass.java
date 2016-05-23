package com.sample.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainClass {

	public static void main(String[] args) {
		String date = "1/27/2016 7:08:00 AM";
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy hh:mm:ss a");
	try {
		System.out.println(sdf.parse(date));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
