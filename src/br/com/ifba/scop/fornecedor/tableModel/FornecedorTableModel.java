/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.fornecedor.tableModel;

import br.com.ifba.scop.fornecedor.model.Fornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mvictor
 */
public class FornecedorTableModel extends AbstractTableModel implements IFornecedorTableModel{

    //escreve o nome das linhas de acordo a linha
    @Override
    public String getColumnName(int linhas)
    {
        return FornecedorTableModel.colunas[linhas];
    }
    
    //retorna o numero de linhas
    @Override
    public int getRowCount() {
        return FornecedorTableModel.listaFornecedor.size();
    }

    //retorna o numero de colunas
    @Override
    public int getColumnCount() {
        return FornecedorTableModel.colunas.length;
    }
    
    //metodo retorna a cada coluna um valor de acordo com a especificação da coluna.
    @Override
    public Object getValueAt(int linhas, int colunas) {
       switch(colunas)
       {
            case 0:
                return FornecedorTableModel.listaFornecedor.get(linhas).getNomeFantasia();
            case 1:
                return FornecedorTableModel.listaFornecedor.get(linhas).getRazaoSocial();
            case 2:
                return FornecedorTableModel.listaFornecedor.get(linhas).getCnpj();
            case 3:
                return FornecedorTableModel.listaFornecedor.get(linhas).getInscricaoEstadual();
       }
       return null;
    }
    
     // método que adiciona um elemento na linha da tabela.
    public void addElement(Fornecedor entidade)
    {
        FornecedorTableModel.listaFornecedor.add(entidade);
        this.fireTableDataChanged();
    }
    
    // método que adiciona um elemento na linha da tabela, sendo que o usuário precisa especificar a posicao dessa linha na tabela.
    public void addElementIndex(int posicao, Fornecedor entidade){
        FornecedorTableModel.listaFornecedor.add(posicao, entidade);
        this.fireTableDataChanged();
    }
    
    //metodo que remove de uma posicao em especifica da linha todas informações.
    public void removeElement(int posicao)
    {
        FornecedorTableModel.listaFornecedor.remove(posicao);
        this.fireTableDataChanged();
    }
    
    //metodo responsavel por limpar as informações da nossa tabela.
    public void clearTable()
    {
        FornecedorTableModel.listaFornecedor.clear();
        this.fireTableDataChanged();
    }
    
    //metodo responsável por atualizar a lista coma as informações da base de dados.
    public void updateTableList(List<Fornecedor> lista)
    {
        FornecedorTableModel.listaFornecedor.clear();
        FornecedorTableModel.listaFornecedor.addAll(lista);
        this.fireTableDataChanged();
    }
    
}
