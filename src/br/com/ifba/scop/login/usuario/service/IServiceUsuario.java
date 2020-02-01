/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.usuario.service;

import br.com.ifba.scop.login.usuario.model.Usuario;
import br.com.ifba.scop.pesquisador.service.*;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import java.util.List;

/**
 *
 * @author jonatasfbastos
 */
public interface IServiceUsuario {
    
    Usuario saveUsuario(Usuario usuario);

    Usuario updateUsuario(Usuario usuario);

    List<Usuario> getAllUsuario();

    void deleteUsuario(final Usuario usuario);

    public List<Usuario> findByNome(Usuario usuario);

    public Usuario findById(Long id);

    boolean usuarioExistente(Usuario usuario);
    
}
