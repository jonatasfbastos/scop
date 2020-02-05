/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.tipousuario.service;

import br.com.ifba.scop.login.tipousuario.model.TipoUsuario;
import java.util.List;

/**
 *
 * @author Cliente
 */
public interface IServiceTipoUsuario {

	public abstract TipoUsuario saveTipoUsuario(TipoUsuario tipousuario);
	public abstract List<TipoUsuario> getAllTipoUsuario();
	public abstract void deleteTipoUsuario(final TipoUsuario tipousuario);
	public abstract TipoUsuario updateTipoUsuario(TipoUsuario tipousuario);
	public abstract List<TipoUsuario> findByNome(TipoUsuario tipousuario);
	public abstract boolean tipoUsuarioExistente(TipoUsuario tipousuario);
}

