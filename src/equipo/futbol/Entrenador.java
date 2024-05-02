package equipo.futbol;

import org.springframework.beans.factory.annotation.Value;

public class Entrenador implements EquipoDirectivo {

	// constructor
	public Entrenador(EquipoDirectivo informeClub) {
		super();
		this.informeClub = informeClub;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return getNombreEmpresa();
	}

	@Override
	public String getVenderJugadores() {
		// TODO Auto-generated method stub
		return "Listado de venta de jugadores del club";
	}

	@Override
	public String getHacerFichajes() {
		// TODO Auto-generated method stub
		return informeClub.getHacerFichajes();
	}

	private EquipoDirectivo informeClub;

	// crear campos encapsulados para almacenar los valores
	// los values los sacamos del archivo datosEmpresa.propiedades
	@Value("${nombreEquipo}")
	private String nombreEquipo;

	@Value("${email}")
	private String email;
	
	@Value("${telefono}")
	private String telefono;
}
