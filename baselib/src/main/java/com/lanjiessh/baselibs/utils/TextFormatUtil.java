package com.lanjiessh.baselibs.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String
 * Created by Vin on 2015/12/31.
 */
public class TextFormatUtil {

	/**
	 * is number
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isAllDigit(String str) {
		if (!str.equals("") && str.length() > 0) {
			int len = 0;
			for (int idx = 0; idx < str.length(); idx++) {
				if (Character.isDigit(str.charAt(idx))) {
					len++;
				}
			}
			if (len == str.length()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * format delete"-"
	 * 
	 * @param date
	 * @return
	 */
	public static String dateChange(String date) {
		StringBuilder sb = new StringBuilder();
		String[] dateStr = date.split("-");
		for (int i = 0; i < dateStr.length; i++) {
			sb.append(dateStr[i]);
		}
		return sb.toString();
	}

	/**
	 * is number and "*"
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isJustDigitStar(String str) {
		int len = 0;
		for (int idx = 0; idx < str.length(); idx++) {
			if (Character.isDigit(str.charAt(idx)) || str.charAt(idx) == '.') {
				len++;
			}
		}
		if (len == str.length()) {
			return true;
		}
		return false;
	}


	/**
	 * length
	 * 
	 * @param s
	 * @param charNum
	 * @return
	 */
	public static boolean allowMaxLenthOfString(String s, int charNum) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			String tmp = s.substring(i, i + 1);
			if (tmp.getBytes().length == 3) {
				num += 2;
			} else if (tmp.getBytes().length == 1) {
				num += 1;
			}
		}
		if (num <= charNum) {
			return true;
		}
		return false;
	}

	/**
	 *
	 * @return
	 */
	public static boolean CheckStrType(String str) {
		boolean check = true;
		for (int i = 0; i < str.length(); i++) {
			String tmp = str.substring(i, i + 1);
			if (isChinese(tmp)) {
				check = true;
			} else if (isEnglish(tmp)) {
				check = true;
			} else {
				return false;
			}
		}
		return check;
	}

	/**
	 * mail address
	 *
	 * @param str
	 * @return
	 */
	public static Boolean EmailCheck(String str) {

		if (str.toString().length() > 0
				&& !str.matches("^\\w+@\\w+\\.(com|cn)")) {
			return false;

		} else
			return true;
	}

	/**
	 * is date
	 *
	 * @param strDate
	 * @return
	 */
	public static boolean isDate(String strDate) {
		Pattern pattern = Pattern
				.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
		Matcher m = pattern.matcher(strDate);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * is phone
	 * 
	 * @param phonenum
	 * @return
	 */
	public static boolean isPhoneNum(String phonenum) {
		Pattern pattern = Pattern.compile("^(1[0-9])\\d{9}$");
		Matcher m = pattern.matcher(phonenum);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *  identity card
	 * 
	 * @param strID
	 * @return
	 */
	public static boolean isIDNumber(String strID) {
		Pattern pattern = Pattern
				.compile("((11|12|13|14|15|21|22|23|31|32|33|34|35|36|37|41|42|43|44|45|46|50|51|52|53|54|61|62|63|64|65|71|81|82|91)\\d{4})((((19|20)(([02468][048])|([13579][26]))0229))|((20[0-9][0-9])|(19[0-9][0-9]))((((0[1-9])|(1[0-2]))((0[1-9])|(1\\d)|(2[0-8])))|((((0[1,3-9])|(1[0-2]))(29|30))|(((0[13578])|(1[02]))31))))((\\d{3}(x|X))|(\\d{4}))");
		Matcher m = pattern.matcher(strID);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * address
	 * 
	 * @param address
	 * @return
	 */
	public static boolean isAddress(String address) {
		int i = 0, j = 0, k = 0, u = 0;
		int count = address.length();
		Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]");
		Matcher m = pattern.matcher(address);
		while (m.find()) {
			i++;
		}
		for (int idx = 0; idx < count; idx++) {
			char c = address.charAt(idx);
			int tmp = (int) c;
			if ((tmp >= 'a' && tmp <= 'z') || (tmp >= 'A' && tmp <= 'Z')) {
				j++;
			}
			if (Character.isDigit(address.charAt(idx))) {
				k++;
			}
			if (c == ' ') {
				u++;
			}
		}
		if ((i + j + k + u) == count) {
			return true;
		} else {
			return false;
		}
	}


	/**
	 * Chinese
	 *
	 * @param name
	 * @return
	 */
	public static boolean isChinese(String name) {
		int j = 0;
		int i = name.length();
		Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]");
		Matcher m = pattern.matcher(name);
		while (m.find()) {
			j++;
		}
		if (i == j) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @param english
	 * @return
	 */
	public static boolean isEnglish(String english) {
		Pattern pattern = Pattern.compile("^[A-Za-z]+$");
		Matcher m = pattern.matcher(english);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @param number
	 * @return
	 */
	public static boolean isData(String number) {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher m = pattern.matcher(number);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @param number
	 * @return
	 */
	public static boolean quanshiling(String number) {
		Pattern pattern = Pattern.compile("^0++$");
		Matcher m = pattern.matcher(number);
		if (m.matches()) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 *
	 * @param input
	 * @return boolean
	 */
	public static boolean isEmpty(String input) {
		if (input == null || "".equals(input))
			return true;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
				return false;
			}
		}
		return true;
	}

}
