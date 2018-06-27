package com.alacriti.demo.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountryChainedComparator implements Comparator<Country> {

	private List<Comparator<Country>> listComparators;

	@SafeVarargs
	public CountryChainedComparator(Comparator<Country>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(Country emp1, Country emp2) {
		for (Comparator<Country> comparator : listComparators) {
			int result = comparator.compare(emp1, emp2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}
