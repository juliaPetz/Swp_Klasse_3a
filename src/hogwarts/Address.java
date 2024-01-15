package hogwarts;

public class Address {
	
	private String streetName;
	private int houseNumber;
	private int zipCode;
	private String cityName;
	private String country;
	
	public Address(String streetName, int houseNumber, int zipCode, String cityName, String country) {
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.country = country;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address: " + streetName + " " + houseNumber + " | " + zipCode
				+ " " + cityName + " | " + country;
	}
	
	
	
	

}
