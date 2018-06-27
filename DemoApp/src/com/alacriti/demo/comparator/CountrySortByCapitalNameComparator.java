package com.alacriti.demo.comparator;

import java.util.Comparator;

public class CountrySortByCapitalNameComparator implements Comparator<Country> {

		@Override
		public int compare(Country o1, Country o2) {
			return (o1.getCapital().compareTo(o2.getCapital()));
	}
}
