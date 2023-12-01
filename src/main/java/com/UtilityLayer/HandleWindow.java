package com.UtilityLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.BaseLayer.BaseClass;

public class HandleWindow extends BaseClass{

	public static ArrayList<String> handleWindow(Set<String> s) {
		Iterator<String> it = s.iterator();
		ArrayList<String> arr = new ArrayList<String>();

		while (it.hasNext()) {
			arr.add(it.next());
		}

		return arr;
	}

}
