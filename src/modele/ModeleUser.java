package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controleur.Profil;

public class ModeleUser {

	public static String[] selectWhere(String login, String mdp) {
		// select where designation etc.
		String[] tab = new String[2];
		BDD uneBDD = new BDD("localhost", "MairieDeVilliers", "root", "");
		uneBDD.chargerPilote();
		uneBDD.seConnecter();
		String requete = "select count(login) as nb, login from personne where login ='" + login
				+ "' and Mot_de_Passe ='" + mdp + "';";
		try {
			Statement unStat = uneBDD.getMaconnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			unRes.next();
			int nb = unRes.getInt("nb");
			if (nb > 0) {
				tab[0] = unRes.getString("login");

			} else {
				tab[0] = null;

			}
			unStat.close();
			unRes.close();
		} catch (SQLException exp) {
			System.out.println("Erreur d'execution :" + requete);
		}

		uneBDD.seDeconnecter();
		return tab;
	}
	// permet d'afficher les infos du profil
	public static Profil selectWhereProfil(String login, String mdp) {
		
		String[] tab = new String[2];
		BDD uneBDD = new BDD("localhost", "MairieDeVilliers", "root", "");
		uneBDD.chargerPilote();
		uneBDD.seConnecter();
		Profil unProfil = null;
		String requete = "select * from personne where login ='" + login + "' and Mot_de_Passe ='" + mdp + "';";
		try {
			Statement unStat = uneBDD.getMaconnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			unRes.next();

			String nom = unRes.getString("NOM");
			String prenom = unRes.getString("PRENOM");
			String datenaiss = unRes.getDate("DATENAISS").toString();
			String sexe = unRes.getString("SEXE");
			String adresse = unRes.getString("ADRESSE");
			String cp = unRes.getString("CP");
			String ville = unRes.getString("Ville");
			String tel = unRes.getString("TEL");
			String email = unRes.getString("EMAIL");

			unProfil = new Profil(nom, prenom, adresse, sexe, ville, email, datenaiss, tel, cp);

			unStat.close();
			unRes.close();
		} catch (SQLException exp) {
			System.out.println("Erreur d'execution :" + requete);
		}

		uneBDD.seDeconnecter();
		return unProfil;
	}
	
	
	// permet de modifier les infos du profil
	public static void update(Profil unProfil) {

		
		BDD uneBDD = new BDD("localhost", "MairieDeVilliers", "root", "");
		uneBDD.chargerPilote();
		uneBDD.seConnecter();
		String requete = "update personne set NOM ='" + unProfil.getNom() + "' , PRENOM = '" + unProfil.getPrenom()
				+ "', DATENAISS ='" + unProfil.getDatenaiss() + "',SEXE='" + unProfil.getSexe() + "',ADRESSE='"
				+ unProfil.getAdresse() + "',CP='" + unProfil.getCp() + "',Ville='" + unProfil.getVille() + "',TEL='"
				+ unProfil.getTel() + "' where EMAIL='" + unProfil.getEmail()+"';";
		try {
			Statement unStat = uneBDD.getMaconnexion().createStatement();
			unStat.execute(requete);
			unStat.close();

		} catch (SQLException exp) {
			System.out.println("Erreur d'execution :" + requete);
		}

		uneBDD.seDeconnecter();

	}

}
