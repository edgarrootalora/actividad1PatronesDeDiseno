package co.edu.unisabana.ejercicio1Automovil;

public class Automovil {
	private String motor;
	private String color;
	private String llantas;
	private String sistemaSonido;
	private String interiores;
	private boolean techoSolar;
	private boolean navegacionGps;

	public Automovil() {
		this.motor = "Motor estándar";
		this.color = "Blanco";
		this.llantas = "Llantas estándar";
		this.sistemaSonido = "Radio básica";
		this.interiores = "Interiores de tela";
		this.techoSolar = false;
		this.navegacionGps = false;
	}

	// Getters y Setters
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLlantas(String llantas) {
		this.llantas = llantas;
	}

	public void setSistemaSonido(String sistemaSonido) {
		this.sistemaSonido = sistemaSonido;
	}

	public void setInteriores(String interiores) {
		this.interiores = interiores;
	}

	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public void setNavegacionGps(boolean navegacionGps) {
		this.navegacionGps = navegacionGps;
	}

	@Override
	public String toString() {
		return "Automovil {" + "motor='" + motor + '\'' + ", color='" + color + '\'' + ", llantas='" + llantas + '\''
				+ ", sistemaSonido='" + sistemaSonido + '\'' + ", interiores='" + interiores + '\'' + ", techoSolar="
				+ (techoSolar ? "Sí" : "No") + ", navegacionGps=" + (navegacionGps ? "Sí" : "No") + '}';
	}
}
