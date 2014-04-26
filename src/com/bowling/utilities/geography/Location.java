package com.bowling.utilities.geography;

public class Location {
	private float latitude, longitude;
	
	public Location(float lat, float lon) {
		this.latitude = lat;
		this.longitude = lon;
	}
	
	public Location(Location l) {
		this(l.getLatitude(), l.getLongitude());
	}
	
	public Location(double lat, double lon) {
		this((float) lat, (float) lon);
	}

	
	// Getters and Setters
	/**
	 * @return the latitude
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}
