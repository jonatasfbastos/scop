/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.tipousuario.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import br.com.ifba.scop.login.usuario.model.Usuario;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Cliente
 */@Entity
@Table (name = "TIPOUSUARIO")
public class TipoUsuario extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4744347533604251823L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", length=11, nullable=false)
	private Long id;
	
	@Column(name="TIPOUSUARIO", length=100, nullable=false)
	private String tipousuario;
	
	@OneToMany( mappedBy = "tipoUsuario", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Collection<Usuario> usuarios;
	
	/*
	@ManyToMany()
	@JoinTable(name="TIPOUSUARIO_ROLE",
	joinColumns={@JoinColumn(name="TIPOUSUARIO_ID")},
	inverseJoinColumns={@JoinColumn(name="ROLE_ID")})
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Role> roles;*/
	
	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

        @Override
	public Long getId() {
		return id;
	}

        @Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(String tipousuario) {
		this.tipousuario = tipousuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}

