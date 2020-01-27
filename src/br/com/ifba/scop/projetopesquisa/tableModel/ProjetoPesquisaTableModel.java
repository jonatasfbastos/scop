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

    
    //metódo que retorna o nomes de cada colunas.
    
    @Override
    public String getColumnName(int linhas)
    {
        return ProjetoPesquisaTableModel.colunas[linhas];
    }
    
    //metodo que retorn o número de linhas da tabela.
    @Override
    public int getRowCount() {
        return ProjetoPesquisaTableModel.lista.size();
    }

    /**
    * Método que retorna o numero de colunas
    */
    @Override
    public int getColumnCount() {
        return ProjetoPesquisaTableModel.colunas.length;
    }
    
    //metodo que set os valores das linhas, baseado com a coluna.
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

    // método que adiciona um elemento na linha da tabela.
    public void addElement(ProjetoPesquisa entidade)
    {
        ProjetoPesquisaTableModel.lista.add(entidade);
        this.fireTableDataChanged();
    }
    
    // método que adiciona um elemento na linha da tabela, sendo que o usuário precisa especificar a posicao dessa linha na tabela.
    public void addElementIndex(int posicao, ProjetoPesquisa entidade){
        ProjetoPesquisaTableModel.lista.add(posicao, entidade);
        this.fireTableDataChanged();
    }
    
    //metodo que remove de uma posicao em especifica da linha todas informações.
    public void removeElement(int posicao)
    {
        ProjetoPesquisaTableModel.lista.remove(posicao);
        this.fireTableDataChanged();
    }
    
    //metodo responsavel por limpar as informações da nossa tabela.
    public void clearTable()
    {
        ProjetoPesquisaTableModel.lista.clear();
        this.fireTableDataChanged();
    }
    
    //metodo responsável por atualizar a lista coma as informações da base de dados.
    public void updateTableList(List<ProjetoPesquisa> lista)
    {
        ProjetoPesquisaTableModel.lista.clear();
        ProjetoPesquisaTableModel.lista.addAll(lista);
        this.fireTableDataChanged();
    }
}
