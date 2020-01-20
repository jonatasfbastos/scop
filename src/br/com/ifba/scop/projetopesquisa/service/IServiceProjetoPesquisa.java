/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.service;

import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;

/**
 *
 * @author jonatasfbastos
 */
public interface IServiceProjetoPesquisa {
    
    // Metodo que salva um Projeto de Pesquisa na base de dados
    public abstract ProjetoPesquisa saveProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que atualiza um Projeto de Pesquisa que já existe na base de dados
    public abstract ProjetoPesquisa updateProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que deleta um Projeto de Pesquisa da base de dados
    public abstract void deleteProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que retorna todos os Projeto de Pesquisa da base de dados
    public abstract List<ProjetoPesquisa> getAllProjetos();
    // Método que retorna um ProjetoPesquisa pelo Id
    public abstract ProjetoPesquisa getByIdProjeto(Long id);
    // Metodo que busca um Projeto de Pesquisa na base de dados através do nome
    public abstract List<ProjetoPesquisa> findByTitulo (String titulo);
    
}
