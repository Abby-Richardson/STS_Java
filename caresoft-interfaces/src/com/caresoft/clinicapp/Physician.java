package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPPACompliantUser {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // Constructor that takes an ID
    public Physician (Integer id) {
    	super(id);
    }
    
    
    
    //Implement HIPAACompliantUser methods!
    
    @Override
	public boolean assignPin(int pin) {
		if (pin<=9999 && pin>=0000){
			setPin(pin);
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id.equals(confirmedAuthID)) {
			return true;
		}
		else {
			return false;
		}
	}
    
//	---------------------------------------------------------------------------
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	
    // TO DO: Setters & Getters
}
