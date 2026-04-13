package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poid;
	private Gaulois chasseur;
	
	public Sanglier(int poid, Gaulois chasseur) {
		super("Sanglier", Unite.KILO_GRAMME);
		this.poid = poid;
		this.chasseur = chasseur;
	}
	
	
	public void decrireProduit() {
		System.out.println(this.getNom() + "de" + this.poid + "chassé par " + this.chasseur);
	}
}
