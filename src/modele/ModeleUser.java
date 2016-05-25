package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModeleUser {
    
    public static String [] selectWhere (String login, String mdp)
    {
        //select where designation etc.
        String [] tab = new String [2];
        BDD uneBDD = new BDD ("localhost", "MairieDeVilliers", "root", "");
        uneBDD.chargerPilote();
        uneBDD.seConnecter();
        String requete ="select count(login) as nb, login from personne where login ='"+login+"' and Mot_de_Passe ='"+mdp+"';";  
        try {
            Statement unStat = uneBDD.getMaconnexion().createStatement();
            ResultSet unRes = unStat.executeQuery(requete);
            unRes.next();
            int nb = unRes.getInt("nb");
            if (nb>0)
            {
                tab[0] = unRes.getString("login");
                
            }
            else {
                tab[0] = null;
              
            }
            unStat.close();
            unRes.close();
        }
        catch (SQLException exp)
        {
            System.out.println("Erreur d'execution :"+ requete);
        }
        
        uneBDD.seDeconnecter();
        return tab;
    }
    
}
