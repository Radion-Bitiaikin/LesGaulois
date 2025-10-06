package objets;

public class Chaudron {

	private int quantitePotion = 0;
	private int forcePotion = 0;

	public void remplirChaudron(int quantite, int force) {
		quantitePotion = quantite;
		forcePotion = force;
	}

	public boolean resterPotion() {
		return (0 < quantitePotion);
	}

	public int prendreLouche() {
		int force = forcePotion;
		quantitePotion--;
		if (!resterPotion())
			forcePotion = 0;
		return force;
	}
}
