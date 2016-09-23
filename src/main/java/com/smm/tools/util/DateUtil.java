package com.smm.tools.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author zengshihua
 *
 */
public class DateUtil {

	// 格式化当前系统日期
	public static String getDateWidthFormat(String format) {
		if (format == null || format.equals("")) {
			format = "yyyy-MM-dd HH:mm:ss";
		}

		SimpleDateFormat dateFm = new SimpleDateFormat(format);
		String dateTime = dateFm.format(new java.util.Date());
		return dateTime;
	}

	// 格式化日期
	public static String doFormatDate(Date date, String format) {
		if (format == null || format.equals("")) {
			format = "yyyy-MM-dd HH:mm:ss";
		}

		if (date == null) {
			date = new Date();
		}

		SimpleDateFormat dateFm = new SimpleDateFormat(format);
		String dateTime = dateFm.format(date);
		return dateTime;
	}

	// 转化时间字符串为日期
	public static Date doSFormatDate(String dateStr, String format) {
		if (dateStr.equals("")) {
			return null;
		}
		if (format == null || format.equals("")) {
			format = "yyyy-MM-dd HH:mm:ss";
		}

		SimpleDateFormat dateFm = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = dateFm.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String doFormatDate(Date oldDate, Date newDate) {
		Calendar oldCal = Calendar.getInstance();
		Calendar newCal = Calendar.getInstance();
		oldCal.setTime(oldDate);
		newCal.setTime(newDate);
		if (oldCal.equals(newCal)) {
			return "";
		} else if (oldCal.before(newCal)) {
			return "";
		} else if (oldCal.after(newCal)) {
			return "";
		} else {
			return "";
		}

	}

	public static int getMinute() {
		Calendar calendar = Calendar.getInstance();
		int minute = calendar.get(Calendar.MINUTE);
		return minute;
	}

	public static void main(String[] args) {
		System.out.println(DateUtil.getDateWidthFormat(""));
	}

}
