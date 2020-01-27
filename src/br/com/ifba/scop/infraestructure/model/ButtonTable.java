/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 * This class is for inserts a button inside a cell on JTable.
 * @author Abel
 * @see #ButtonTable
 */
public class ButtonTable extends AbstractCellEditor implements 
        TableCellRenderer, TableCellEditor, ActionListener {
    private final JTable table;
    private final JLabel delete;
    private String text;

    /**
     * Builder.
     * @param table JTable
     * @param column Integer
     */
    public ButtonTable(JTable table, int column) {
        super();
        
        this.table = table;
        
        this.delete = new JLabel("Delete");
        final String path =
                "/br/com/ifba/scop/projetopesquisa/view/imagens/icon_excluirr.png";
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        this.delete.setIcon(icon);
        this.delete.setForeground(Color.blue);
        
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(column).setCellRenderer(this);
        columnModel.getColumn(column).setCellEditor(this);
    }

    @Override
    public Object getCellEditorValue() {
        return this.text;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        return this.delete;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, 
            boolean isSelected, int row, int column) {
        this.text = (value == null) ? "" : value.toString();
        this.delete.setText(text);
        return this.delete;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.fireEditingStopped();
    }
    
}
