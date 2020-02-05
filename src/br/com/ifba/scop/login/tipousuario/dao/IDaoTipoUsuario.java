/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.tipousuario.dao;

import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import br.com.ifba.scop.login.tipousuario.model.TipoUsuario;
import java.util.List;

/**
 *
 * @author Cliente
 */
public interface IDaoTipoUsuario extends IBaseDao<TipoUsuario> {
	
	public abstract List<TipoUsuario> findByNome(TipoUsuario tipousuario);

}
