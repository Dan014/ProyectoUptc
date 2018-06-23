package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.CommandAction;

public class JpanelLeftPantallaPrincipal extends JPanel {
	JButton jButton;
	ImageIcon imageIcon;
	Icon icon;

	public JpanelLeftPantallaPrincipal() {
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(7, 1));
		setPreferredSize(new Dimension(300, 0));
		this.add(myJButton(controller.CommandAction.boton1));
		this.add(myJButton(controller.CommandAction.boton2));
		this.add(myJButton(controller.CommandAction.boton3));
		this.add(myJButton(controller.CommandAction.boton4));
		this.add(myJButton(controller.CommandAction.boton5));
		this.add(myJButton(controller.CommandAction.boton6));
		this.add(myJButton(controller.CommandAction.boton7));


		

	}

	private JButton myJButton(CommandAction commandAction) {
	
		jButton = new JButton(commandAction.getCommandName());
		jButton.setBounds(0, 0, 200, 200);
		jButton.setBackground(new Color(2, 41, 48));
		jButton.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon(commandAction.getRutaImage());
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
		jButton.setIcon(icon);
		jButton.setToolTipText(commandAction.getToolTip());
		this.add(jButton);
		return jButton;
	}

}
