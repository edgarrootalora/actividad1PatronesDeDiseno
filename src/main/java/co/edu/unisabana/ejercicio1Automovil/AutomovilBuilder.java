package co.edu.unisabana.ejercicio1Automovil;

public class AutomovilBuilder implements Builder {
	private Automovil automovil;

	public AutomovilBuilder() {
		reset();
	}

	@Override
	public void reset() {
		automovil = new Automovil();
	}

	@Override
	public void setMotor(String motor) {
		automovil.setMotor(motor);
	}

	@Override
	public void setColor(String color) {
		automovil.setColor(color);
	}

	@Override
	public void setLlantas(String llantas) {
		automovil.setLlantas(llantas);
	}

	@Override
	public void setSistemaSonido(String sistemaSonido) {
		automovil.setSistemaSonido(sistemaSonido);
	}

	@Override
	public void setInteriores(String interiores) {
		automovil.setInteriores(interiores);
	}

	@Override
	public void setTechoSolar(boolean enabled) {
		automovil.setTechoSolar(enabled);
	}

	@Override
	public void setNavegacionGps(boolean enabled) {
		automovil.setNavegacionGps(enabled);
	}

	public Automovil getProduct() {
		Automovil producto = automovil;
		reset();
		return producto;
	}
}
