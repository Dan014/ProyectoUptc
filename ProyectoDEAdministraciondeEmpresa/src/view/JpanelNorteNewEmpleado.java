package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JpanelNorteNewEmpleado extends JPanel {
	JLabel jLabel = new JLabel("Empleado Nuevo ");

	public JpanelNorteNewEmpleado() {
		init();
	}

	private void init() {
		this.setLayout(new FlowLayout());
		this.setBackground(new Color(42, 106, 125));
		jLabel.setForeground(new java.awt.Color(255, 255, 255));

		this.add(jLabel);

	}

}
