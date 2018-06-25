package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameVentasPrincipal extends JFrame {
	
	private JpanelNortePantallaPrincipal jpanelNorte;
	private JpanelCenterVentasPrincipal jpanelCenter;
	private JpanelLeftPantallaPrincipal jpanelLeft;
	private JMeuBarPantallaPrincipal jMeuBarPantallaPrincipal;

	
	public JFrameVentasPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNortePantallaPrincipal();
		this.jpanelCenter = new JpanelCenterVentasPrincipal();
		this.jpanelLeft =  new JpanelLeftPantallaPrincipal();
		this.jMeuBarPantallaPrincipal =  new JMeuBarPantallaPrincipal();

		init();

	}

	private void init() {

		this.setResizable(true);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setJMenuBar(jMeuBarPantallaPrincipal);
		this.add(jpanelNorte, BorderLayout.NORTH);
		this.add(jpanelCenter, BorderLayout.CENTER);
		this.add(jpanelLeft, BorderLayout.WEST);


		
		
		
		this.setVisible(true);
	}

}
