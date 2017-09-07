package com.zdjy.bigdata.antun.util;

import org.apache.commons.lang3.StringUtils;

public class ValidateUtils {
	private static final String MOBILEPATTERNSTRING = "\\d{11}";

	public static boolean isMobile(String mobile) {
		if (StringUtils.isBlank(mobile))
			return false;
		if (!mobile.matches(MOBILEPATTERNSTRING))
			return false;
		return true;
	}

	private static final String NAMEPATTERNSTRING = "[\\u4e00-\\u9fa5]{2,10}";

	public static boolean isName(String name) {
		if (StringUtils.isBlank(name))
			return false;
		if (!name.matches(NAMEPATTERNSTRING))
			return false;
		return true;

	}

	public static boolean isSex(Integer userSex) {
		if (userSex==null)
			return false;
		if (userSex != 1 && userSex != 0)
			return false;
		return true;
	}

	private static final String BIRTHPATTERNSTRING = "\\d{4}-\\d{2}-\\d{2}";

	public static boolean isBirth(String userBirth) {
		if (StringUtils.isBlank(userBirth))
			return false;
		if (!userBirth.matches(BIRTHPATTERNSTRING))
			return false;
		return true;
	}
	private static final String IDNOPATTERNSTRING = "\\d{17}[\\dxX]";
	public static boolean isIdNo(String userIdNo) {
		if (StringUtils.isBlank(userIdNo))
			return false;
		if (!userIdNo.matches(IDNOPATTERNSTRING))
			return false;
		return true;
	}
}
