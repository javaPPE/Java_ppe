package controleur;

public class Enfant {
	private String nom, prenom, dateE, sexe;

	public Enfant() {
		this.nom = "";
		this.prenom = "";
		this.sexe = "";
		this.dateE = "";

	}

	public Enfant(String nom, String prenom, String dateE, String sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateE = dateE;
	}

	public String toString() {
		return this.nom + " - " + this.prenom + " - " + this.sexe + "-" + this.dateE;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateE() {
		return dateE;
	}

	public void setDateE(String dateE) {
		this.dateE = dateE;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

}
