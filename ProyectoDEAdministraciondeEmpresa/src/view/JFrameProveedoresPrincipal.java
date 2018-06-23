package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameProveedoresPrincipal extends JFrame {
	
	private JpanelNortePantallaPrincipal jpanelNorte;
	private JpanelCenterProveedoresPrincipal jpanelCenter;
	private JpanelLeftPantallaPrincipal jpanelLeft;
	
	public JFrameProveedoresPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNortePantallaPrincipal();
		this.jpanelCenter = new JpanelCenterProveedoresPrincipal();
		this.jpanelLeft =  new JpanelLeftPantallaPrincipal();
		init();

	}

	private void init() {

		this.setResizable(true);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		this.add(jpanelNorte, BorderLayout.NORTH);
		this.add(jpanelCenter, BorderLayout.CENTER);
		this.add(jpanelLeft, BorderLayout.WEST);


		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
