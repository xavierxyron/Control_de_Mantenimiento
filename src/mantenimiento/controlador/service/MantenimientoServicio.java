package mantenimiento.controlador.service;

import java.util.List;

import mantenimiento.controlador.excepciones.MantenimientoException;
import mantenimiento.negocio.Consultas;
import mantenimiento.negocio.Orden;
import mantenimiento.negocio.Persona;

public interface MantenimientoServicio {
	
	List<Persona> obtenerPersonas() throws MantenimientoException;
	List<Orden> obtenerOrdenes() throws MantenimientoException;
	List<Consultas> obtenerOrdenesConsulta() throws MantenimientoException;

}
