package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import controller.ControlArticulos;
import model.ModelArticulos;



public class JFrameArticulosPrincipal extends JFrame implements ActionListener {
	

	
	private JpanelNortePantallaPrincipal jpanelNorteAdministradorPrincipal;
	private  JpanelCenterArticulosPrincipla jpanelCenterArticulosPrincipla;
	private JpanelLeftPantallaPrincipal jpanelLeftAdministradorPrincipal;
	private JMeuBarPantallaPrincipal jMeuBarPantallaPrincipal;

	
	public JFrameArticulosPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorteAdministradorPrincipal = new JpanelNortePantallaPrincipal();
		this.jpanelCenterArticulosPrincipla = new JpanelCenterArticulosPrincipla();
		this.jpanelLeftAdministradorPrincipal = new JpanelLeftPantallaPrincipal();
		this.jMeuBarPantallaPrincipal =  new JMeuBarPantallaPrincipal();

		init();

	}

	private void init() {

		this.setResizable(true);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setJMenuBar(jMeuBarPantallaPrincipal);

		this.add(jpanelNorteAdministradorPrincipal, BorderLayout.NORTH);
		this.add(jpanelCenterArticulosPrincipla, BorderLayout.CENTER);
		this.add(jpanelLeftAdministradorPrincipal, BorderLayout.WEST);		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
