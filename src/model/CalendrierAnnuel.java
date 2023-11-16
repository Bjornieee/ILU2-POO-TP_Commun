package model;


public class CalendrierAnnuel {

	private static class Mois{
		private String nom;
		private boolean jours[];
		private Mois(String nom, int Nbjours) {
			this.nom = nom;
			this.jours = new boolean [Nbjours];
		}
		private boolean estLibre(int jour) {
			return true;
		}
		private boolean reserver(int jour) {
			if(estLibre(jour)) {
				return false;
			}
			return true;
		}
	}
	public CalendrierAnnuel() {
		Mois calendrierAnnuel[] = new Mois[12];
	}
	public boolean estLibre(int jour, int mois) {
		Mois[] calendrierAnnuel;
		return calendrierAnnuel[mois-1].estLibre(jour);
	}
	public boolean reserver(int jour, int mois) {
		return calendrierAnnuel[mois-1].reserver(jour);
	}
}
