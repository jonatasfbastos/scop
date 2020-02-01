/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Model for a JTable.
 * @author abel
 */
public class PesquisadorTableModel extends AbstractTableModel {
    private final List<Pesquisador> data = new ArrayList<>();
    private final String[] columns = {"Nome","Matrícula","Titulação","E-mail","Deletar", "Editar"};

    /**
     * Inserts column name.
     * @param column Integer
     * @return String
     */
    @Override
    public String getColumnName(int column) {
        return this.columns[column];
    }

    /**
     * Row Number.
     * @return Integer
     */
    @Override
    public int getRowCount() {
        return this.data.size();
    }

    /**
     * Column number.
     * @return Integer
     */
    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    /**
     * When updates, it is for insert column by column.
     * @param line
     * @param col
     * @return 
     */
    @Override
    public Object getValueAt(int line, int col) {
        switch (col) {
            case 0:
                return data.get(line).getNome();
            case 1:
                return this.data.get(line).getMatricula();
            case 2:
                return this.data.get(line).getTitulação();
            case 3:
                return this.data.get(line).getEmail();
        }
        return null;
    }
    
    /**
     * Inserts a new line.
     * @param pesquisador
     * @param line Line number
     */
    public void addRow(Pesquisador pesquisador, int line) {
        // creating icon
        this.data.add(pesquisador);
        this.fireTableDataChanged(); // atualiza tabela
    }
    
    /**
     * Removes a single row.
     * @param indx Integer
     */
    public void removeRow(int indx) {
        this.data.remove(indx);
        this.fireTableRowsDeleted(indx, indx);
    }
    
    /**
     * Cleans the JTable.
     */
    public void removeAllRows() {
        int end = this.getRowCount();
        this.data.clear();
        this.fireTableRowsDeleted(0, end);
    }
    
    public void updateTableList(List<Pesquisador> data){
        this.data.clear();
        this.data.addAll(data);
        this.fireTableDataChanged();
    }
}
