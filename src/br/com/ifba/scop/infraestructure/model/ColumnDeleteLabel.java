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
public class ColumnDeleteLabel extends AbstractCellEditor implements 
        TableCellRenderer, TableCellEditor, ActionListener {
    private final JTable table;
    private final JLabel delete;
    private String text;

    /**
     * Builder.
     * @param table JTable
     * @param column Integer
     */
    public ColumnDeleteLabel(JTable table, int column) {
        super(); // super class
        // table was assign
        this.table = table;
        // delete label to: delete a register from database
        this.delete = new JLabel("Delete");
        final String path =
                "/br/com/ifba/scop/projetopesquisa/view/imagens/icon_excluirr.png";
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        this.delete.setIcon(icon);
        this.delete.setForeground(Color.blue);
        // modelo da celula da coluna colocado a disposição
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(column).setCellRenderer(this);
        columnModel.getColumn(column).setCellEditor(this);
    }

    /**
     * Returns the text.
     * @return Object
     */
    @Override
    public Object getCellEditorValue() {
        return this.text;
    }

    /**
     * Delete Renderer.
     * @param table JTabel
     * @param value Object
     * @param isSelected Boolean
     * @param hasFocus Boolean
     * @param row Integer
     * @param column Integer
     * @return Component
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        return this.delete;
    }

    /**
     * It returns a delete JLabel.
     * @param table JTabel
     * @param value Object
     * @param isSelected Boolean
     * @param row Integer
     * @param column Integer
     * @return Component
     */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, 
            boolean isSelected, int row, int column) {
        this.text = (value == null) ? "" : value.toString();
        this.delete.setText(text);
        return this.delete;
    }

    /**
     * Action Event.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.fireEditingStopped();
    }
    
}
