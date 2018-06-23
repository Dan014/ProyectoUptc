package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameArticulosPrincipal extends JFrame {
	
	private JpanelNorteAdministradorPrincipal jpanelNorteAdministradorPrincipal;
	private  JpanelCenterArticulosPrincipla jpanelCenterArticulosPrincipla;
	private JpanelLeftAdministradorPrincipal jpanelLeftAdministradorPrincipal;
	
	public JFrameArticulosPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorteAdministradorPrincipal = new JpanelNorteAdministradorPrincipal();
		this.jpanelCenterArticulosPrincipla = new JpanelCenterArticulosPrincipla();
		this.jpanelLeftAdministradorPrincipal = new JpanelLeftAdministradorPrincipal();
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
