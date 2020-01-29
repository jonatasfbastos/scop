/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.dao;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author beatriz
 */
public interface IDaoGrupoPesquisa extends IBaseDao<GrupoPesquisa>{
    //Busca um Grupo de Pesquisa pelo título.
    public abstract List<GrupoPesquisa> findByNome(String titulo);
}
