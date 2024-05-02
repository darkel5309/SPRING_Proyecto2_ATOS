package equipo.futbol;

import org.springframework.stereotype.Component;

@Component
public class Defensa implements Jugador {

	@Override
	public String getJugarPartido() {
		// TODO Auto-generated method stub
		return "Esta clase de jugador se encarga de defender la zona de la portería y frenar los ataques del equipo rival";
	}

}
