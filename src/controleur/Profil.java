package controleur;

public class Profil {
	private String etablissement;
	private float tarif;
	private int nbrEnfant, date;
	
	public Profil() {
		this.etablissement =  "";
		this.tarif = 0;
		this.nbrEnfant = 0;
		this.date=0;
	}
	
	public Profil(String etablissement, float tarif, int nbrEnfant, int date) {
		this.etablissement = etablissement;
		this.tarif = tarif;
		this.nbrEnfant = nbrEnfant;
		this.date = date;
	}
	
	public String toString() {
		return this.etablissement + " - " + this.tarif + " - " + this.nbrEnfant + " - " + this.date;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	public int getNbrEnfant() {
		return nbrEnfant;
	}

	public void setNbrEnfant(int nbrEnfant) {
		this.nbrEnfant = nbrEnfant;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	

}

