package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public String getNom() {
		return nom;
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {

		String nomGaulois = gaulois.getNom();

		if (chaudron.resterPotion()) {
			if (nomGaulois.equals("Obélix")) {
				parler("Non " + nomGaulois + " Non! Et tu le sais très bien!");
			}

			else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens " + nomGaulois + " un peu de potion magique");
			}
		}

		else {
			parler("Désole " + nomGaulois + " il n'y a plus une seule goutte de potion");
		}

	}

}
