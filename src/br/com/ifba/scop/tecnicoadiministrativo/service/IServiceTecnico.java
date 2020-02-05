/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.tecnicoadiministrativo.service;

import br.com.ifba.scop.tecnicoadiministrativo.model.Tecnico;
import java.util.List;

/**
 *
 * @author Gusdb
 */
public abstract class IServiceTecnico {
    
    // Salva tecnico na base de dados
    public abstract Tecnico saveTecnico(Tecnico tecnico);
    // Deleta o tecnico da base de dados
    public abstract void deleteTecnico(Tecnico tecnico);
    // Metodo que atualiza um tecnico que já existe na base de dados
    public abstract Tecnico  updateTecnico (Tecnico tecnico);
    // Metodo que retorna todos os tecnico da base de dados
    public abstract List<Tecnico> getAllTecnico ();
    // Método que retorna um tecnico pelo Id
    public abstract Tecnico  getByIdTecnico (Long id);
    // Metodo que busca tecnico na base de dados através do nome
    public abstract List<Tecnico> findByTecnico (String tecnico);
  
    
}
