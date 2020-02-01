/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.usuario.service;


import br.com.ifba.scop.pesquisador.service.*;
import br.com.ifba.scop.infraestructure.exception.BusinessException;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.login.usuario.dao.DaoUsuario;
import br.com.ifba.scop.login.usuario.dao.IDaoUsuario;
import br.com.ifba.scop.login.usuario.model.Usuario;
import br.com.ifba.scop.pesquisador.dao.DaoPesquisador;
import br.com.ifba.scop.pesquisador.dao.IDaoPesquisador;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import static br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa.PROJ_EXISTE;
import static br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa.PROJ_INVALIDO;
import static br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa.PROJ_NULL;
import java.util.ArrayList;
import java.util.List;


public class ServiceUsuario implements IServiceUsuario{
    
/**
    * Representa a menssagem de erro se o Usuario é nulo. 
    */
       private final static String USUARIO_NULL = "O Usuario é nulo";

       /**
    * Representa a menssagem de erro se O Usuario já foi deletado.
    */
       private final static String ALREADY_DELETED = "O Usuario já foi deletado antes, sua operação não pode ser completada";

       /**
    * Representa a menssagem de erro se o id do Usuario Ã© nulo.
    */
       private static final String ID_REQUIRED = "O id é requerido";

       /**
    * Representa a menssagem de erro se o nome do UsuÃ¡rio ja existir.
    */
       private final static String USUARIO_EXIST = "Usuário ja existe";

       
       private final IDaoUsuario daoUsuario = new DaoUsuario();

       @Override
       public Usuario saveUsuario(Usuario usuario) {


               if(usuario.getLogin()==null || usuario.getSenha()==null){
                       throw new BusinessException(USUARIO_NULL);
               }

               if (this.usuarioExistente(usuario)==true){
                       throw new BusinessException(USUARIO_EXIST);

               }

               return daoUsuario.save(usuario);

       }

       @Override
       public Usuario updateUsuario(Usuario usuario) {
               if(usuario.getLogin()==null || usuario.getSenha()==null){
                       throw new BusinessException(USUARIO_NULL);
               }
               if(usuario.getId() == null || usuario.getId() < 1){
               throw new BusinessException(ID_REQUIRED);
       }

               if (this.usuarioExistente(usuario)==true){
                       throw new BusinessException(USUARIO_EXIST);

               }
               return daoUsuario.update(usuario);
       }

       @Override
       public List<Usuario> getAllUsuario() {
               return this.daoUsuario.findAll();
       }

       @Override
       public void deleteUsuario(final Usuario usuario) {
               if(usuario == null){ 
               throw new BusinessException(USUARIO_NULL);
       }
       if(usuario.getId() == null || usuario.getId() < 1){
               throw new BusinessException(ID_REQUIRED);
       }

       final Usuario previous = this.daoUsuario.findById(usuario.getId());
       if(previous == null){
               throw new BusinessException (ALREADY_DELETED);
       }

               this.daoUsuario.delete(usuario);
       }

       @Override
       public List<Usuario> findByNome(Usuario usuario) {
               return daoUsuario.findByNome(usuario);
       }

       @Override
       public Usuario findById(Long id){
               return daoUsuario.findById(id);
       }

       @Override
       public boolean usuarioExistente(Usuario usuario) {
               List<Usuario> usuarios = new ArrayList<Usuario>();
               usuarios=getAllUsuario();		
                       for (int i=0;i<usuarios.size();i++){				
                                       if (usuario.getLogin().equals(usuarios.get(i).getLogin())){
                                               if (usuario.getId()!=null){
                                                       if (usuario.getId().equals(usuarios.get(i).getId())){
                                                               return false;
                                                       }
                                               }
                                               throw new BusinessException(USUARIO_EXIST);						
                                       }
                       }
               return false;
       }	  


}
