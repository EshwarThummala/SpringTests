package com.bms.beans;

public class Address {
	public String street;
	public String city;
	public String state;
	public String country;
	public void setStreet(String street)
	{
		this.street = street;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	@Override
	public String toString() {
		return this.street+","+this.city+","+this.state+","+this.country;
	}
}
