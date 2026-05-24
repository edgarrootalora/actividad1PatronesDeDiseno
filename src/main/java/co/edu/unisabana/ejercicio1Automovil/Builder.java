package co.edu.unisabana.ejercicio1Automovil;

public interface Builder {
	void reset();

	void setMotor(String motor);

	void setColor(String color);

	void setLlantas(String llantas);

	void setSistemaSonido(String sistemaSonido);

	void setInteriores(String interiores);

	void setTechoSolar(boolean enabled);

	void setNavegacionGps(boolean enabled);
}
