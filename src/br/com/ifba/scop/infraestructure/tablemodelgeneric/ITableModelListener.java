/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.tablemodelgeneric;

import javax.swing.event.TableModelEvent;

/**
 * Classe para criação de modelo para evento da TableModel
 * @author mvictor
 */
public interface ITableModelListener {
    
    public void tableChanged(TableModelEvent event);
    
}