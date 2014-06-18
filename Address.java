/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaretest2;

/**
 *
 * @author jx
 */
public class Address {
	// set the street address 1 as private string
	private String streetAddress1;
	// set the street address 2 as private string
	private String streetAdress2;
	// set the string as city
	private String city;
	// set the string state
	private String state;
	// set the zip as string
	private String zip;

	// set the address as constructor and have 5 parameters as street address
	// 1&2,city,state and zip
	public Address(String streetAdress1, String streetAdress2, String city,
			String state, String zip) {
		this.streetAddress1 = streetAdress1;
		this.streetAdress2 = streetAdress2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/*
	 * set get street address
	 * 
	 * @return street address1
	 */
	public String getStreetAddress1() {
		return streetAddress1;
	}

	/*
	 * get street address2
	 * 
	 * @return street address2
	 */
	public String getStreetAdress2() {
		return streetAdress2;
	}

	/*
	 * get string city
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/*
	 * get state
	 * 
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/*
	 * get zip
	 * 
	 * @return zip
	 */
	public String getZip() {
		return zip;
	}

}

