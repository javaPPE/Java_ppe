package controleur;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import vue.VuePrincipale;

public class Controleur {
	public static void main(String args[]) {
		
		//new VuePrincipale();
		//new Connexion();
		VuePrincipale panel = new VuePrincipale(new ImageIcon("image/Background.png").getImage());

	    JFrame frame = new JFrame();
	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);
		

	}
}
