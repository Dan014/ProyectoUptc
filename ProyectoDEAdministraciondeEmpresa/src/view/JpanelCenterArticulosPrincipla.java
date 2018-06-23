package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JpanelCenterArticulosPrincipla extends JPanel {
	JLabel jLabel = new JLabel("PRODUCTO NUEVO");
	JButton jButton;
	JPanel jPanel, jPanel2;
	private JTable jTable;
	private String[][] datos = { { "Codigo", "Nombre Producto", "Precio Compra", "Precio Venta","Stock","Stock Minimo", "Tipo de Producto","Marca"  }, { "Codigo", "Nombre Producto", "Precio Compra", "Precio Venta","Stock","Stock Minimo", "Tipo de Producto","Marca"  },
			{ "Codigo", "Nombre Producto", "Precio Compra", "Precio Venta","Stock","Stock Minimo", "Tipo de Producto","Marca"  }, };

	private String[] cabezera = { "Codigo", "Nombre Producto", "Precio Compra", "Precio Venta","Stock","Stock Minimo", "Tipo de Producto","Marca" };
	ImageIcon imageIcon;
	Icon icon;

	public JpanelCenterArticulosPrincipla() {
		init();

	}

	private void init() {

		this.setLayout(new BorderLayout());
		jPanel = new JPanel();
		jPanel.setPreferredSize(new Dimension(0, 100));
		jPanel2 = new JPanel();
//		jPanel.setBackground(Color.green);
//		jPanel2.setBackground(Color.red);
		
		
		jPanel.setLayout(null);
		jLabel.setBounds(450, 0, 200, 20);
		jButton= new JButton("AÑADIR PRODUCTO");
		jButton.setBounds(70, 20, 150, 50);
		jPanel.add(jLabel);
		jPanel.add(jButton);
		
		
		jTable = new JTable(datos, cabezera);
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(900, 500));
		jPanel2.add(jScrollPane);

		this.add(jPanel, BorderLayout.NORTH);
		this.add(jPanel2, BorderLayout.CENTER);

	}

}
