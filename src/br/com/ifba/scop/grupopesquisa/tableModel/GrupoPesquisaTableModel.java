/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.tableModel;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.projetopesquisa.tableModel.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mvictor
 *
 */
public class GrupoPesquisaTableModel extends AbstractTableModel implements IGrupoPesquisaTableModel{

    
    //metódo que retorna o nomes de cada colunas.
    
    @Override
    public String getColumnName(int linhas)
    {
        return GrupoPesquisaTableModel.colunas[linhas];
    }
    
    //metodo que retorn o número de linhas da tabela.
    @Override
    public int getRowCount() {
        return GrupoPesquisaTableModel.lista.size();
    }

    /**
    * Método que retorna o numero de colunas
    */
    @Override
    public int getColumnCount() {
        return GrupoPesquisaTableModel.colunas.length;
    }
    
    //metodo que set os valores das linhas, baseado com a coluna.
    @Override
    public Object getValueAt(int linhas, int colunas) {
        switch(colunas)
        {
            case 0: 
                return GrupoPesquisaTableModel.lista.get(linhas).getNome();
            case 1:
                return GrupoPesquisaTableModel.lista.get(linhas).getAreaConhecimento();          
        }
        return null;
    }

    // método que adiciona um elemento na linha da tabela.
    public void addElement(GrupoPesquisa entidade)
    {
        GrupoPesquisaTableModel.lista.add(entidade);
        this.fireTableDataChanged();
    }
    
    // método que adiciona um elemento na linha da tabela, sendo que o usuário precisa especificar a posicao dessa linha na tabela.
    public void addElementIndex(int posicao, GrupoPesquisa entidade){
        GrupoPesquisaTableModel.lista.add(posicao, entidade);
        this.fireTableDataChanged();
    }
    
    //metodo que remove de uma posicao em especifica da linha todas informações.
    public void removeElement(int posicao)
    {
        GrupoPesquisaTableModel.lista.remove(posicao);
        this.fireTableDataChanged();
    }
    
    //metodo responsavel por limpar as informações da nossa tabela.
    public void clearTable()
    {
        GrupoPesquisaTableModel.lista.clear();
        this.fireTableDataChanged();
    }
    
    //metodo responsável por atualizar a lista coma as informações da base de dados.
    public void updateTableList(List<GrupoPesquisa> lista)
    {
        GrupoPesquisaTableModel.lista.clear();
        GrupoPesquisaTableModel.lista.addAll(lista);
        this.fireTableDataChanged();
    }
}
