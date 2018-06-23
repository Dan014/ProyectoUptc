package controller;

public enum CommandAction {
	boton1("HOME", "AQUI SE EJECUTA EL COMANDO A", "/images/HOME.png"),
	boton2("ARTICULOS", "AQUI SE EJECUTA EL COMANDO S", "/images/articulos.png"),
	boton3("COMPRAS", "AQUI SE EJECUTA EL COMANDO D", "/images/COMPRA.png"),
	boton4("VENTAS", "AQUI SE EJECUTA EL COMANDO F", "/images/VENTA.png"),
	boton5("PROVEEDORES", "AQUI SE EJECUTA EL COMANDO G", "/images/PROVEEDORES.png"),
	boton6("EMPLEADOS", "AQUI SE EJECUTA EL COMANDO A", "/images/CLIENTES.png"),
	boton7("PAGOS", "AQUI SE EJECUTA EL COMANDO H", "/images/PAGOS.png");


	private String commandName;
	private String toolTip;
	private String rutaImage;


	public String getCommandName() {
		return commandName;
	}

	public String getToolTip() {
		return toolTip;
	}
	

	public String getRutaImage() {
		return rutaImage;
	}

	private CommandAction(String commandName, String toolTip, String rutaImage) {
		this.commandName = commandName;
		this.toolTip = toolTip;
		this.rutaImage = rutaImage;
	}



}
