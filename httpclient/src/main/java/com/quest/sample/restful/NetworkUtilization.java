package com.quest.sample.restful;

public class NetworkUtilization {

	private String id;
	private Double utilization;
	
	public NetworkUtilization(String id, Double utilization) {
		this.id = id;
		this.utilization = utilization;
	}
	
	public NetworkUtilization(String id) {
		this(id, 0.0);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getUtilization() {
		return utilization;
	}
	public void setUtilization(Double utilization) {
		this.utilization = utilization;
	}
}
