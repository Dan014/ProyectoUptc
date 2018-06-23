package controller;

public enum CommandAction {
	boton1("Home", "AQUI SE EJECUTA EL COMANDO A", "src/images/CLIENTES.png"),
	boton2("Articulos", "AQUI SE EJECUTA EL COMANDO S", "src/images/HOME.png"),
	boton3("Compras", "AQUI SE EJECUTA EL COMANDO D", "src/images/HOME.png"),
	boton4("Ventas", "AQUI SE EJECUTA EL COMANDO F", "src/images/HOME.png"),
	boton5("Proveedores", "AQUI SE EJECUTA EL COMANDO G", "src/images/HOME.png"),
	boton6("Empleados", "AQUI SE EJECUTA EL COMANDO A", "src/images/HOME.png"),
	boton7("Pagos", "AQUI SE EJECUTA EL COMANDO H", "src/images/HOME.png");

	



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
