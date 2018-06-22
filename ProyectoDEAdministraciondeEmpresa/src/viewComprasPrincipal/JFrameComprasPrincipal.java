package viewComprasPrincipal;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameComprasPrincipal extends JFrame {
	
	private JpanelNorte jpanelNorte;
	private JpanelCenter jpanelCenter;
	private JpanelLeft jpanelLeft;
	
	public JFrameComprasPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNorte();
		this.jpanelCenter = new JpanelCenter();
		this.jpanelLeft =  new JpanelLeft();
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
