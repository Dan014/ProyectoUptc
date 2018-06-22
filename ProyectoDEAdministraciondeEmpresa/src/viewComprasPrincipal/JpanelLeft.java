package viewComprasPrincipal;

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

public class JpanelLeft extends JPanel {
	JButton jButton, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8;
	ImageIcon imageIcon;
	Icon icon;

	public JpanelLeft() {
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(8, 1));
		setPreferredSize(new Dimension(300, 0));

		// this.setBackground(Color.red);
		jButton = new JButton("HOME");
		jButton.setBackground(new Color(2, 41, 48));
		jButton.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/HOME.png");
		jButton.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton.setIcon(icon);

		jButton2 = new JButton("ARTICULOS");
		jButton2.setBackground(new Color(2, 41, 48));
		jButton2.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/articulos.png");
		jButton2.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton2.setIcon(icon);
		
		
		jButton3 = new JButton("VENTAS");
		jButton3.setBackground(new Color(2, 41, 48));
		jButton3.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/VENTA.png");
		jButton3.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton3.setIcon(icon);
		
		
		jButton4 = new JButton("COMPRAS");
		jButton4.setBackground(new Color(2, 41, 48));
		jButton4.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/COMPRA.png");
		jButton4.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton4.setIcon(icon);
		
		
		jButton5 = new JButton("CLIENTES");
		jButton5.setBackground(new Color(2, 41, 48));
		jButton5.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/CLIENTES.png");
		jButton5.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton5.setIcon(icon);
		
		
		jButton6 = new JButton("PROVEEDORES");
		jButton6.setBackground(new Color(2, 41, 48));
		jButton6.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/PROVEEDORES.png");
		jButton6.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton6.setIcon(icon);
		
		
		jButton7 = new JButton("PAGOS");
		jButton7.setBackground(new Color(2, 41, 48));
		jButton7.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/PAGOS.png");
		jButton7.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton7.setIcon(icon);
		
		jButton8 = new JButton("CONFIGURACIONES");
		jButton8.setBackground(new Color(2, 41, 48));
		jButton8.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon("src/images/CONFI.png");
		jButton8.setBounds(0, 0, 200, 200);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		jButton8.setIcon(icon);

		this.add(jButton);
		this.add(jButton2);
		this.add(jButton3);
		this.add(jButton4);
		this.add(jButton5);
		this.add(jButton6);
		this.add(jButton7);
		this.add(jButton8);

	}

}
