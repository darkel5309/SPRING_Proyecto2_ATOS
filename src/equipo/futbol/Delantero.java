package equipo.futbol;

import org.springframework.stereotype.Component;

//creamos la instruccion para que spring pueda registrar todo
@Component
public class Delantero implements Jugador {

	@Override
	public String getJugarPartido() {
		// TODO Auto-generated method stub
		return "Esta clase de jugador se encarga de atacar a la portería contraria y marcar goles";
	}


}
