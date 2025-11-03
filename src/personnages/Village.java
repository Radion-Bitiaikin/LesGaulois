package personnages;

public class Village {

	private static final int NB_VILLAGEOIS_MAX = 30;

	private String nom;
	private Gaulois chef;

	private int nbVillageois = 0;
	private Gaulois[] villageois = new Gaulois[NB_VILLAGEOIS_MAX];

	public Village(String nom, Gaulois chef) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois++] = gaulois;
		gaulois.setVillage(this);
	}

	public Gaulois trouverVillageois(int numVillageois) {
		numVillageois--;
		if (NB_VILLAGEOIS_MAX <= numVillageois || null == villageois[numVillageois]) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		return villageois[numVillageois];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i]);
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois doublePolemix = new Gaulois("doublePolémix", 25);
		Village village = new Village("Village des Irréductibles", abraracourcix);
		// Gaulois gaulois = village.trouverVillageois(30);

		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		
		asterix.sePresenter();
		abraracourcix.sePresenter();
		doublePolemix.sePresenter();
	}
}
