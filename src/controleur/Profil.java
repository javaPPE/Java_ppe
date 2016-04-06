package controleur;

public class Profil {
	private String nom, prenom, adresse;
	private int nbrEnfant, tel, age;
	
	public Profil() {
		this.nom =  "";
		this.prenom =  "";
		this.adresse =  "";
		this.tel = 0;
		this.nbrEnfant = 0;
		this.age=0;
	}
	
	public Profil(String nom,String prenom, String adresse, int nbrEnfant, int tel, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.nbrEnfant = nbrEnfant;
		this.adresse = adresse;
		this.tel = tel;
		this.age = age;
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

	public int getNbrEnfant() {
		return nbrEnfant;
	}

	public void setNbrEnfant(int nbrEnfant) {
		this.nbrEnfant = nbrEnfant;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return this.nom + " - " + this.prenom + " - " + this.adresse + " - " + this.nbrEnfant+ " - " + this.tel+ " - " + this.age;
	}

	
	
	

}

