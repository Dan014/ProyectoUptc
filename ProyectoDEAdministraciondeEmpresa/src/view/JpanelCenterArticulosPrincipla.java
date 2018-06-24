package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ControlArticulos;
import model.ModelArticulos;

public class JpanelCenterArticulosPrincipla extends JPanel implements ActionListener {
	ModelArticulos modelArticulos = new ModelArticulos();
	ControlArticulos controlArticulos = new ControlArticulos();
	DefaultTableModel defaultTableModel;
	Vector cabeceras = new Vector();

	JLabel jLabel = new JLabel("PRODUCTO NUEVO");
	JButton jButton, jButton2, jButton3;
	JPanel jPanel, jPanel2;
	ImageIcon imageIcon;
	Icon icon;
	JTable jTable;

	public JpanelCenterArticulosPrincipla() {
		init();
		cabeceras.addElement("A");
		cabeceras.addElement("E");
		cabeceras.addElement("R");
		cabeceras.addElement("F");
		cabeceras.addElement("H");
		cabeceras.addElement("H");
		cabeceras.addElement("Y");
		cabeceras.addElement("U");

		defaultTableModel = new DefaultTableModel(cabeceras, 0);
		jTable.setModel(defaultTableModel);

	}

	private void init() {

		this.setLayout(new BorderLayout());
		jPanel = new JPanel();
		jPanel.setPreferredSize(new Dimension(0, 100));
		jPanel2 = new JPanel();
		// jPanel.setBackground(Color.green);
		// jPanel2.setBackground(Color.red);

		jPanel.setLayout(null);
		jLabel.setBounds(450, 0, 200, 20);
		jButton = new JButton("AÑADIR PRODUCTO");
		jButton.setBounds(70, 20, 100, 50);
		jPanel.add(jLabel);
		jPanel.add(jButton);

		jButton2 = new JButton("ELIMINAR");
		jButton2.setBounds(200, 20, 100, 50);
		jPanel.add(jButton2);

		jButton3 = new JButton("MODIFICAR");
		jButton3.setBounds(330, 20, 100, 50);
		jPanel.add(jButton3);

		jTable = new JTable();
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(900, 500));
		jPanel2.add(jScrollPane);

		this.add(jPanel, BorderLayout.NORTH);
		this.add(jPanel2, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jButton2) {
			jTable.setModel(controlArticulos.listArticles());
		}
	}

}
