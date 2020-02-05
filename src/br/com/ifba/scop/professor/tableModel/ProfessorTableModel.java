/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.tableModel;

import br.com.ifba.scop.professor.model.Professor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bessa
 *
 */
public class ProfessorTableModel extends AbstractTableModel implements IProfessorTableModel{

    
    //metódo que retorna o nomes de cada colunas.
    
    @Override
    public String getColumnName(int linhas){
        return ProfessorTableModel.colunas[linhas];
    }
    
    //metodo que retorn o número de linhas da tabela.
    @Override
    public int getRowCount() {
        return ProfessorTableModel.lista.size();
    }

    /**
    * Método que retorna o numero de colunas
    */
    @Override
    public int getColumnCount() {
        return ProfessorTableModel.colunas.length;
    }
    
    //metodo que set os valores das linhas, baseado com a coluna.
    @Override
    public Object getValueAt(int linhas, int colunas) {
        switch(colunas){
            case 0: 
                return ProfessorTableModel.lista.get(linhas).getNome();
            case 1:
                return ProfessorTableModel.lista.get(linhas).getTitulacao();
            case 2:
                return ProfessorTableModel.lista.get(linhas).getMatricula();
            case 3:
                return ProfessorTableModel.lista.get(linhas).getEmail();
        }
        return null;
    }

    // método que adiciona um elemento na linha da tabela.
    public void addElement(Professor entidade){
        ProfessorTableModel.lista.add(entidade);
        this.fireTableDataChanged();
    }
    
    // método que adiciona um elemento na linha da tabela, sendo que o usuário precisa especificar a posicao dessa linha na tabela.
    public void addElementIndex(int posicao, Professor entidade){
        ProfessorTableModel.lista.add(posicao, entidade);
        this.fireTableDataChanged();
    }
    
    //metodo que remove de uma posicao em especifica da linha todas informações.
    public void removeElement(int posicao){
        ProfessorTableModel.lista.remove(posicao);
        this.fireTableDataChanged();
    }
    
    //metodo responsavel por limpar as informações da nossa tabela.
    public void clearTable(){
        ProfessorTableModel.lista.clear();
        this.fireTableDataChanged();
    }
    
    //metodo responsável por atualizar a lista coma as informações da base de dados.
    public void updateTableList(List<Professor> lista){
        ProfessorTableModel.lista.clear();
        ProfessorTableModel.lista.addAll(lista);
        this.fireTableDataChanged();
    }
}
