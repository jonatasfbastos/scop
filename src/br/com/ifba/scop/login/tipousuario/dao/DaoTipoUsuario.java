/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.tipousuario.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.login.tipousuario.model.TipoUsuario;
import java.util.List;

/**
 *
 * @author Cliente
 */

public class DaoTipoUsuario extends BaseDao<TipoUsuario> implements IDaoTipoUsuario {
	@Override
	public List<TipoUsuario> findByNome(TipoUsuario tipousuario) {
		final StringBuilder hql = new StringBuilder("FROM TipoUsuario WHERE upper(tipousuario) like upper('"+
		tipousuario.getTipousuario()+"%')"); 
		//String query = "SELECT * FROM TIPOUSUARIO WHERE tipousuario LIKE '"+tipoUsuario.getTipousuario()+"%'";
		return null;
	}    
}
