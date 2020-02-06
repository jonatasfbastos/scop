/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.tipousuario.service;

import br.com.ifba.scop.infraestructure.exception.BusinessException;
import br.com.ifba.scop.login.tipousuario.dao.IDaoTipoUsuario;
import br.com.ifba.scop.login.tipousuario.model.TipoUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cliente
 */
   

public final class ServiceTipoUsuario implements IServiceTipoUsuario{

	/**
     * Representa a menssagem de erro se o Tipo de UsuÃ¡rio Ã© nulo. 
     */
	private final static String TIPOUSUARIO_NULL = "O Tipo de UsuÃ¡rio Ã© nulo";	
	
	/**
     * Representa a menssagem de erro se o Tipo de UsuÃ¡rio jÃ¡ foi deletado.
     */
	private final static String ALREADY_DELETED = "O Tipo de UsuÃ¡rio jÃ¡ foi deletado antes, sua operaÃ§Ã£o nÃ£o pode ser completada";
	
	/**
     * Representa a menssagem de erro se o id do Tipo de UsuÃ¡rio Ã© nulo.
     */
	private static final String ID_REQUIRED = "O id Ã© requerido";
	
	/**
     * Representa a menssagem de erro se o nome do Tipo de Usuario ja existir.
     */
	private final static String TIPOUSUARIO_EXIST = "Tipo de UsuÃ¡rio ja existe";
	
	/**
     * Representa a menssagem de erro se o Tipo de UsuÃ¡rio estiver sendo usado.
     */
	
	private static final String USUARIO_USANDO_TIPOUSUARIO = "O Perfil de UsuÃ¡rio nÃ£o pode ser excluÃ­do, pois estÃ¡ sendo utilizado em outro local";
	
	

	 /**
    * Represents the dao {@link IDaoTipoUsuario}.
    */
   private transient IDaoTipoUsuario daoTipoUsuario;
	
	@Override
	public TipoUsuario saveTipoUsuario(TipoUsuario tipoUsuario) {
		// TODO Auto-generated method stub
		if(tipoUsuario == null){ 
    		throw new BusinessException(TIPOUSUARIO_NULL);    		
    	}
		
		if (this.tipoUsuarioExistente(tipoUsuario)==true){
			throw new BusinessException(TIPOUSUARIO_EXIST);			
		}
    	
		return daoTipoUsuario.save(tipoUsuario);
	}

	@Override
	public List<TipoUsuario> getAllTipoUsuario() {
		// TODO Auto-generated method stub
		return daoTipoUsuario.findAll();
	}

	@Override
	public void deleteTipoUsuario(TipoUsuario tipoUsuario) {
		// TODO Auto-generated method stub
		if(tipoUsuario == null){ 
    		throw new BusinessException(TIPOUSUARIO_NULL);
    	}
    	if(tipoUsuario.getId() == null || tipoUsuario.getId() < 1){
    		throw new BusinessException(ID_REQUIRED);
    	}
    	
    	final TipoUsuario previous = this.daoTipoUsuario.findById(tipoUsuario.getId());
        if(previous == null){
        	throw new BusinessException (ALREADY_DELETED);
        }
        
//        if( previous.getUsuarios().size() > 0 ) {
//        	throw new BusinessException (USUARIO_USANDO_TIPOUSUARIO);
//        }
        
		this.daoTipoUsuario.delete(tipoUsuario);
	}

	@Override
	public TipoUsuario updateTipoUsuario(TipoUsuario tipoUsuario) {
		// TODO Auto-generated method stub
		if(tipoUsuario == null){ 
    		throw new BusinessException(TIPOUSUARIO_NULL);
    	}
		
		if(tipoUsuario.getId() == null || tipoUsuario.getId() < 1){
    		throw new BusinessException(ID_REQUIRED);
    	}
		
		if (this.tipoUsuarioExistente(tipoUsuario)==true){
			throw new BusinessException(TIPOUSUARIO_EXIST);			
		}
		
		return this.daoTipoUsuario.update(tipoUsuario);
	}
	
	@Override
	public List<TipoUsuario> findByNome(TipoUsuario tipoUsuario) {
		return daoTipoUsuario.findByNome(tipoUsuario);
	}	
	
	@Override
	public boolean tipoUsuarioExistente(TipoUsuario tipousuario) {
		List<TipoUsuario> tipousuarios = new ArrayList<TipoUsuario>();
		tipousuarios=getAllTipoUsuario();		
			for (int i=0;i<tipousuarios.size();i++){				
					if (tipousuario.getTipousuario().equals(tipousuarios.get(i).getTipousuario())){
						if (tipousuario.getId()!=null){
							if (tipousuario.getId().equals(tipousuarios.get(i).getId())){
								return false;
							}
						}
						throw new BusinessException(TIPOUSUARIO_EXIST);						
					}
			}
		return false;
	}


}

