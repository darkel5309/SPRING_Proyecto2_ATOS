package equipo.futbol;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(JugadoresConfig.class);

		// pedir un bean al contenedor

		EquipoDirectivo Entrenador = contexto.getBean("Entrenador", Entrenador.class);

		System.out.println("Función del entrenador: " + Entrenador.getHacerFichajes());

		Jugador Delantero = contexto.getBean("Delantero", Delantero.class);
		
		System.out.println("Función del delantero: " + Delantero.getJugarPartido());
		
		Jugador Portero = contexto.getBean("Portero", Portero.class);
		
		System.out.println("Función del portero: " + Portero.getJugarPartido());
		
		EquipoDirectivo Presidente = contexto.getBean("Presidente", Presidente.class);
		
		System.out.println("Función del presidente: " + Presidente.getVenderJugadores());
		
		// cerrar el contexto

		contexto.close();
	}
}
