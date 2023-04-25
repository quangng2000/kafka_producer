package com.example.demo.messageProducer;

public class VitalSigns {
    private String patientId;
    private long time;
    private int heartRate;
    private int bloodPressure;
	public VitalSigns(String patientId2, double heartRate2, double bloodPressure2) {
		// TODO Auto-generated constructor stub
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public int getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(int bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	

    // getters and setters
}
