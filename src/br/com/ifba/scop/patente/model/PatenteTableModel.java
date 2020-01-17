/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Model for a JTable.
 * @author abel
 */
public class PatenteTableModel extends AbstractTableModel {
    
    private final List<Patente> data = new ArrayList<>();
    private final String[] columns = {"ID","Número","Título","Área","Dia","Mês","Ano"};

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

    @Override
    public Object getValueAt(int line, int col) {
        switch (col) {
            case 0:
                return data.get(line).getId();
            case 1:
                return this.data.get(line).getNumero();
            case 2:
                return this.data.get(line).getTituloInvencao();
            case 3:
                return this.data.get(line).getAreaInvencao();
            case 4:
                return this.data.get(line).getDia();
            case 5:
                return this.data.get(line).getMes();
            case 6:
                return this.data.get(line).getAno();
        }
        return null;
    }
    
    /**
     * Inserts a new line.
     * @param patente Patente Object
     */
    public void addRow(Patente patente) {
        this.data.add(patente);
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
    
}
