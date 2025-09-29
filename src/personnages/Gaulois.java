package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		if(1>effetPotion) effetPotion=1;
		romain.recevoirCoup(force*effetPotion/3);
		effetPotion--;
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
}