package co.edu.unisabana.ejercicio1Automovil;
/*
Patrón: Builder (Creacional)
Construcción de objetos Automovil con configuraciones relacionadas.
*/

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        // Auto por defecto
        AutomovilBuilder automovilBuilder = new AutomovilBuilder();
        Automovil autoPorDefecto = automovilBuilder.getProduct();

        // Auto deportivo
        director.constructSportsCar(automovilBuilder);
        Automovil autoDeportivo = automovilBuilder.getProduct();

        // Auto de lujo
        director.constructLuxuryCar(automovilBuilder);
        Automovil autoLujo = automovilBuilder.getProduct();

        System.out.println("Auto por defecto:");
        System.out.println(autoPorDefecto);

        System.out.println("\nAuto deportivo:");
        System.out.println(autoDeportivo);

        System.out.println("\nAuto de lujo:");
        System.out.println(autoLujo);
    }
}
