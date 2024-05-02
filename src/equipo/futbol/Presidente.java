package equipo.futbol;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// todo esto es el bean
@Component("Presidente")

public class Presidente implements EquipoDirectivo {


	public Presidente() {

	}

	@Override
	public String getHacerFichajes() {
		// TODO Auto-generated method stub
		return "Una de las funciones es hacer fichajes";
	}

	@Override
	public String getVenderJugadores() {
		// TODO Auto-generated method stub
		return "Una de las funciones es vender jugadores";
	}

	// creamos un objeto de tipo informe financiero
	@Autowired

	// utilizamos el cualifier porque hay varias clases que usan la misma interfaz
	// bean id que debe utilizar
	@Qualifier("Delantero")
	private Jugador nuevoInforme;

	// ejecucion de codigo despues de creacion del Bean
	@PostConstruct
	public void ejecutarDespuesCreacion() {
		System.out.println("Comienzo de la ficha");
	}

	// ejecucion de codigo despues de apagado contenedor spring
	@PreDestroy
	public void ejecutarAntesDestruccion() {
		System.out.println("Final de la ficha");
	}

}
