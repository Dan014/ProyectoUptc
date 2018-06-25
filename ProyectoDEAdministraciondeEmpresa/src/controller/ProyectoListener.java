package controller;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JOptionPane;

import view.JFrameArticulosPrincipal;
import view.JFrameComprasPrincipal;
import view.JFrameEmpleadoPrincipal;
import view.JFramePantallaPrincipal;
import view.JFrameProveedoresPrincipal;
import view.JFrameVentasPrincipal;
import view.JpanelLeftPantallaPrincipal;
import view.JpanelNortePantallaPrincipal;

public class ProyectoListener implements ActionListener {
	private static ProyectoListener proyectoListener = null;
	private JpanelLeftPantallaPrincipal jpanelStatusBar;
	private JFramePantallaPrincipal jFramePantallaPrincipal;
	public static ProyectoListener getInstance() {

		if (proyectoListener == null) {
			proyectoListener = new ProyectoListener();

		}
		return proyectoListener;
	}

	public void setJpanelStatusBar(JpanelLeftPantallaPrincipal jpanelStatusBar) {

		this.jpanelStatusBar = jpanelStatusBar;
	}
	
//	
//	public void setjFramePantallaPrincipal(JFramePantallaPrincipal jFramePantallaPrincipal) {
//
//		this.jFramePantallaPrincipal = jFramePantallaPrincipal;
//	}
//	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand().valueOf(e.getActionCommand())) {
		case "HOME":
			boton1();
			break;
		case "ARTICULOS":
			boton2();
			break;
		case "COMPRAS":
			boton3();
			break;
		case "VENTAS":
			boton4();
			break;
		case "PROVEEDORES":
			boton5();
			break;
		case "EMPLEADOS":
			boton6();
			break;
		case "PAGOS":
			boton7();
			break;
		default:
			break;
		}
	}

	private void boton1() {
		System.out.println("Usted ha presionado el Boton 1");
		JFramePantallaPrincipal jFramePantallaPrincipal = new JFramePantallaPrincipal();
		jFramePantallaPrincipal.setBounds(0, 0, 600, 360);
		jFramePantallaPrincipal.setResizable(false);
		jFramePantallaPrincipal.setLocationRelativeTo(null);

	}

	private void boton2() {
		System.out.println("Usted ha presionado el Boton 2");
		JFrameArticulosPrincipal jFrameArticulosPrincipal =  new JFrameArticulosPrincipal();
		jFrameArticulosPrincipal.setBounds(0, 0, 600, 360);
		jFrameArticulosPrincipal.setResizable(false);
		jFrameArticulosPrincipal.setLocationRelativeTo(null);
		jFrameArticulosPrincipal.setVisible(true);

		
	}

	private void boton3() {
		System.out.println("Usted ha presionado el Boton 3");
		JFrameComprasPrincipal jFrameComprasPrincipal = new JFrameComprasPrincipal();
		JFramePantallaPrincipal jFramePantallaPrincipal = new JFramePantallaPrincipal();
		jFrameComprasPrincipal.setBounds(0, 0, 600, 360);
		jFrameComprasPrincipal.setResizable(false);
		jFrameComprasPrincipal.setLocationRelativeTo(null);
		jFrameComprasPrincipal.setVisible(true);
		jFramePantallaPrincipal.dispose();
	}

	private void boton4() {
		System.out.println("Usted ha presionado el Boton 4");

		JFrameVentasPrincipal jFrameVentasPrincipal = new JFrameVentasPrincipal();
		JFramePantallaPrincipal jFramePantallaPrincipal = new JFramePantallaPrincipal();

		jFrameVentasPrincipal.setBounds(0, 0, 600, 360);
		jFrameVentasPrincipal.setVisible(true);
		jFrameVentasPrincipal.setResizable(false);
		jFrameVentasPrincipal.setLocationRelativeTo(null);
		jFramePantallaPrincipal.dispose();

	}

	private void boton5() {
		System.out.println("Usted ha presionado el Boton 5");
		JFrameProveedoresPrincipal jFrameProveedoresPrincipal = new JFrameProveedoresPrincipal();
		JFramePantallaPrincipal jFramePantallaPrincipal = new JFramePantallaPrincipal();

		jFrameProveedoresPrincipal.setBounds(0, 0, 600, 360);
		jFrameProveedoresPrincipal.setVisible(true);
		jFrameProveedoresPrincipal.setResizable(false);
		jFrameProveedoresPrincipal.setLocationRelativeTo(null);
		jFramePantallaPrincipal.dispose();

	}

	private void boton6() {
		System.out.println("Usted ha presionado el Boton 6");

		JFrameEmpleadoPrincipal jFrameEmpleadoPrincipal = new JFrameEmpleadoPrincipal();
		JFramePantallaPrincipal jFramePantallaPrincipal = new JFramePantallaPrincipal();

		jFrameEmpleadoPrincipal.setBounds(0, 0, 600, 360);
		jFrameEmpleadoPrincipal.setVisible(true);
		jFrameEmpleadoPrincipal.setResizable(false);
		jFrameEmpleadoPrincipal.setLocationRelativeTo(null);
		jFramePantallaPrincipal.dispose();

	}

	private void boton7() {
		System.out.println("Usted ha presionado el Boton 7");

		JFrameEmpleadoPrincipal jFrameEmpleadoPrincipal = new JFrameEmpleadoPrincipal();
		JFramePantallaPrincipal jFramePantallaPrincipal = new JFramePantallaPrincipal();

		jFrameEmpleadoPrincipal.setBounds(0, 0, 600, 360);
		jFrameEmpleadoPrincipal.setVisible(true);
		jFrameEmpleadoPrincipal.setResizable(false);
		jFrameEmpleadoPrincipal.setLocationRelativeTo(null);
		jFramePantallaPrincipal.dispose();


	}

}
