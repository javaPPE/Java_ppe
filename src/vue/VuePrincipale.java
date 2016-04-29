// La VuePrincipale permet d'afficher ce que l'on édite dans VueProfil

package vue;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VuePrincipale extends JFrame implements ActionListener {

	private JFrame FenetrePrincipal = new JFrame();
	private JPanel panelMenu = new JPanel();

	// permet d'avoir une image en background du panel profil
	private JPanel panelProfil = new JPanel()

	{
		Image img = new ImageIcon("image/Background.png").getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	};

	// permet d'avoir une image en background du panel cantine

	private JPanel panelCantine = new JPanel() {
		Image img = new ImageIcon("image/Background.png").getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	};

	// permet d'avoir une image en background du panel centre de loisir

	private JPanel panelCentreLoisirs = new JPanel() {
		Image img = new ImageIcon("image/Background.png").getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	};

	// construction des boutons

	private JButton btProfil = new JButton("Profil");
	private JButton btCantine = new JButton("Cantine");
	private JButton btCentreLoisir = new JButton(
			"<HTML><BODY><CENTER>Centre<BR>de" + "<BR>loisirs</CENTER></BODY></HTML>");
	private JButton btQuitter = new JButton("quitter");

	// construction des objets du panel Profil

	private JTextField tfNom = new JTextField();
	private JTextField tfPrenom = new JTextField();
	private JComboBox cbxAge = new JComboBox();
	private JTextField tfTel = new JTextField();
	private JComboBox cbxNbrEnfant = new JComboBox();
	private JTextField tfAdresse = new JTextField();
	private JButton btAnnuler = new JButton("annuler");
	private JButton btValider = new JButton("enregistrer");

	// construction des objets du panel Cantine

	private JComboBox cbxDate = new JComboBox();
	private JComboBox cbxTarif = new JComboBox();
	private JComboBox cbxNbrEnfants = new JComboBox();
	private JTextField tfEtablissement = new JTextField();
	private JButton btAnnulerC = new JButton("annuler");
	private JButton btValiderC = new JButton("Valider");

	// construction des objets du panel CentreLoisirs

	private JComboBox cbxDateCL = new JComboBox();
	private JComboBox cbxTarifCL = new JComboBox();
	private JTextField tfNbrEnfantsCL = new JTextField();
	private JTextField tfEtablissementCL = new JTextField();
	private JTextField tfRegion = new JTextField();
	private JTextField tfCapacite = new JTextField();
	private JButton btAnnulerCL = new JButton("annuler");
	private JButton btValiderCL = new JButton("Valider");

	public VuePrincipale() {
		super();

		// construction de la fenetre

		this.FenetrePrincipal.setTitle("Profil utilisateur");
		this.FenetrePrincipal.setBounds(200, 200, 700, 500);
		this.FenetrePrincipal.setResizable(false); // permet de modifier la
													// hauteur et largeur
		// (petit carré)
		this.FenetrePrincipal.setLayout(null);
		this.FenetrePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // croix
																				// rouge
		this.FenetrePrincipal.setLocationRelativeTo(this.getParent()); // centre
																		// la
																		// fenetre
		JLabel uneImage = new JLabel(new ImageIcon("image/banniere.png"));// banniere
																			// de
																			// la
																			// fenetre
		uneImage.setBounds(0, 0, 700, 88);
		this.FenetrePrincipal.add(uneImage);
		this.FenetrePrincipal.setVisible(true);

		// construction du panel menu
		this.panelMenu.setBounds(10, 120, 100, 600);
		this.panelMenu.setLayout(new GridLayout(8, 1));

		this.panelMenu.add(this.btProfil);
		this.panelMenu.add(this.btCantine);
		this.panelMenu.add(this.btCentreLoisir);
		this.panelMenu.add(this.btQuitter);

		this.FenetrePrincipal.add(this.panelMenu);
		this.panelMenu.setVisible(true);

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
		this.btValiderC.addActionListener(this);
		this.btAnnulerC.addActionListener(this);

		// bouton cliquable du panel CentreLoisirs

		this.btValiderCL.addActionListener(this);
		this.btAnnulerCL.addActionListener(this);

		// ___________________________________________________________//

		// construction du panel Profil

		this.panelProfil.setBounds(140, 100, 500, 340);
		this.panelProfil.setLayout(new GridLayout(8, 2));

		this.panelProfil.add(new JLabel("Nom :"));
		this.panelProfil.add(this.tfNom);

		this.panelProfil.add(new JLabel("Prenom :"));
		this.panelProfil.add(this.tfPrenom);

		this.panelProfil.add(new JLabel("Age :"));
		this.panelProfil.add(this.cbxAge);

		this.panelProfil.add(new JLabel("Tel :"));
		this.panelProfil.add(this.tfTel);

		this.panelProfil.add(new JLabel("Nombre d'enfant"));
		this.panelProfil.add(this.cbxNbrEnfant);

		this.panelProfil.add(new JLabel("Adresse :"));
		this.panelProfil.add(this.tfAdresse);

		this.panelProfil.add(new JLabel(""));
		this.panelProfil.add(new JLabel(""));

		this.panelProfil.add(this.btValider);
		this.panelProfil.add(this.btAnnuler);

		this.panelProfil.setVisible(false);
		this.FenetrePrincipal.add(this.panelProfil);

		// construction du panel Cantine
		this.panelCantine.setBounds(140, 100, 500, 340);
		this.panelCantine.setLayout(new GridLayout(6, 2));

		this.panelCantine.add(new JLabel("Date :"));
		this.panelCantine.add(this.cbxDate);

		this.panelCantine.add(new JLabel("Tarif :"));
		this.panelCantine.add(this.cbxTarif);

		this.panelCantine.add(new JLabel("Nombre d'enfants :"));
		this.panelCantine.add(this.cbxNbrEnfants);

		this.panelCantine.add(new JLabel("Etablissement :"));
		this.panelCantine.add(this.tfEtablissement);

		this.panelCantine.add(new JLabel(""));
		this.panelCantine.add(new JLabel(""));

		this.panelCantine.add(this.btValiderC);
		this.panelCantine.add(this.btAnnulerC);

		this.panelCantine.setVisible(false);
		this.FenetrePrincipal.add(this.panelCantine);

		// construction du panel CentreLoisirs
		this.panelCentreLoisirs.setBounds(140, 100, 500, 340);

		this.panelCentreLoisirs.setLayout(new GridLayout(8, 2));
		this.panelCentreLoisirs.add(new JLabel("Etablissement :"));
		this.panelCentreLoisirs.add(this.tfEtablissementCL);

		this.panelCentreLoisirs.add(new JLabel("Date :"));
		this.panelCentreLoisirs.add(this.cbxDateCL);

		this.panelCentreLoisirs.add(new JLabel("Nombre d'enfants :"));
		this.panelCentreLoisirs.add(this.tfNbrEnfantsCL);

		this.panelCentreLoisirs.add(new JLabel("Capacite :"));
		this.panelCentreLoisirs.add(this.tfCapacite);

		this.panelCentreLoisirs.add(new JLabel("Region :"));
		this.panelCentreLoisirs.add(this.tfRegion);

		this.panelCentreLoisirs.add(new JLabel("Tarif :"));
		this.panelCentreLoisirs.add(this.cbxTarifCL);

		this.panelCentreLoisirs.add(new JLabel(""));
		this.panelCentreLoisirs.add(new JLabel(""));

		this.panelCentreLoisirs.add(this.btValiderCL);
		this.panelCentreLoisirs.add(this.btAnnulerCL);

		this.panelCentreLoisirs.setVisible(false);
		this.FenetrePrincipal.add(this.panelCentreLoisirs);

	}

	// permet que quand on clique sur un bouton pour ouvrir un panel l'autre se
	// ferme
	// et ainsi de suite

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
		}

		// permet de faire marcher le bouton annuler dans Profil (efface le
		// contenu)
		else if (e.getSource() == this.btAnnuler) {
			this.tfNom.setText("");
			this.tfPrenom.setText("");
			this.tfTel.setText("");
			this.tfAdresse.setText("");

		}

		// permet de faire marcher le bouton annuler dans Cantine (efface le
		// contenu)
		else if (e.getSource() == this.btAnnulerC) {
			this.tfEtablissement.setText("");

		}

		// permet de faire marcher le bouton annuler dans Centre de loisirs
		// (efface le
		// contenu)
		else if (e.getSource() == this.btAnnulerCL) {
			this.tfNbrEnfantsCL.setText("");
			this.tfEtablissementCL.setText("");
			this.tfRegion.setText("");
			this.tfCapacite.setText("");

		}

		// permet de faire marcher le bouton quitter
		else if (e.getSource() == this.btQuitter) {

			int r = JOptionPane.showConfirmDialog(this, " Voulez vous quitter ?", "Quitter",
					JOptionPane.OK_CANCEL_OPTION);
			if (r == 0) {
				this.FenetrePrincipal.dispose();
			}

		}

	}
}
