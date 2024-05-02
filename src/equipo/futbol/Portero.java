package equipo.futbol;

import org.springframework.stereotype.Component;

@Component
public class Portero implements Jugador {

	@Override
	public String getJugarPartido() {
		// TODO Auto-generated method stub
		return "Esta clase de jugador se encarga de parar balones en la portería";
	}

}
