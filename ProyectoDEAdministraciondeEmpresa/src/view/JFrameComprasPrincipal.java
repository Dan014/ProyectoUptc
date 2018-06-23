package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameComprasPrincipal extends JFrame {
	
	private JpanelNortePantallaPrincipal jpanelNorte;
	private JpanelCenterComprasPrincipal jpanelCenter;
	private JpanelLeftPantallaPrincipal jpanelLeft;
	
	public JFrameComprasPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNortePantallaPrincipal();
		this.jpanelCenter = new JpanelCenterComprasPrincipal();
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
