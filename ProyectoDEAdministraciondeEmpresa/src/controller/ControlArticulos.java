package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.ModelArticulos;

public class ControlArticulos {

	Vector vectorprincipal = new Vector();

	/**
	 * Guardar Datos en un vector
	 * 
	 * @param modelArticulos
	 */
	public void save(ModelArticulos modelArticulos) {
		vectorprincipal.addElement(modelArticulos);

	}

	/**
	 * Guardar Fatos en un archivo txt
	 * 
	 * @param modelArticulos
	 */
	public void saveinTxt(ModelArticulos modelArticulos) {
		try {
			FileWriter fileWriter = new FileWriter("Articulos.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			printWriter.println("|"+modelArticulos.getCodigo());
			printWriter.print("|"+modelArticulos.getName());
			printWriter.println("|"+modelArticulos.getPreciocompra());
			printWriter.println("|"+modelArticulos.getPrecioventa());
			printWriter.println("|"+modelArticulos.getStock());
			printWriter.println("|"+modelArticulos.getStockminimo());
			printWriter.print("|"+modelArticulos.getTipodeproducto());
			printWriter.print("|"+modelArticulos.getMarca());
			printWriter.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public DefaultTableModel listArticles() {

		Vector<String> cabeceras = new Vector<String>();
		cabeceras.addElement("CODIGO");
		cabeceras.addElement("NOMBRE");
		cabeceras.addElement("PREDCIO DE COMPRA");
		cabeceras.addElement("PRECIO DE VENTA");
		cabeceras.addElement("STOCK");
		cabeceras.addElement("STOCK MINIMO");
		cabeceras.addElement("TIPO DE PRODUCTO");
		cabeceras.addElement("MARCA");

		DefaultTableModel defaultTableModel = new DefaultTableModel(cabeceras, 0);

		try {
			FileReader fileReader = new FileReader("Articulos.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String d;
			while ((d = bufferedReader.readLine())!= null) {
				StringTokenizer dato = new StringTokenizer(d, "|");
				Vector x = new Vector();
				while (dato.hasMoreTokens()) {
					x.addElement(dato.nextToken());
				}
				defaultTableModel.addRow(x);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		return defaultTableModel;

	}


}
