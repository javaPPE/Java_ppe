// Cette vue permet d'editer tout ce que l'on veut afficher
// l'affichage se fait grace à la VuePrincipale

package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.Profil;
import modele.Modele;

public class VueProfil extends JFrame implements ActionListener {
	
	private static Profil unProfil = null;
	private JTextField tfDate = new JTextField();
	private JTextField tfTarif = new JTextField();
	private JTextField tfNbrEnfant = new JTextField();
	private JTextField tfEtablissement = new JTextField();
	
	private JButton btAnnuler = new JButton("annuler");
	private JButton btValider = new JButton("valider");
	private JPanel unPannel = new JPanel();
	
	
	public VueProfil(Profil unProf) {

		// creation des fenetres
		this.setTitle("edition d'un produit");
		this.setLayout(null);
		this.setResizable(false);
		this.setBounds(200, 200, 300, 500);
		this.unPannel.setBounds(0, 0, 300, 400);
		this.unPannel.setBackground(Color.cyan);
		this.unPannel.setLayout(new GridLayout(6, 2));

		this.unPannel.add(new JLabel("Date :"));
		this.unPannel.add(this.tfDate);

		this.unPannel.add(new JLabel("Tarif :"));
		this.unPannel.add(this.tfTarif);

		this.unPannel.add(new JLabel("Nombre d'enfant :"));
		this.unPannel.add(this.tfNbrEnfant);

		this.unPannel.add(new JLabel("Etablissement :"));
		this.unPannel.add(this.tfEtablissement);

		this.unPannel.add(this.btValider);
		this.unPannel.add(this.btAnnuler);

		this.unPannel.setVisible(true);

		// remplissage des textfields
		this.tfDate.setText(unProf.getDate() + "");
		this.tfTarif.setText(unProf.getTarif() + "");
		this.tfNbrEnfant.setText(unProf.getNbrEnfant() + "");
		this.tfEtablissement.setText(unProf.getEtablissement());

		// bouton cliquable
		this.btValider.addActionListener(this);
		this.btAnnuler.addActionListener(this);

		// renseigner le produit
		unProf = unProf;

		// attribut de la classe recoit le parametre recu dans le constructeur
		this.add(this.unPannel);

		this.setVisible(true);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*if (e.getSource() == this.btAnnuler) {
			this.dispose();
		} else if (e.getSource() == this.btValider) {
			int date = Integer.parseInt(this.tfDate.getText());
			int nbrEnfant = Integer.parseInt(this.tfNbrEnfant.getText());
			float tarif = Float.parseFloat(this.tfTarif.getText());
			String etablissement = this.tfEtablissement.getText();
			
			unProfil = new Profil(date, nbrEnfant, tarif, etablissement);

			// appel le modele pour la modif
			Modele.updateProduit(unProfil);
			JOptionPane.showMessageDialog(null, "la mise a jour a ete effectue");
			this.dispose();

		}*/
		
		
	}

}
