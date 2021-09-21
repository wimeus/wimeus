package modele.humain;

public class Humain {
	private String lname;
	private String fname;
	
	public Humain(String lname, String fname) {
		super();
		this.lname = lname;
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "Humain [lname=" + lname + ", fname=" + fname + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
