package com.app.proj.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class GenUtil {

	public static String generateId() {
		Random randomGenerator = new Random();
		long nextLong = randomGenerator.nextLong();
		SimpleDateFormat gmtDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		gmtDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		return Long.toString(nextLong) + ":" + gmtDateFormat.format(new Date());
	}
}