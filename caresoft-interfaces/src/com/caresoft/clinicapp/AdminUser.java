package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPPACompliantAdmin, HIPPACompliantUser {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser (Integer employeeID, String role) {
    	this.employeeID = employeeID;
    	this.role = role;
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    @Override
	public boolean assignPin(int pin) {
		if (pin<=999999 && pin>=000000) {
			setPin(pin);
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id == confirmedAuthID) {
			newIncident ("Passed");
			return true;
		}
		else {
			authIncident();
			return false;
		}
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}
    
    
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
//  getter
	public Integer getEmployeeID() {
		return employeeID;
	}
	
//	setter
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	
//	getter
	public String getRole() {
		return role;
	}
	
//	setter
	public void setRole(String role) {
		this.role = role;
	}
	
//	getter
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	
//	setter
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
    
    
}
