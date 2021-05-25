package com.bms.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//https://onlinegdb.com/NyZOBsTYl
public class GreetingsImpl implements Greetings {

	public int id;
	public String name;
	public List<Address> address;
	public Map<String,String> contacts;
	/*public GreetingsImpl(String name,int id,List<Address> addr)
	{
		this.name = name;
		this.address = addr;
		this.id = id;
	}*/
	public void setId(int id) 
	{
		this.id = id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setAddress(List<Address> address) 
	{
		this.address = address;
	}
	public void setContacts(Map<String, String> contacts)
	{
		this.contacts = contacts;
	}
	@Override
	public void greetingMessage()
	{
		System.out.println("id = "+this.id);
		System.out.println("Name = "+this.name);
		System.out.println("Address : "+this.address);
		System.out.println("Contacts");
		for(String key:contacts.keySet())
		{
			System.out.println(key+" "+contacts.get(key));
		}
	}

}
