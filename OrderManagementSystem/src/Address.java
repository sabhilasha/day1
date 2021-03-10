
public class Address {
	private String streetname;
	private String city;
	private String state;
	private int pincode;
	
	
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String streetname, String city, String state, int pincode) {
		super();
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

}
