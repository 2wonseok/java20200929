package codingbat;

public class WarmUp2 {
	public String stringTimes(String str, int n) {
		String res = "";

		for (int i = 0; i < n; i++) {
			res += str;
		}

		return res;
	}

	public String frontTimes(String str, int n) {
		String res = "";

		String front = str;

		if (str.length() > 3) {
			front = str.substring(0, 3);
		}

		for (int i = 0; i < n; i++) {
			res += front;
		}

		return res;
	}

	int countXX(String str) {
		int cnt = 0;
		int len = str.length();

		// String sub = str.substring(0, 2);
		// str.substring(len-2, len);

		for (int i = 0; i <= len - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				cnt++;
			}
		}

		return cnt;
	}

	boolean doubleX(String str) {
		int xinx = str.indexOf("x");
		int xxinx = str.indexOf("xx");

		if (xinx == -1) {
			return false;
		}

		if (xinx == xxinx) {
			return true;
		}

		return false;
	}

	public String stringBits(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i += 2) {
			res += str.charAt(i);
		}

		return res;
	}

	public String stringSplosion(String str) {
		String res = "";

		for (int i = 1; i <= str.length(); i++) {
			res += str.substring(0, i);
		}

		return res;
	}

	public int last2(String str) {
		int len = str.length();
		if (len >= 2) {
			int cnt = 0;
			String last2 = str.substring(len - 2, len);
			for (int i = 0; i < len - 1; i++) {
				String sub = str.substring(i, i + 2);
				if (sub.equals(last2)) {
					cnt++;
				}
			}
			return cnt - 1;
		}
		return 0;
	}

}
