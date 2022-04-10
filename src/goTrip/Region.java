package goTrip;

public class Region {
	private String region;
	
	public Region(String region) {
		this.region = region;
	}
	
	
	
	
	public String getCountry() {
		return region;
	}
	public void setCountry(String region) {
		this.region = region;
	}
	

	@Override
	public String toString() {
		return region;
	}

}
