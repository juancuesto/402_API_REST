package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;



@Entity
@Table(name="fruta")
public class Fruita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=50)
	private String nombre;
	private int cantidadKilos;
	
	public Fruita() {
		
	}
	
	public Fruita(int id, String nombre, int cantidadKilos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadKilos = cantidadKilos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadKilos() {
		return cantidadKilos;
	}

	public void setCantidadKilos(int cantidadKilos) {
		this.cantidadKilos = cantidadKilos;
	}
	
	
	

}
