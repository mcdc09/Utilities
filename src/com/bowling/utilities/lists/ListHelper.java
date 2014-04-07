package com.bowling.utilities.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListHelper {

	public static String listToString(List<?> list) {
		String out = "";
		if(list != null && !list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				out += i + "\t" + list.get(i).toString() + "\n";
			}
		}

		return out;
	}

	public static int[] convertSetToArray(Set<Integer> set) {
		int[] out = new int[set.size()];
		List<Integer> l = new ArrayList<Integer>(set);
		for(int i = 0; i < set.size(); i++) {
			out[i] = l.get(i);
		}
		return out;
	}

}
