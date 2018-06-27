package com.alacriti.demo.comparator;

import java.util.Comparator;

public class CountrySortByNameComparator implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		return (o1.getCountryName().compareTo(o2.getCountryName()));

	}

}
