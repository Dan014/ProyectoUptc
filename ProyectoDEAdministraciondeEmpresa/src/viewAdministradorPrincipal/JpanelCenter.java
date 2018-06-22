package viewAdministradorPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JpanelCenter extends JPanel {
	JLabel jLabel;
	JPanel jPanelsd, jPanel2;
	JButton jButtonim, jButtonim2, jButtonim3, jButtonim4;
	ImageIcon imageIcon;
	Icon icon;

	public JpanelCenter() {
		init();
		
	}

	private void init() {
		this.setLayout(new GridLayout(2, 1));
		jPanelsd = new JPanel();
		jPanelsd.setBackground(new Color(42, 106, 125));

		jPanelsd.setLayout(new GridLayout(1, 4, 20, 0));

		
		
		jButtonim = new JButton();
		imageIcon = new ImageIcon("src/images/dinero.png");
		jButtonim.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(jButtonim.getWidth(), jButtonim.getHeight(),
				Image.SCALE_DEFAULT));
		jButtonim.setIcon(icon);
		jPanelsd.add(jButtonim);

		
		jButtonim2 = new JButton("dsds");
		jButtonim3 = new JButton("dsds");
		jButtonim4 = new JButton("dsds");
		jPanelsd.add(jButtonim2);
		jPanelsd.add(jButtonim3);
		jPanelsd.add(jButtonim4);

		jPanel2 = new JPanel();
		jPanel2.setBackground(new Color(42, 106, 125));

		jLabel =  new JLabel();
		jLabel.setBounds(0, 0, 200, 200);
		imageIcon = new ImageIcon("src/images/admin.png");
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(jLabel.getWidth(), jLabel.getHeight(),
				Image.SCALE_DEFAULT));
		jLabel.setIcon(icon);
	
		jPanel2.add(jLabel);
		
		
		
		

		this.add(jPanelsd);
		this.add(jPanel2);

	}

}
