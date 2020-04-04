package Dao;

public class period {
	
	private int id;
	private String Label;
	private boolean etat;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return Label;
	}
	public void setLebel(String lebelet) {
		this.Label = lebelet;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public period(int id, String lebelet) {
		super();
		this.id = id;
		this.Label = lebelet;
		this.etat=true;
	}
	
	

}
