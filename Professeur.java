package modele.humain;

public class Professeur extends Humain {
	private String idprof;

	

	public Professeur(String lname, String fname, String idprof) {
		super(lname, fname);
		this.idprof=idprof;
	}



	public String getIdprof() {
		return idprof;
	}



	public void setIdprof(String idprof) {
		this.idprof = idprof;
	}



	@Override
	public String toString() {
		return "Professeur [idprof=" + idprof + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
