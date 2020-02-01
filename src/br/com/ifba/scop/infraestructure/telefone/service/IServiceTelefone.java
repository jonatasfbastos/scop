/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.telefone.service;

import br.com.ifba.scop.infraestructure.telefone.model.Telefone;
import java.util.List;

/**
 *
 * @author itallo007
 */
public interface IServiceTelefone {
    
    public Telefone saveTelefone(Telefone telefone);
    
    public Telefone updateTelefone(Telefone telefone);
    
    public void deleteTelefone(Telefone telefone);
    
    public List<Telefone> getAllTelefone();
    
}
