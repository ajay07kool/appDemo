package com.alacriti.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		Country nepalCountry = new Country(1, "Nepal", "Kathmandu");
		Country chinaCountry = new Country(4, "China", "Bezeing");
		Country indiaCountry1 = new Country(1, "India", "Kolkata");
		Country indiaCountry2 = new Country(1, "India", "Delhi");
		Country pakistanCountry = new Country(2, "Pakistan", "Islamabad");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(nepalCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(indiaCountry1);
		listOfCountries.add(indiaCountry2);
		listOfCountries.add(pakistanCountry);

		System.out.println("Before Sorting : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(country);
		}

		// sort by country id
		Collections.sort(listOfCountries, new CountrySortByIdComparator());

		System.out.println("After Sort by id: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(country);
		}

		// Sort by countryName		
		Collections.sort(listOfCountries, new CountrySortByNameComparator());

		System.out.println("After Sort by name: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(country);
		}
		
		// Sort by countryCapital		
				Collections.sort(listOfCountries, new CountrySortByCapitalNameComparator());

				System.out.println("After Sort by capital: ");
				for (int i = 0; i < listOfCountries.size(); i++) {
					Country country = (Country) listOfCountries.get(i);
					System.out.println(country);
				}

		// Sort by id, countryName, then CountryCapital
		Collections.sort(listOfCountries, new CountryChainedComparator(
				new CountrySortByIdComparator(),
				new CountrySortByNameComparator(),
				new CountrySortByCapitalNameComparator()));
		
		System.out.println("After Sort by id name and capital: ");
		for (Country country : listOfCountries) {
			System.out.println(country);
        }
	}

}
