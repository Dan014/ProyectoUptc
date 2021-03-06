package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.ControlArticulos;
import model.ModelArticulos;

public class JpanelCenterNewProducto extends JPanel implements ActionListener {

	ModelArticulos modelArticulos = new ModelArticulos();
	ControlArticulos controlArticulos = new ControlArticulos();
	JButton jButton;
	DefaultTableModel defaultTableModel;
	JLabel jLabel, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
	JTextField codigo, preciocompra, stock, name, precioventa, stockminimo, marca;
	JComboBox categoria;

	public JpanelCenterNewProducto() {

		init();

	}

	private void init() {

		this.setLayout(null);

		jLabel = new JLabel("Codigo");
		jLabel.setBounds(20, 10, 200, 25);
		jLabel.setFont(new Font("Andale Mono", 3, 15));
		jLabel.setForeground(new Color(23, 4, 255));
		jLabel.setBackground(Color.BLUE);
		add(jLabel);

		codigo = new JTextField();
		codigo.setBounds(20, 40, 200, 25);
		codigo.setBackground(new java.awt.Color(224, 224, 224));
		codigo.setFont(new java.awt.Font("Andale Mono", 1, 14));
		codigo.setForeground(new java.awt.Color(255, 0, 0));
		add(codigo);

		jLabel2 = new JLabel("Precio de compra");
		jLabel2.setBounds(20, 85, 200, 25);
		jLabel2.setFont(new Font("Andale Mono", 3, 15));
		jLabel2.setForeground(new Color(23, 4, 255));
		jLabel2.setBackground(Color.BLUE);
		add(jLabel2);

		preciocompra = new JTextField();
		preciocompra.setBounds(20, 115, 200, 25);
		preciocompra.setBackground(new java.awt.Color(224, 224, 224));
		preciocompra.setFont(new java.awt.Font("Andale Mono", 1, 14));
		preciocompra.setForeground(new java.awt.Color(255, 0, 0));
		add(preciocompra);

		jLabel3 = new JLabel("Stock");
		jLabel3.setBounds(20, 150, 200, 25);
		jLabel3.setFont(new Font("Andale Mono", 3, 15));
		jLabel3.setForeground(new Color(23, 4, 255));
		jLabel3.setBackground(Color.BLUE);
		add(jLabel3);

		stock = new JTextField();
		stock.setBounds(20, 175, 200, 25);
		stock.setBackground(new java.awt.Color(224, 224, 224));
		stock.setFont(new java.awt.Font("Andale Mono", 1, 14));
		stock.setForeground(new java.awt.Color(255, 0, 0));
		add(stock);

		jLabel4 = new JLabel("Tipo de Producto");
		jLabel4.setBounds(20, 210, 200, 25);
		jLabel4.setFont(new Font("Andale Mono", 3, 15));
		jLabel4.setForeground(new Color(23, 4, 255));
		jLabel4.setBackground(Color.BLUE);
		add(jLabel4);

		categoria = new JComboBox();
		categoria.setBounds(20, 245, 200, 25);
		categoria.setBackground(new java.awt.Color(224, 224, 224));
		categoria.setFont(new java.awt.Font("Andale Mono", 1, 14));
		add(categoria);

		categoria.addItem("");
		categoria.addItem("Electrodomestico");
		categoria.addItem("Muebles");
		categoria.addItem("Bebida");

		jLabel5 = new JLabel("Nombre del Producto");
		jLabel5.setBounds(320, 10, 200, 25);
		jLabel5.setFont(new Font("Andale Mono", 3, 15));
		jLabel5.setForeground(new Color(23, 4, 255));
		jLabel5.setBackground(Color.BLUE);
		add(jLabel5);

		name = new JTextField();
		name.setBounds(320, 40, 200, 25);
		name.setBackground(new java.awt.Color(224, 224, 224));
		name.setFont(new java.awt.Font("Andale Mono", 1, 14));
		name.setForeground(new java.awt.Color(255, 0, 0));
		add(name);

		jLabel6 = new JLabel("Precio de Venta");
		jLabel6.setBounds(320, 85, 200, 25);
		jLabel6.setFont(new Font("Andale Mono", 3, 15));
		jLabel6.setForeground(new Color(23, 4, 255));
		jLabel6.setBackground(Color.BLUE);
		add(jLabel6);

		precioventa = new JTextField();
		precioventa.setBounds(320, 115, 200, 25);
		precioventa.setBackground(new java.awt.Color(224, 224, 224));
		precioventa.setFont(new java.awt.Font("Andale Mono", 1, 14));
		precioventa.setForeground(new java.awt.Color(255, 0, 0));
		add(precioventa);

		jLabel7 = new JLabel("Stock Minimo");
		jLabel7.setBounds(320, 150, 150, 25);
		jLabel7.setFont(new Font("Andale Mono", 3, 15));
		jLabel7.setForeground(new Color(23, 4, 255));
		jLabel7.setBackground(Color.BLUE);
		add(jLabel7);

		stockminimo = new JTextField();
		stockminimo.setBounds(320, 175, 200, 25);
		stockminimo.setBackground(new java.awt.Color(224, 224, 224));
		stockminimo.setFont(new java.awt.Font("Andale Mono", 1, 14));
		stockminimo.setForeground(new java.awt.Color(255, 0, 0));
		add(stockminimo);

		jLabel8 = new JLabel("Marca");
		jLabel8.setBounds(320, 210, 200, 25);
		jLabel8.setFont(new Font("Andale Mono", 3, 15));
		jLabel8.setForeground(new Color(23, 4, 255));
		jLabel8.setBackground(Color.BLUE);
		add(jLabel8);

		marca = new JTextField();
		marca.setBounds(320, 245, 200, 25);
		marca.setBackground(new java.awt.Color(224, 224, 224));
		marca.setFont(new java.awt.Font("Andale Mono", 1, 14));
		marca.setForeground(new java.awt.Color(255, 0, 0));
		add(marca);

		jButton = new JButton("GUARDAR");
		jButton.setBounds(520, 300, 150, 25);
		jButton.setBackground(new java.awt.Color(224, 224, 224));
		jButton.setFont(new java.awt.Font("Andale Mono", 1, 14));
		jButton.addActionListener(this);
		add(jButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jButton) {
			defaultTableModel = new DefaultTableModel();
			int codigoval = Integer.parseInt(codigo.getText().toString());
			String nameval = name.getText();
			int pcompraval = Integer.parseInt(preciocompra.getText().toString());
			int pventaval = Integer.parseInt(precioventa.getText().toString());
			int stckoval = Integer.parseInt(stock.getText().toString());
			int stckominval = Integer.parseInt(stockminimo.getText().toString());
			String tipodeproductoval = categoria.getSelectedItem().toString();
			String marcaval = marca.getText();

			modelArticulos.setCodigo(codigoval);
			modelArticulos.setName(nameval);
			modelArticulos.setPreciocompra(pcompraval);
			modelArticulos.setPrecioventa(pventaval);
			modelArticulos.setStock(stckoval);
			modelArticulos.setStockminimo(stckominval);
			modelArticulos.setTipodeproducto(tipodeproductoval);
			modelArticulos.setMarca(marcaval);
			
			controlArticulos.save(modelArticulos);
			controlArticulos.saveinTxt(modelArticulos);

			System.out.println(codigoval);
			System.out.println(nameval);
			System.out.println(pcompraval);
			System.out.println(pventaval);
			System.out.println(stckoval);
			System.out.println(stckominval);
			System.out.println(tipodeproductoval);
			System.out.println(marcaval);

		}
	}

}
