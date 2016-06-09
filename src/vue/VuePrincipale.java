// La VuePrincipale permet d'afficher ce que l'on édite dans VueProfil

package vue;

import java.awt.Component;
import java.awt.Font;
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

import controleur.Profil;
import modele.ModeleUser;

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

	// permet d'avoir une image en background du panel Enfant

	private JPanel panelEnfant = new JPanel()

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
	private JButton btEnfant = new JButton("Enfant");
	private JButton btCantine = new JButton("Cantine");
	private JButton btCentreLoisir = new JButton(
			"<HTML><BODY><CENTER>Centre<BR>de" + "<BR>loisirs</CENTER></BODY></HTML>");
	private JButton btQuitter = new JButton("quitter");

	// construction des objets du panel Profil

	private JTextField tfNom = new JTextField();
	private JTextField tfPrenom = new JTextField();
	private JTextField tfDateNaiss = new JTextField();
	private JTextField tfTel = new JTextField();
	private JTextField tfAdresse = new JTextField();
	private JTextField tfCP = new JTextField();
	private JTextField tfVille = new JTextField();
	private JTextField tfEmail = new JTextField();
	private JTextField tfSexeP = new JTextField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btValider = new JButton("Valider");

	// construction des objets du panel Enfant

	private JTextField tfNomE = new JTextField();
	private JTextField tfPrenomE = new JTextField();
	private JTextField tfDate = new JTextField();
	private JTextField tfSexe = new JTextField();
	private JButton btAnnulerE = new JButton("Annuler");
	private JButton btValiderE = new JButton("Valider");

	// construction des objets du panel Cantine

	private JComboBox cbxDateDebC = new JComboBox();
	private JComboBox cbxDateFinC = new JComboBox();
	private JComboBox cbxNbrEnfantsC = new JComboBox();
	private JComboBox cbxEtabC = new JComboBox();
	private JButton btAnnulerC = new JButton("Annuler");
	private JButton btValiderC = new JButton("Valider");

	// construction des objets du panel CentreLoisirs

	private JComboBox cbxDateDebCL = new JComboBox();
	private JComboBox cbxDateFinCL = new JComboBox();
	private JComboBox cbxTarifCL = new JComboBox();
	private JComboBox cbxCentreCL = new JComboBox();
	private JButton btAnnulerCL = new JButton("Annuler");
	private JButton btValiderCL = new JButton("Valider");

	public VuePrincipale(Profil unProfil) {
		super();

		// construction de la fenetre

		this.FenetrePrincipal.setTitle("Profil utilisateur");
		this.FenetrePrincipal.setBounds(200, 200, 800, 550);
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
		uneImage.setBounds(0, 0, 800, 101);
		this.FenetrePrincipal.add(uneImage);
		this.FenetrePrincipal.setVisible(true);

		// construction du panel menu
		this.panelMenu.setBounds(10, 120, 100, 600);
		this.panelMenu.setLayout(new GridLayout(8, 1));

		Component Profil = this.panelMenu.add(this.btProfil);
		Component Enfant = this.panelMenu.add(this.btEnfant);
		Component Cantine = this.panelMenu.add(this.btCantine);
		Component CentreLoisir = this.panelMenu.add(this.btCentreLoisir);
		Component Quitter = this.panelMenu.add(this.btQuitter);

		// gère la police, taille...
		Font profil = new Font("Arial", Font.BOLD, 15);
		Profil.setFont(profil);

		Font enfant = new Font("Arial", Font.BOLD, 15);
		Enfant.setFont(enfant);

		Font cantine = new Font("Arial", Font.BOLD, 15);
		Cantine.setFont(cantine);

		Font centreLoisir = new Font("Arial", Font.BOLD, 15);
		CentreLoisir.setFont(centreLoisir);

		Font quitter = new Font("Arial", Font.BOLD, 15);
		Quitter.setFont(quitter);

		this.FenetrePrincipal.add(this.panelMenu);
		this.panelMenu.setVisible(true);

		// ___________________________________________________________//

		// bouton cliquable du panel menu
		this.btProfil.addActionListener(this);
		this.btEnfant.addActionListener(this);
		this.btCantine.addActionListener(this);
		this.btCentreLoisir.addActionListener(this);
		this.btQuitter.addActionListener(this);

		// bouton cliquable du panel Profil
		this.btValider.addActionListener(this);
		this.btAnnuler.addActionListener(this);

		// bouton cliquable du panel Enfant
		this.btValiderE.addActionListener(this);
		this.btAnnulerE.addActionListener(this);

		// bouton cliquable du panel Cantine
		this.btValiderC.addActionListener(this);
		this.btAnnulerC.addActionListener(this);

		// bouton cliquable du panel CentreLoisirs

		this.btValiderCL.addActionListener(this);
		this.btAnnulerCL.addActionListener(this);

		// ___________________________________________________________//

		// construction du panel Profil

		this.panelProfil.setBounds(140, 110, 600, 340);
		this.panelProfil.setLayout(new GridLayout(11, 2));

		Component Nom = this.panelProfil.add(new JLabel("Nom :"));
		this.tfNom.setText(unProfil.getNom());
		this.panelProfil.add(this.tfNom);

		Component Prenom = this.panelProfil.add(new JLabel("Prenom :"));
		this.tfPrenom.setText(unProfil.getPrenom());
		this.panelProfil.add(this.tfPrenom);

		Component SexeP = this.panelProfil.add(new JLabel("Sexe :"));
		this.tfSexeP.setText(unProfil.getSexe());
		this.panelProfil.add(this.tfSexeP);

		Component DateNaiss = this.panelProfil.add(new JLabel("date de naissance :"));
		this.tfDateNaiss.setText(unProfil.getDatenaiss());
		this.panelProfil.add(this.tfDateNaiss);

		Component Tel = this.panelProfil.add(new JLabel("Tel :"));
		this.tfTel.setText(unProfil.getTel());
		this.panelProfil.add(this.tfTel);

		Component Adresse = this.panelProfil.add(new JLabel("Adresse :"));
		this.tfAdresse.setText(unProfil.getAdresse());
		this.panelProfil.add(this.tfAdresse);

		Component Ville = this.panelProfil.add(new JLabel("Ville :"));
		this.tfVille.setText(unProfil.getVille());
		this.panelProfil.add(this.tfVille);

		Component CP = this.panelProfil.add(new JLabel("Code Postal :"));
		this.tfCP.setText(unProfil.getCp());
		this.panelProfil.add(this.tfCP);

		Component Email = this.panelProfil.add(new JLabel("Email :"));
		this.tfEmail.setText(unProfil.getEmail());
		this.panelProfil.add(this.tfEmail);
		this.tfEmail.setEditable(false);

		this.panelProfil.add(new JLabel(""));
		this.panelProfil.add(new JLabel(""));

		Component Valider = this.panelProfil.add(this.btValider);
		Component Annuler = this.panelProfil.add(this.btAnnuler);

		// gère la police, taille...
		Font nom = new Font("Arial", Font.BOLD, 18);
		Nom.setFont(nom);

		Font prenom = new Font("Arial", Font.BOLD, 18);
		Prenom.setFont(prenom);

		Font sexe = new Font("Arial", Font.BOLD, 18);
		SexeP.setFont(sexe);

		Font dateNaiss = new Font("Arial", Font.BOLD, 18);
		DateNaiss.setFont(dateNaiss);

		Font tel = new Font("Arial", Font.BOLD, 18);
		Tel.setFont(tel);

		Font adresse = new Font("Arial", Font.BOLD, 18);
		Adresse.setFont(adresse);

		Font ville = new Font("Arial", Font.BOLD, 18);
		Ville.setFont(ville);

		Font cp = new Font("Arial", Font.BOLD, 18);
		CP.setFont(cp);

		Font email = new Font("Arial", Font.BOLD, 18);
		Email.setFont(email);

		Font validerP = new Font("Arial", Font.BOLD, 15);
		Valider.setFont(validerP);

		Font annulerP = new Font("Arial", Font.BOLD, 15);
		Annuler.setFont(annulerP);

		this.panelProfil.setVisible(false);
		this.FenetrePrincipal.add(this.panelProfil);

		// construction du panel Enfant
		this.panelEnfant.setBounds(140, 110, 600, 340);
		this.panelEnfant.setLayout(new GridLayout(6, 2));

		Component NomE = this.panelEnfant.add(new JLabel("Nom :"));
		this.panelEnfant.add(this.tfNomE);

		Component PrenomE = this.panelEnfant.add(new JLabel("Prenom :"));
		this.panelEnfant.add(this.tfPrenomE);

		Component DateE = this.panelEnfant.add(new JLabel("Date :"));
		this.panelEnfant.add(this.tfDate);

		Component Sexe = this.panelEnfant.add(new JLabel("Sexe :"));
		this.panelEnfant.add(this.tfSexe);

		this.panelEnfant.add(new JLabel(""));
		this.panelEnfant.add(new JLabel(""));

		Component ValiderE = this.panelEnfant.add(this.btValiderE);
		Component AnnulerE = this.panelEnfant.add(this.btAnnulerE);

		// gère la police, taille...

		Font nomE = new Font("Arial", Font.BOLD, 18);
		NomE.setFont(nomE);

		Font prenomE = new Font("Arial", Font.BOLD, 18);
		PrenomE.setFont(prenomE);

		Font date = new Font("Arial", Font.BOLD, 18);
		DateE.setFont(date);

		Font sexeE = new Font("Arial", Font.BOLD, 18);
		Sexe.setFont(sexeE);

		Font validerE = new Font("Arial", Font.BOLD, 15);
		ValiderE.setFont(validerE);

		Font annulerE = new Font("Arial", Font.BOLD, 15);
		AnnulerE.setFont(annulerE);

		this.panelEnfant.setVisible(false);
		this.FenetrePrincipal.add(this.panelEnfant);

		// construction du panel Cantine
		this.panelCantine.setBounds(140, 110, 600, 340);
		this.panelCantine.setLayout(new GridLayout(6, 2));

		Component DateDeb = this.panelCantine.add(new JLabel("Date debut :"));
		this.panelCantine.add(this.cbxDateDebC);
		
		Component DateFin = this.panelCantine.add(new JLabel("Date fin :"));
		this.panelCantine.add(this.cbxDateFinC);

		Component NbenfantC = this.panelCantine.add(new JLabel("Nombre d'enfants :"));
		this.panelCantine.add(this.cbxNbrEnfantsC);

		Component Etab = this.panelCantine.add(new JLabel("Etablissement :"));
		this.panelCantine.add(this.cbxEtabC);

		this.panelCantine.add(new JLabel(""));
		this.panelCantine.add(new JLabel(""));

		Component ValiderC = this.panelCantine.add(this.btValiderC);
		Component AnnulerC = this.panelCantine.add(this.btAnnulerC);

		// gère la police, taille...
		Font dateDebC = new Font("Arial", Font.BOLD, 18);
		DateDeb.setFont(dateDebC);
		
		Font dateFinC = new Font("Arial", Font.BOLD, 18);
		DateFin.setFont(dateFinC);

		Font nbenfantC = new Font("Arial", Font.BOLD, 18);
		NbenfantC.setFont(nbenfantC);

		Font etab = new Font("Arial", Font.BOLD, 18);
		Etab.setFont(etab);

		Font validerC = new Font("Arial", Font.BOLD, 15);
		ValiderC.setFont(validerC);

		Font annulerC = new Font("Arial", Font.BOLD, 15);
		AnnulerC.setFont(annulerC);

		this.panelCantine.setVisible(false);
		this.FenetrePrincipal.add(this.panelCantine);

		// construction du panel CentreLoisirs
		this.panelCentreLoisirs.setBounds(140, 110, 600, 340);
		this.panelCentreLoisirs.setLayout(new GridLayout(5, 2));

		Component CentreCL = this.panelCentreLoisirs.add(new JLabel("Centre :"));
		this.panelCentreLoisirs.add(this.cbxCentreCL);

		Component DateDebCL = this.panelCentreLoisirs.add(new JLabel("Date début :"));
		this.panelCentreLoisirs.add(this.cbxDateDebCL);

		Component DateFinCL = this.panelCentreLoisirs.add(new JLabel("date fin :"));
		this.panelCentreLoisirs.add(this.cbxDateFinCL);

		this.panelCentreLoisirs.add(new JLabel(""));
		this.panelCentreLoisirs.add(new JLabel(""));

		Component ValiderCL = this.panelCentreLoisirs.add(this.btValiderCL);
		Component AnnulerCL = this.panelCentreLoisirs.add(this.btAnnulerCL);

		// gère la police, taille...
		Font centreCL = new Font("Arial", Font.BOLD, 18);
		CentreCL.setFont(centreCL);

		Font dateDebCL = new Font("Arial", Font.BOLD, 18);
		DateDebCL.setFont(dateDebCL);
		
		Font dateFinCL = new Font("Arial", Font.BOLD, 18);
		DateFinCL.setFont(dateFinCL);

		Font validerCL = new Font("Arial", Font.BOLD, 15);
		ValiderCL.setFont(validerCL);

		Font annulerCL = new Font("Arial", Font.BOLD, 15);
		AnnulerCL.setFont(annulerCL);

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
			this.panelEnfant.setVisible(false);
			this.panelCantine.setVisible(false);
			this.panelCentreLoisirs.setVisible(false);

		} else if (e.getSource() == this.btEnfant) {
			this.panelProfil.setVisible(false);
			this.panelEnfant.setVisible(true);
			this.panelCantine.setVisible(false);
			this.panelCentreLoisirs.setVisible(false);

		} else if (e.getSource() == this.btCantine) {
			this.panelProfil.setVisible(false);
			this.panelEnfant.setVisible(false);
			this.panelCantine.setVisible(true);
			this.panelCentreLoisirs.setVisible(false);

		} else if (e.getSource() == this.btCentreLoisir) {
			this.panelProfil.setVisible(false);
			this.panelEnfant.setVisible(false);
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
			this.tfCP.setText("");
			this.tfVille.setText("");
			this.tfEmail.setText("");
			this.tfSexeP.setText("");
			this.tfDateNaiss.setText("");

		} else if (e.getSource() == this.btValider) {
			String nom = this.tfNom.getText();
			String prenom = tfPrenom.getText();
			String datenaiss = tfDateNaiss.getText();
			String sexe = tfSexeP.getText();
			String adresse = tfAdresse.getText();
			String cp = tfCP.getText();
			String ville = tfVille.getText();
			String tel = tfTel.getText();
			String email = tfEmail.getText();

			Profil unProfil = new Profil(nom, prenom, adresse, sexe, ville, email, datenaiss, tel, cp);

			ModeleUser.update(unProfil);

		}

		// permet de faire marcher le bouton annuler dans Enfant (efface le
		// contenu)
		else if (e.getSource() == this.btAnnulerE) {
			this.tfNomE.setText("");
			this.tfPrenomE.setText("");
			this.tfDate.setText("");
			this.tfSexe.setText("");

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
