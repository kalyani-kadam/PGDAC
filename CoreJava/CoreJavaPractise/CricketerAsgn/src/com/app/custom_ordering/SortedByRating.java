package com.app.custom_ordering;

import java.util.Comparator;

import com.app.entity.Cricketer;

public class SortedByRating implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
		
		if(c1.getRating() < c2.getRating())
			return -1;
		if(c1.getRating() == c2.getRating())
			return 0;
		return 1;
	}

}
