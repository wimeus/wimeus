package model.cours;

public class Cours {
	
		private String nom;
		private String codecours;
		private String nombredecredit;
		private String dureecours;
		private String codeprofesseur;
		
	
		public Cours(String nom, String codecours, String nombredecredit, String dureecours, String codeprofesseur) {
			super();
			this.nom = nom;
			this.codecours = codecours;
			this.nombredecredit = nombredecredit;
			this.dureecours = dureecours;
			this.codeprofesseur = codeprofesseur;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getCodecours() {
			return codecours;
		}
		public void setCodecours(String codecours) {
			this.codecours = codecours;
		}
		public String getNombredecredit() {
			return nombredecredit;
		}
		public void setNombredecredit(String nombredecredit) {
			this.nombredecredit = nombredecredit;
		}
		public String getDureecours() {
			return dureecours;
		}
		public void setDuree(String dureecours) {
			this.dureecours = dureecours;
			
		}
		public String getCodeprofesseur() {
			return codeprofesseur;
		}
		public void setCodeprofesseur(String codeprofesseur) {
			this.codeprofesseur = codeprofesseur;
		}
		@Override
		public String toString() {
			return "Cours [nom=" + nom + ", codecours=" + codecours + ", nombredecredit=" + nombredecredit
					+ ", dureecours=" + dureecours + ", codeprofesseur=" + codeprofesseur + "]";
		}
		
		
		
}
