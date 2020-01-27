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
 * Column edit.
 * @author Abel
 */
public class ColumnEditLabel extends AbstractCellEditor implements 
        TableCellRenderer, TableCellEditor, ActionListener {
    private final JTable table;
    private final JLabel editar;
    private String text;
    
    /**
     * Builder.
     * @param table JTable
     * @param column Integer
     */
    public ColumnEditLabel(JTable table, int column) {
        super(); // super class
        // table was assign
        this.table = table;
        // editar label to: delete a edite a register from database
        final String path1 =
                "/br/com/ifba/scop/projetopesquisa/view/imagens/icon_editarr.png";
        ImageIcon icon1 = new ImageIcon(getClass().getResource(path1));
        this.editar = new JLabel("Editar");
        this.editar.setIcon(icon1);
        this.editar.setForeground(Color.blue);
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
        return this.editar;
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
        this.editar.setText(text);
        return this.editar;
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
