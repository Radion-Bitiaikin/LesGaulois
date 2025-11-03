package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	
	private boolean isInvariantVerified() {
		return ( 0 <= force ) ;
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
		
		force = force - forceCoup;

		if (force < 1) {
			parler("J'abandonne !");
			force = 0;
		}

		else {
			parler("Aïe");
		}
	}
	
	public static void main(String[] args) {

		Romain minus = new Romain("Minus", 6);
		

	}

}
