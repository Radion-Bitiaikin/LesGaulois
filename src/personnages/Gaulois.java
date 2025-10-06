package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village = null;

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
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		if (1 > effetPotion) {
			effetPotion = 1;
		}
		romain.recevoirCoup(force * effetPotion / 3);
		effetPotion--;
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}

	// a ne pas utiliser a part par la classe Village
	public void setVillage(Village village) {
		this.village = village;
	}

	public void sePresenter() {
		if (null == village) {
			System.out.println("Le Gaulois " + this.getNom()
					+ " : \"Bonjour, je m'appelle \" + this.getNom() + \". Je voyage de villages en villages.\"");
		}
	}

}