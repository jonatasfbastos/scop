/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.service;

import br.com.ifba.scop.pesquisador.model.Pesquisador;
import java.util.List;

/**
 *
 * @author jonatasfbastos
 */
public interface IServicePesquisador {
    
    // Metodo que salva um Projeto de Pesquisa na base de dados
    public abstract Pesquisador savePesquisador (Pesquisador  pesquisador );
    // Metodo que atualiza um Projeto de Pesquisa que já existe na base de dados
    public abstract Pesquisador updatePesquisador  (Pesquisador  pesquisador);
    // Metodo que deleta um Projeto de Pesquisa da base de dados
    public abstract void deletePesquisador  (Pesquisador  pesquisador);
    // Metodo que retorna todos os Projeto de Pesquisa da base de dados
    public abstract List<Pesquisador> getAllPesquisador();
    // Metodo que busca um Projeto de Pesquisa na base de dados através do nome
    public abstract Pesquisador findByMatricula(String matricula);
    
}
