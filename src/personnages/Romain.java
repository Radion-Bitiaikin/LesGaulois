package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements = new Equipement[2];
	int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	
	private boolean isInvariantVerified() {
		return 0 <= force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}


	public void recevoirCoup(int forceCoup) {
		
		assert 0 <= forceCoup;
		
		assert force > force - forceCoup;
		force -= forceCoup;

		if (force < 1) {
			parler("J'abandonne !");
			force = 0;
		}

		else {
			parler("Aïe");
		}
		
		assert isInvariantVerified();
	}
	
	void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if( equipement!=null && !equipement.equals(equipements[0]) ) {
				equipements[1] = equipement;
				System.out.println("Le soldat " + nom + " s’equipe avec un " + equipement.toString() + ".");
			} else {
				System.out.println("Le soldat " + nom + " possede déja un " + equipement.toString() + " !");
			}
			break;
		case 0:
			equipements[0] = equipement;
		}
	}
	
	public static void main(String[] args) {

		Romain minus = new Romain("Minus", 6);
		
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);

	}

}
