package goTrip;

public class SearchRegion {
	private String region;

	public SearchRegion(String region) {
		this.region = region;
	}
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return region;
	}

//	@Override
//	public boolean equals(Object obj) {
//		SearchRegion fintRegion = (SearchRegion) obj;
//		
//		String other = fintRegion.getRegion();
//		
//		return true;
//		
//	}
	
	
	
	
}
