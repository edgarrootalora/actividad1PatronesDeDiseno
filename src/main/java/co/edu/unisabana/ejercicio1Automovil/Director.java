package co.edu.unisabana.ejercicio1Automovil;

public class Director {
	public void constructSportsCar(Builder builder) {

		builder.reset();
		builder.setMotor("Motor V8");
		builder.setColor("Rojo metálico");
		builder.setLlantas("Llantas deportivas 20\"");
		builder.setSistemaSonido("Equipo premium");
		builder.setInteriores("Cuero negro");
		builder.setTechoSolar(true);
		builder.setNavegacionGps(true);
	}

	public void constructLuxuryCar(Builder builder) {

		builder.reset();
		builder.setMotor("Motor V6 Turbo");
		builder.setColor("Azul oscuro");
		builder.setLlantas("Llantas aleación 19\"");
		builder.setSistemaSonido("Sistema Bose");
		builder.setInteriores("Cuero beige");
		builder.setTechoSolar(true);
		builder.setNavegacionGps(true);
	}
}
