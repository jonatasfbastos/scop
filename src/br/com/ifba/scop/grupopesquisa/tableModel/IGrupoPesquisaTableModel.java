/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.tableModel;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe protótipo com as informações necessárias da tabela.
 * @author mvictor
 */
public interface IGrupoPesquisaTableModel{
    
    
    // lista que irá receber as informações da base de dados.
    public List <GrupoPesquisa> lista = new ArrayList();
    
    /**
     *
     */
    
    //nome das colunas da tabelas.
    public String[] colunas = new String[]
    {
        "Grupo de Pesquisa",
        "Área de Conhecimento",
        "Deletar",
        "Editar"
    };
    
}
