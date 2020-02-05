/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.tecnicoadiministrativo.dao;

import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import br.com.ifba.scop.tecnicoadiministrativo.model.Tecnico;
import java.util.List;
/**
 *
 * @author Gusdb
 */
public interface IDaoTecnico extends IBaseDao<Tecnico>{

    /**
     *
     * @param tecnico
     * @return
     */
    public abstract List<Tecnico> FindByNomeTecnico(String tecnico);
}