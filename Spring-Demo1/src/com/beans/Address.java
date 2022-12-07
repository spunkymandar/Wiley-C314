package com.beans;

public class Address {
	String buildingName,areaName, cityName;

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Address() {
		
	}

	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}
	
	

	
}
