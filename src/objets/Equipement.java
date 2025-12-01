package objets;

public enum Equipement {
	
	CASQUE("casque"),
	BOUCLIER("bouclier");
	
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
