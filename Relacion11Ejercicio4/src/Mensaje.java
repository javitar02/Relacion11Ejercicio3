import java.time.LocalDateTime;

public class Mensaje {
	private String texto;
	private Persona remitente;
	private LocalDateTime fecha;
	
	
	
	public Mensaje(String texto, Persona remitente, LocalDateTime fecha) {
		this.texto = texto;
		this.remitente = remitente;
		fecha =LocalDateTime.now();
	}

	public String getTexto() {
		return texto;
	}
	
	public Persona getRemitente() {
		return remitente;
	}
	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	
	
	
}
