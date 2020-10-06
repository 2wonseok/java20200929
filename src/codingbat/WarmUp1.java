package codingbat;

public class WarmUp1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {

		return !weekday || vacation;

	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		sum = (a == b) ? sum * 2 : sum;

		return sum;
	}

	public int diff21(int n) {
		int diff = 21 - n;
		diff = (n > 21) ? diff * 2 : diff;
		diff = (diff < 0) ? -diff : diff;
		return diff;
		
		if (n > 21) {
			return (n - 21) * 2;
		} else {
			return 21 - n;
		}
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
		return (talking && (hour > 20)) || (talking && (hour < 7));
	}

	public boolean makes10(int a, int b) {
		int sum = a + b;

		return (sum == 10) || (a == 10) || (b == 10);
		return (a + b == 10) || (a ==10 || b==10);
	}

	public boolean nearHundred(int n) {
		boolean d100 = (n >= 90) && (n <= 110);
		boolean d200 = (n >= 190) && (n <= 210);

		return d100 || d200;
		return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
		return ((Math.abs(100 - n) <= 10) ||
			    (Math.abs(200 - n) <= 10));
	}

	public boolean posNeg(int a, int b, boolean negative) {
		boolean aneg = a < 0;
		boolean bneg = b < 0;

		return negative ? (aneg && bneg) : (aneg ^ bneg);
		if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }
	}
	
	public String notString(String str) {
		int ind = str.indexOf("not");

		if (ind != 0) {
			String res = "not " + str;
			return res;
		}

		return str;
	}

	public String missingChar(String str, int n) {
		String left = str.substring(0, n);
		String right = str.substring(n + 1);

		return left + right;
		
		String front = str.substring(0, n);
		String back = str.substring(n + 1, str.length());

		return front + back;
	}

	public String frontBack(String str) {
		  if (str.length() <= 1) return str;
		  
		  String mid = str.substring(1, str.length()-1);
		  
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}
}
