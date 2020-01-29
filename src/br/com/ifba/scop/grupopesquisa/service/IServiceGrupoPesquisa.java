/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.service;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import java.util.List;

/**
 *
 * @author beatriz
 */
public interface IServiceGrupoPesquisa {
    // Metodo que salva um Grupo de Pesquisa na base de dados
    public abstract GrupoPesquisa saveGrupoPesquisa (GrupoPesquisa grupoPesquisa);
    // Metodo que atualiza um Grupo de Pesquisa que já existe na base de dados
    public abstract GrupoPesquisa updateGrupoPesquisa (GrupoPesquisa grupoPesquisa);
    // Metodo que deleta um Grupo de Pesquisa da base de dados
    public abstract void deleteGrupoPesquisa (GrupoPesquisa grupoPesquisa);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<GrupoPesquisa> getAllGrupoPesquisa();
    // Método que retorna um Grupo de Pesquisa pelo Id
    public abstract GrupoPesquisa getByIdGrupoPesquisa(Long id);
    // Metodo que busca um Grupo de Pesquisa na base de dados através do nome
    public abstract List<GrupoPesquisa> findByNomeGrupoPesquisa (String titulo);
}
