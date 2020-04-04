package Dao;

import java.util.ArrayList;

import java.util.List;

public class Day {
	
	private String date  ;
    private boolean etat;
    private List<period> periods =new ArrayList<period>() ;
    
     
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public List<period> getPeriods() {
		return periods;
	}
	public void setPeriods(List<period> periods) {
		this.periods = periods;
	}
	public Day() {
		
		period per1 = new period(1,"From 8:00 AM to 9:00 AM " );
		period per2 = new period(2,"From 9:00 AM to 10:00 AM ");
		period per3 = new period(3,"From 10:00 AM to 11:00 AM ");
		period per4 = new period(4,"From 11:00 AM to 12:00 AM ");
		periods.add(per1);
		periods.add(per2);
		periods.add(per3);
		periods.add(per4);
		
	}
	
	

    
    
    
    
}
