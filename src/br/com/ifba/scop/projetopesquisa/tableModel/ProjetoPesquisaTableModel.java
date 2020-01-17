/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.tableModel;

import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;
import javax.swing.table.AbstractTableModel;




/**
 *
 * @author mvictor
 *
 */
public class ProjetoPesquisaTableModel extends AbstractTableModel implements IProjetoPesquisaTableModel{

    
    @Override
    public String getColumnName(int linhas)
    {
        return ProjetoPesquisaTableModel.colunas[linhas];
    }
    
    @Override
    public int getRowCount() {
        return ProjetoPesquisaTableModel.lista.size();
    }

    @Override
    public int getColumnCount() {
        return ProjetoPesquisaTableModel.colunas.length;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        switch(colunas)
        {
            case 0: 
                return ProjetoPesquisaTableModel.lista.get(linhas).getTitulo();
            case 1:
                return ProjetoPesquisaTableModel.lista.get(linhas).getSubArea();
            case 2:
                return ProjetoPesquisaTableModel.lista.get(linhas).getCampus();
            case 3:
                return ProjetoPesquisaTableModel.lista.get(linhas).getEspaco();
        }
        return null;
    }

    public void addElement(ProjetoPesquisa entidade)
    {
        ProjetoPesquisaTableModel.lista.add(entidade);
        this.fireTableDataChanged();
    }
    
    public void addElementIndex(int posicao, ProjetoPesquisa entidade)
    {
        ProjetoPesquisaTableModel.lista.add(posicao, entidade);
        this.fireTableDataChanged();
    }
    
    public void removeElement(int posicao)
    {
        ProjetoPesquisaTableModel.lista.remove(posicao);
        this.fireTableDataChanged();
    }
    
    public void clerTable()
    {
        ProjetoPesquisaTableModel.lista.clear();
        this.fireTableDataChanged();
    }
    
    public void updateTableList(List<ProjetoPesquisa> lista)
    {
        ProjetoPesquisaTableModel.lista.clear();
        ProjetoPesquisaTableModel.lista.addAll(lista);
        this.fireTableDataChanged();
    }

}
