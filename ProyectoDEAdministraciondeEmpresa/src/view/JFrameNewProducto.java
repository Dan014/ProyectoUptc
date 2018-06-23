package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameNewProducto extends JFrame {
	JpanelCenterNewProducto centerProducto;
	JpanelNorteNewProducto jpanelNorte;
	JButton jButton;
	JLabel jLabel, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
	JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;

	public JFrameNewProducto() {
		super(Constant.APP_NAME);
		centerProducto = new JpanelCenterNewProducto();
		jpanelNorte =  new JpanelNorteNewProducto();
		init();

	}

	private void init() {

		this.setResizable(false);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width / 2, height / 2);
		this.setLocationRelativeTo(null);
		
		this.add(jpanelNorte, BorderLayout.NORTH);
		this.add(centerProducto, BorderLayout.CENTER);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
