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



public class ProyectoListener implements  ActionListener {

	




	/**
	 * Metodo que escucha componentes
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand().valueOf(e.getActionCommand())) {
		case "boton1":
			boton1();
			break;
		case "boton2":
			boton2();
			break;
		case "boton3":
			boton3();
			break;
		case "boton4":
			boton4();
			break;
		case "boton5":
			boton5();
			break;
		case "boton6":
			boton6();
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



}
