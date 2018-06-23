package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameArticulosPrincipal extends JFrame {
	
	private JpanelNortePantallaPrincipal jpanelNorteAdministradorPrincipal;
	private  JpanelCenterArticulosPrincipla jpanelCenterArticulosPrincipla;
	private JpanelLeftPantallaPrincipal jpanelLeftAdministradorPrincipal;
	
	public JFrameArticulosPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorteAdministradorPrincipal = new JpanelNortePantallaPrincipal();
		this.jpanelCenterArticulosPrincipla = new JpanelCenterArticulosPrincipla();
		this.jpanelLeftAdministradorPrincipal = new JpanelLeftPantallaPrincipal();
		init();

	}

	private void init() {

		this.setResizable(true);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		this.add(jpanelNorteAdministradorPrincipal, BorderLayout.NORTH);
		this.add(jpanelCenterArticulosPrincipla, BorderLayout.CENTER);
		this.add(jpanelLeftAdministradorPrincipal, BorderLayout.WEST);


		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
