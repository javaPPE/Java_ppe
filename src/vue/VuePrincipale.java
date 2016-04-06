// La VuePrincipale permet d'afficher ce que l'on édite dans VueProfil

package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VuePrincipale extends JFrame implements ActionListener {

	private JPanel panelMenu = new JPanel();
	private JPanel panelProfil = new JPanel();
	private JPanel panelCantine = new JPanel();
	private JPanel panelCentreLoisirs = new JPanel();

	// construction des boutons

	private JButton btProfil = new JButton("Profil");
	private JButton btCantine = new JButton("Cantine");
	private JButton btCentreLoisir = new JButton("Centre de loisirs");
	private JButton btQuitter = new JButton("quitter");
	

	// construction des objets du panel Profil
	
	private JTextField tfNom = new JTextField();
	private JTextField tfPrenom = new JTextField();
	private JTextField tfAge = new JTextField();
	private JTextField tfTel = new JTextField();
	private JTextField tfNbrEnfant = new JTextField();
	private JTextField tfAdresse = new JTextField();
	private JButton btAnnuler = new JButton("annuler");
	private JButton btValider = new JButton("enregistrer");
	


	// construction des objets du panel Cantine

	// construction des objets du panel CentreLoisirs

	public VuePrincipale() {

		this.setVisible(true);

		this.setTitle("Profil utilisateur");
		this.setBounds(200, 200, 700, 400);
		this.setResizable(false);
		this.setLayout(null);

		// construction du panel menu
		this.panelMenu.setBounds(10, 10, 100, 380);
		this.panelMenu.setBackground(Color.white); // temporaire, image à
													// intégré
		this.panelMenu.setLayout(new GridLayout(7, 1));
		this.panelMenu.add(new JLabel("menu principal"));
		this.panelMenu.add(this.btProfil);
		this.panelMenu.add(this.btCantine);
		this.panelMenu.add(this.btCentreLoisir);
		this.panelMenu.add(this.btQuitter);
		this.panelMenu.add(new JLabel(""));
		this.panelMenu.setVisible(true);
		this.add(this.panelMenu);

		// ___________________________________________________________//

		// bouton cliquable du panel menu
		this.btProfil.addActionListener(this);
		this.btCantine.addActionListener(this);
		this.btCentreLoisir.addActionListener(this);
		this.btQuitter.addActionListener(this);

		// bouton cliquable du panel Profil
		this.btValider.addActionListener(this);
		this.btAnnuler.addActionListener(this);

		// bouton cliquable du panel Cantine

		// bouton cliquable du panel CentreLoisirs

		// ___________________________________________________________//

		// construction du panel Profil
		this.panelProfil.setBounds(140, 10, 350, 400);
		this.panelProfil.setBackground(Color.cyan); // temporaire, image à
													// intégré

		this.panelProfil.setLayout(new GridLayout(9, 2));
		this.panelProfil.add(new JLabel("Nom :"));
		this.panelProfil.add(this.tfNom);

		this.panelProfil.add(new JLabel("Prenom :"));
		this.panelProfil.add(this.tfPrenom);
		
		this.panelProfil.add(new JLabel("Age :"));
		this.panelProfil.add(this.tfAge);
		
		this.panelProfil.add(new JLabel("Tel :"));
		this.panelProfil.add(this.tfTel);

		this.panelProfil.add(new JLabel("Nombre d'enfant"));
		this.panelProfil.add(this.tfNbrEnfant);
		
		this.panelProfil.add(new JLabel("Adresse :"));
		this.panelProfil.add(this.tfAdresse);

		
		this.panelProfil.add(new JLabel(""));
		this.panelProfil.add(new JLabel(""));

		this.panelProfil.add(this.btValider);
		this.panelProfil.add(this.btAnnuler);

		this.panelProfil.setVisible(false);
		this.add(this.panelProfil);

		// construction du panel Cantine
		this.panelCantine.setBounds(140, 10, 500, 340);
		this.panelCantine.setBackground(Color.gray); // temporaire, image à
														// intégré
		this.panelCantine.setLayout(null);
		this.panelCantine.setLayout(null);
		this.panelCantine.setVisible(false);
		this.add(this.panelCantine);

		// construction du panel CentreLoisirs
		this.panelCentreLoisirs.setBounds(140, 10, 500, 340);
		this.panelCentreLoisirs.setBackground(Color.YELLOW); // temporaire,
																// image à
																// intégré
		this.panelCentreLoisirs.setLayout(null);
		this.panelCentreLoisirs.setVisible(false);
		this.add(this.panelCentreLoisirs);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btProfil) {

			this.panelProfil.setVisible(true);
			this.panelCantine.setVisible(false);
			this.panelCentreLoisirs.setVisible(false);

		} else if (e.getSource() == this.btCantine) {
			this.panelProfil.setVisible(false);
			this.panelCantine.setVisible(true);
			this.panelCentreLoisirs.setVisible(false);

		} else if (e.getSource() == this.btCentreLoisir) {
			this.panelProfil.setVisible(false);
			this.panelCantine.setVisible(false);
			this.panelCentreLoisirs.setVisible(true);

		} else if (e.getSource() == this.btQuitter) {

			int r = JOptionPane.showConfirmDialog(this, " Voulez vous quitter ?", "Quitter",
					JOptionPane.OK_CANCEL_OPTION);
			if (r == 0) {
				this.dispose();
			}

		}

	}
}
