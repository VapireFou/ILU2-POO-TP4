package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String datePeche) {
		super("Poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}

	public void decrireProduit() {
		System.out.println(this.getNom() + "pêchés" + this.datePeche);
	}

}
