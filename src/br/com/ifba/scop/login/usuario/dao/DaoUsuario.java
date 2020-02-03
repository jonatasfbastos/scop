/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.usuario.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.infraestructure.service.Singleton;
import br.com.ifba.scop.login.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author Cliente
 */
public class DaoUsuario extends BaseDao<Usuario> implements IDaoUsuario{

   @Override
   public List<Usuario> findByNome(Usuario usuario) {
            String query  = "FROM Usuario WHERE upper(login) like upper('"+
            usuario.getLogin()+"%')";
            //String query = "SELECT * FROM USUARIO WHERE login LIKE '"+usuario.getLogin()+"%'";
            return  BaseDao.entityManager.createQuery(query).getResultList();
	}
    @Override
   public Usuario findByLoginSenha(Usuario usuario) {
            String query  = "select Usr from Usuario Usr WHERE Usr.login like'"+
            usuario.getLogin()+"%' and Usr.senha like '"+usuario.getSenha()+"'";
            //String query = "SELECT * FROM USUARIO WHERE login LIKE '"+usuario.getLogin()+"%'";
            return  (Usuario) BaseDao.entityManager.createQuery(query).getSingleResult();
	}
 
    
}
