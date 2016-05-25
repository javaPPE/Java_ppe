package vue;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import modele.ModeleUser;

public class Connexion extends JFrame implements ActionListener, KeyListener {

	private JFrame FenetreConnexion = new JFrame();

	// permet d'avoir une image en background du panel connexion
	private JPanel unPanel = new JPanel()

	{
		Image img = new ImageIcon("image/Background.png").getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	};

	// construction des objets du panel
	private JTextField tfLogin = new JTextField();
	private JPasswordField tfMdp = new JPasswordField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btValider = new JButton("Valider");

	public Connexion() {
		// fenetre connexion
		this.FenetreConnexion.setBounds(200, 200, 400, 200);
		this.FenetreConnexion.setTitle("Connexion au profil utilisateur");
		this.FenetreConnexion.setResizable(false);
		this.FenetreConnexion.setLayout(null);
		this.FenetreConnexion.setVisible(true);

		// placement des objets dans le panel
		this.unPanel.setBounds(0, 0, 400, 198);
		this.unPanel.setLayout(new GridLayout(6, 2));

		this.unPanel.add(new JLabel(""));
		this.unPanel.add(new JLabel(""));

		Component Login = this.unPanel.add(new JLabel("Login : "));
		this.unPanel.add(this.tfLogin);

		Component Mdp = this.unPanel.add(new JLabel("Mot de passe : "));
		this.unPanel.add(this.tfMdp);

		this.unPanel.add(new JLabel(""));
		this.unPanel.add(new JLabel(""));

		Component Annuler = this.unPanel.add(this.btAnnuler);
		Component Valider = this.unPanel.add(this.btValider);

		// gère la police, taille...
		Font login = new Font("Arial", Font.BOLD, 18);
		Login.setFont(login);

		Font mdp = new Font("Arial", Font.BOLD, 18);
		Mdp.setFont(mdp);

		Font annuler = new Font("Arial", Font.BOLD, 15);
		Annuler.setFont(annuler);

		Font valider = new Font("Arial", Font.BOLD, 15);
		Valider.setFont(valider);

		this.unPanel.setVisible(true);
		this.FenetreConnexion.add(this.unPanel);

		// rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btValider.addActionListener(this);

		// rend les boutons cliquables avec le bouton entrer
		this.tfMdp.addKeyListener(this);
		this.tfLogin.addKeyListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler) {
			this.tfLogin.setText("");
			this.tfMdp.setText("");
		} else if (e.getSource() == this.btValider) {
			String login = this.tfLogin.getText();
			String mdp = new String(this.tfMdp.getPassword()); // recup le mdp

			if (login.equals("") || mdp.equals("")) {
				JOptionPane.showMessageDialog(this, "veuillez remplir l'id ou le mot de passe", "Attention",
						JOptionPane.OK_OPTION);
			} else {
				// test de connexion
				String tab[] = ModeleUser.selectWhere(login, mdp);
				if (tab[0] == null) {
					JOptionPane.showMessageDialog(null, "Impossible de se connecter", "Erreur",
							JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Bonjour " + tab[0] + " ", " Bienvenue",
							JOptionPane.INFORMATION_MESSAGE);
					// destruction de l'interface connexion
					this.FenetreConnexion.dispose();
					// lancement du menu
					new VuePrincipale();

				}

			}

		}
	}

	// rend le bouton entrer possible
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			String login = this.tfLogin.getText();
			String mdp = new String(this.tfMdp.getPassword()); // recup le mdp
			if (login.equals("") || mdp.equals("")) {
				JOptionPane.showMessageDialog(this, "veuillez remplir l'id ou le mot de passe", "Attention",
						JOptionPane.OK_OPTION);
			} else {
				// test de connexion
				String tab[] = ModeleUser.selectWhere(login, mdp);
				if (tab[0] == null) {
					JOptionPane.showMessageDialog(null, "Impossible de se connecter", "Erreur",
							JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Bonjour" + tab[0], "Bienvenue",
							JOptionPane.INFORMATION_MESSAGE);
					// destruction de l'interface connexion
					this.FenetreConnexion.dispose();
					// lancement du menu
					new VuePrincipale();

				}
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
