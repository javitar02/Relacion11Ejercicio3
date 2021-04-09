import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class Persona {
	
	private static final int EDAD_MINIMA = 12;
	
	// Atributos
	private String dni;
	private String nombre;
	private int edad;
	private LinkedList<Mensaje>buzon;
	
	// Constructor
	public Persona(String dni,String nombre,int edad) throws IESException {
		this.dni=dni;
		this.nombre = nombre;
		buzon=new LinkedList<Mensaje>();
		setEdad(edad);
	}

	// Métodos get y set
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	private void setEdad(int edad) throws IESException {
		if (edad < EDAD_MINIMA)
			throw new IESException("La edad minima es de" + EDAD_MINIMA);
		this.edad = edad;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	public void enviarMensaje(Persona destinataria,String mensaje) throws IESException{
		Persona emisor=null;
		Alumno receptor=null;
		LocalDateTime fecha=LocalDateTime.now();
		
		if(emisor instanceof Alumno) {
			if(emisor.getEdad()<18 && destinataria.equals(receptor)) {
				throw new IESException("Error, un menor de edad no puede enviar "
						+ "mensajes a un compañero");
			}else {
				buzon.add(new Mensaje(mensaje, destinataria,fecha));
			}
		}
	}
	
	public String mostrarMensajes() {
		
		String info;
		
		for(Mensaje a:buzon){
			System.out.println(a);
		}
		
		
		
		
		
		return null;
	}
	
	
	public void borrarMensaje(int posicionABorrar) throws IESException{
		
		if(posicionABorrar<0) {
			throw new IESException("Error, indice no encontrado");
		}
		
		if(buzon.remove(posicionABorrar)==null) {
			throw new IESException("Mensaje no borrado");
		}
		
	}
	
	public void encontrarMensajePorFrase(String frase) throws IESException {
		Mensaje msg=null;
		if(msg.getTexto().equals(frase))
		
		for(Mensaje a:buzon) {
			
		}
	}
	
	
	
	
}

