// La VuePrincipale permet d'afficher ce que l'on édite dans VueProfil

package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VuePrincipale extends JFrame implements ActionListener {

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

	private JTextField tfDate = new JTextField();
	private JTextField tfTarif = new JTextField();
	private JTextField tfNbrEnfants = new JTextField();
	private JTextField tfEtablissement = new JTextField();
	private JButton btAnnulerC = new JButton("annuler");
	private JButton btValiderC = new JButton("Valider");

	// construction des objets du panel CentreLoisirs

	private JTextField tfDateCL = new JTextField();
	private JTextField tfTarifCL = new JTextField();
	private JTextField tfNbrEnfantsCL = new JTextField();
	private JTextField tfEtablissementCL = new JTextField();
	private JTextField tfRegion = new JTextField();
	private JTextField tfCapacite = new JTextField();
	private JButton btAnnulerCL = new JButton("annuler");
	private JButton btValiderCL = new JButton("Valider");

	public VuePrincipale() {
		super();

		this.setVisible(true);

		this.setTitle("Profil utilisateur");
		this.setBounds(200, 200, 700, 400);
		this.setResizable(false);
		this.setLayout(null);

		// construction du panel menu
		this.panelMenu.setBounds(10, 10, 100, 380);

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
		this.btValiderC.addActionListener(this);
		this.btAnnulerC.addActionListener(this);

		// bouton cliquable du panel CentreLoisirs

		this.btValiderCL.addActionListener(this);
		this.btAnnulerCL.addActionListener(this);

		// ___________________________________________________________//

		// construction du panel Profil

		this.panelProfil.setBounds(140, 10, 500, 340);

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

		this.panelCantine.setLayout(new GridLayout(9, 2));
		this.panelCantine.add(new JLabel("Date :"));
		this.panelCantine.add(this.tfDate);

		this.panelCantine.add(new JLabel("Tarif :"));
		this.panelCantine.add(this.tfTarif);

		this.panelCantine.add(new JLabel("Nombre d'enfants :"));
		this.panelCantine.add(this.tfNbrEnfants);

		this.panelCantine.add(new JLabel("Etablissement :"));
		this.panelCantine.add(this.tfEtablissement);

		this.panelCantine.add(new JLabel(""));
		this.panelCantine.add(new JLabel(""));

		this.panelCantine.add(this.btValiderC);
		this.panelCantine.add(this.btAnnulerC);

		this.panelCantine.setVisible(false);
		this.add(this.panelCantine);

		// construction du panel CentreLoisirs
		this.panelCentreLoisirs.setBounds(140, 10, 500, 340);

		this.panelCentreLoisirs.setLayout(new GridLayout(9, 2));
		this.panelCentreLoisirs.add(new JLabel("Etablissement :"));
		this.panelCentreLoisirs.add(this.tfEtablissementCL);

		this.panelCentreLoisirs.add(new JLabel("Date :"));
		this.panelCentreLoisirs.add(this.tfDateCL);

		this.panelCentreLoisirs.add(new JLabel("Nombre d'enfants :"));
		this.panelCentreLoisirs.add(this.tfNbrEnfantsCL);

		this.panelCentreLoisirs.add(new JLabel("Capacite :"));
		this.panelCentreLoisirs.add(this.tfCapacite);

		this.panelCentreLoisirs.add(new JLabel("Region :"));
		this.panelCentreLoisirs.add(this.tfRegion);

		this.panelCentreLoisirs.add(new JLabel("Tarif :"));
		this.panelCentreLoisirs.add(this.tfTarifCL);

		this.panelCentreLoisirs.add(new JLabel(""));
		this.panelCentreLoisirs.add(new JLabel(""));

		this.panelCentreLoisirs.add(this.btValiderCL);
		this.panelCentreLoisirs.add(this.btAnnulerCL);

		this.panelCentreLoisirs.setVisible(false);
		this.add(this.panelCentreLoisirs);

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
