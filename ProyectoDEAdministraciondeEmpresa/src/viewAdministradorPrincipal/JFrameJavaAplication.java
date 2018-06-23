package viewAdministradorPrincipal;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameJavaAplication extends JFrame {
	
	private JpanelNorteAdministradorPrincipal jpanelNorte;
	private JpanelCenterAdoministradorPrincipal jpanelCenter;
	private JpanelLeftAdministradorPrincipal jpanelLeft;
	
	public JFrameJavaAplication() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNorteAdministradorPrincipal();
		this.jpanelCenter = new JpanelCenterAdoministradorPrincipal();
		this.jpanelLeft =  new JpanelLeftAdministradorPrincipal();
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
