package model.materiels;

public class Materiels {
	private String name;
	private String modele;
	private String use;
	public Materiels(String name, String modele, String use) {
		super();
		this.name = name;
		this.modele = modele;
		this.use = use;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	@Override
	public String toString() {
		return "Materiels [name=" + name + ", modele=" + modele + ", use=" + use + "]";
	}
	
	
}
