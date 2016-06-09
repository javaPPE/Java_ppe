package controleur;

// les infos coresspondante de la table personne dans le panel profil
public class Profil {
	private String nom, prenom, adresse, sexe, ville, email,datenaiss, cp, tel;
	

	public Profil() {
		this.nom = "";
		this.prenom = "";
		this.adresse = "";
		this.sexe = "";
		this.ville = "";
		this.email = "";
		this.tel = "";
		this.datenaiss = "";
		this.cp = "";
	}

	public Profil(String nom, String prenom, String adresse, String sexe, String ville, String email, String tel,
			String datenaiss, String cp) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.adresse = adresse;
		this.ville = ville;
		this.email = email;
		this.cp = cp;
		this.tel = tel;
		this.datenaiss = datenaiss;
	}

	public String toString() {
		return this.nom + " - " + this.prenom + " - " + this.adresse + " - " + this.ville + " - " + this.tel + " - "
				+ this.datenaiss + "-" + this.cp + "-" + this.email + "-" + this.sexe;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(String datenaiss) {
		this.datenaiss = datenaiss;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	

	

}
