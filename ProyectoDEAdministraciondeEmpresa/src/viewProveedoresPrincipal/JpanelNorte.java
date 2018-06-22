package viewProveedoresPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JpanelNorte extends JPanel {
	JButton jButton =  new JButton("hola");

	public JpanelNorte() {
		init();
	}

	private void init() {
		this.setLayout(new FlowLayout());
		this.setBackground(new Color(42, 106, 125));
		this.add(jButton);


	}

}
