package codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, 0);
		}

		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, str.length());
		}

		return map;
	}

	public Map<String, String> pairs(String[] strings) {

		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			// String first = str.substring(0, 1);
			// String last = str.substring(str.length()-1, str.length());
			String first = str.charAt(0) + "";
			String last = str.charAt(str.length() - 1) + "";
			map.put(first, last);
		}

		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			if (map.containsKey(str)) {
				int value = map.get(str);
				map.put(str, value + 1);
			} else {
				map.put(str, 1);
			}
		}

		return map;
	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			String key = str.substring(0, 1);
			String value = str;

			if (map.containsKey(key)) {
				value = map.get(key) + value;
			}

			map.put(key, value);
		}

		return map;
	}

}
