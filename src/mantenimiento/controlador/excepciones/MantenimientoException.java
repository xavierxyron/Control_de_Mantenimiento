package mantenimiento.controlador.excepciones;

public class MantenimientoException extends Exception {
	
	public MantenimientoException(String mensaje){
		super(mensaje);		
	}

	public MantenimientoException(String mensaje, Throwable cause){
		super(mensaje , cause);		
	}

}
