package org.M0.Catalogacion;

import java.sql.Connection;
import java.util.Vector;

/**
 * Clase que implementa el modelo Singleton la cual sirve para acceder a la base de datos MySql y realizar operaciones en esta.
 */
public class Agente {
	/**
	 * Instancia del agente
	 */
	protected Agente _mInstancia = null;
	/**
	 * Atributo que sirve para conectarse a la base de datos
	 */
	protected Connection _mBD;
	/**
	 * Driver para conectar con bases de datos MySQL
	 */
	private String _driver = "com.mysql.cj.jdbc.Driver";

	/**
	 * Constructor de la clase Agente que implementa el modelo Singleton y que garantiza que solo haya una instancia de la clase, ya que el constructor es privado
	 */
	private Agente() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implementacion del patron singleton.
	 * Este patron de dise�o permite implementar clases de las cuales solo existir una instancia.
	 */
	public Agente getAgente() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para realizar la conexion a la base de datos
	 */
	public void conectar() {
		throw new UnsupportedOperationException();
	}

	/**
	 * M�todo para desconectarse de la base de datos
	 */
	public void desconectar() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para realizar una insercion en la base de datos
	 * @param aSQL Sentencia SQL
	 */
	public int insert(String aSQL) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para realizar una eliminacion de la base de datos
	 * @param aSQL Sentencia SQL
	 */
	public int delete(String aSQL) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para actualizar la base de datos
	 * @param aSQL Sentencia SQL
	 */
	public int update(String aSQL) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para seleccionar una busqueda de informacion de la base de datos. Cada vector contiene un vector de objetos con la informacion de cada entrada de la base de datos. Solo har� falta un m�todo select ya que las tablas que utilizamos en nuestra base de datos tienen el mismo tama�o
	 * @param aSQL Sentencia SQL
	 */
	public Vector<Vector<Object>> select(String aSQL) {
		throw new UnsupportedOperationException();
	}
}