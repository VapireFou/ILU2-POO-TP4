package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {

//	public static void acheterProduit(IEtal[] marche, String produit, int quantiteSouhaitee) {
//		int quantiteRestante = quantiteSouhaitee;
//		for (int i = 0; i < marche.length && quantiteRestante != 0; i++) {
//			IEtal etal = marche[i];
//			int quantiteDisponible = etal.contientProduit(produit, quantiteRestante);
//			if (quantiteDisponible != 0) {
//				int prix = etal.acheterProduit(quantiteDisponible);
//				String chaineProduit = accorderNomProduit(produit, quantiteDisponible);
//				System.out.println("A l'étal n° " + (i + 1) + ", j'achete " + quantiteDisponible + " " + chaineProduit
//						+ " et je paye " + prix + " sous.");
//				quantiteRestante -= quantiteDisponible;
//			}
//		}
//		String chaineProduit = accorderNomProduit(produit, quantiteSouhaitee);
//		System.out.println("Je voulais " + quantiteSouhaitee + " " + chaineProduit + ", j'en ai acheté "
//				+ (quantiteSouhaitee - quantiteRestante) + ".");
//	}

	private static String accorderNomProduit(String produit, int quantiteSouhaitee) {
		String chaineProduit = produit;
		if (quantiteSouhaitee > 1) {
			chaineProduit = produit + "s";
		}
		return chaineProduit;
	}

	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3];
		IEtal etalSanglier = new Etal<>();
		IEtal etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
		marche[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);
	}

}
