package equipo.futbol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@ComponentScan("equipo.futbol")
@PropertySource("classpath:datosEquipo.propiedades")
public class JugadoresConfig {
	
	// definir el bean para informePersona
	
	@Bean
	//este es el id del Bean inyectado
	public Jugador informePersona() {
		return new InformePersona();
	}
}
