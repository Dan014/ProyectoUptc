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

import view.JpanelLeftPantallaPrincipal;

public class ProyectoListener implements ActionListener {
	private static ProyectoListener proyectoListener = null;
	private JpanelLeftPantallaPrincipal jpanelStatusBar;

	public static ProyectoListener getInstance() {

		if (proyectoListener == null) {
			proyectoListener = new ProyectoListener();

		}
		return proyectoListener;
	}

	public void setJpanelStatusBar(JpanelLeftPantallaPrincipal jpanelStatusBar) {

		this.jpanelStatusBar = jpanelStatusBar;
	}
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
	}

	private void boton2() {
		System.out.println("Usted ha presionado el Boton 2");
	}

	private void boton3() {
		System.out.println("Usted ha presionado el Boton 3");
	}

	private void boton4() {
		System.out.println("Usted ha presionado el Boton 4");
	}

	private void boton5() {
		System.out.println("Usted ha presionado el Boton 5");
	}

	private void boton6() {
		System.out.println("Usted ha presionado el Boton 6");
	}
	
	private void boton7() {
		System.out.println("Usted ha presionado el Boton 7");
		
	}


}
