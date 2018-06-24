package model;

public class ModelArticulos {
	private int codigo;
	private String name;
	private int preciocompra;
	private int precioventa;
	private int stock;
	private int stockminimo;
	private String tipodeproducto;
	private String marca;

	public ModelArticulos(int codigo, String name, int preciocompra, int precioventa, int stock, int stockminimo,
			String tipodeproducto, String marca) {
		super();
		this.codigo = codigo;
		this.name = name;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.stock = stock;
		this.stockminimo = stockminimo;
		this.tipodeproducto = tipodeproducto;
		this.marca = marca;
	}

	public ModelArticulos() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPreciocompra() {
		return preciocompra;
	}

	public void setPreciocompra(int preciocompra) {
		this.preciocompra = preciocompra;
	}

	public int getPrecioventa() {
		return precioventa;
	}

	public void setPrecioventa(int precioventa) {
		this.precioventa = precioventa;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStockminimo() {
		return stockminimo;
	}

	public void setStockminimo(int stockminimo) {
		this.stockminimo = stockminimo;
	}

	public String getTipodeproducto() {
		return tipodeproducto;
	}

	public void setTipodeproducto(String tipodeproducto) {
		this.tipodeproducto = tipodeproducto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
