package com.alacriti.demo.comparator;

public class Country {
	int countryId;
	String countryName;
	String capital;

	public Country(int countryId, String countryName, String capital) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country Id: " + this.getCountryId() + "||" + "Country name: "
				+ this.getCountryName() + "||" + "Capital name:" + this.getCapital();
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
