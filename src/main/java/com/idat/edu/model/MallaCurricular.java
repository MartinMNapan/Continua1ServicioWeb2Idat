package com.idat.edu.model;


import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "malla_curricular")
@Entity
public class MallaCurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private Integer año;
	
	//Relacion de uno auno
	@OneToOne(mappedBy = "universidad")
	private Universidad universidad;
	
	//Relacion de muchos a uno
	@ManyToOne
	@JoinColumn(
			name = "id_curso",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey
			(foreignKeyDefinition = "foreign key(id_curso) references curso(id_curso)"))
	private Curso curso;
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	
	

}
