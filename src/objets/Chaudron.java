package objets;

public class Chaudron {
	
	private int quantitePotion=0;
	private int forcePotion=0;
	
	public Chaudron() {
	}
	
	public void remplirChaudron(int quantite, int force) {
		quantitePotion=quantite;
		forcePotion=force;
	}
	
	public boolean resterPotion() {
		
		if(0 < quantitePotion) return true;
		return false;
		
	}
	
	public int prendreLouche() {
		int force = forcePotion;
		quantitePotion--;
		if( 0 == quantitePotion ) forcePotion=0;
		return force;
	}
}
