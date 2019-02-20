package Util;

import java.util.concurrent.ThreadLocalRandom;

public class NumberUtil {

	
	public static int getRandomNumber(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
}
