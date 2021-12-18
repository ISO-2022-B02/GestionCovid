package org.M0.Catalogacion;

public class Enfermedad {
	/**
	 * Sintoma de una enfermedad
	 */
	private String _sintoma;
	/**
	 * Temporalidad de la enfermedad en semanas
	 */
	private int _temporalidad;
	/**
	 * Medicinas asociadas a una enfermedad y que han sido aprobadas por los Organismos Sanitarios a nivel regional y nacional
	 */
	private String _medicinas;
	/**
	 * Atributo que indica un posible confinamiento
	 */
	private boolean _posibleConfin;
	/**
	 * Lista de vacunas (representadas mediante un string) asociadas a una enfermedad
	 */
	private String _listaVacunas;

	/**
	 * M�todo el cual recibe una enfermedad del gestor y llama al agente para que este lo inserte en una base de datos
	 */
	public void insertarEnfermedad(Object aEnfermedad) {
		throw new UnsupportedOperationException();
	}

	/**
	 * M�todo que lee todas las enfermedades de la base de datos
	 */
	public Enfermedad leerEnfermedades() {
		throw new UnsupportedOperationException();
	}
}