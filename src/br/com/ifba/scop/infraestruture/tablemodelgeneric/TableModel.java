package br.com.ifba.scop.infraestruture.tablemodelgeneric;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;

/**
    *Interface contendo o titulo é a lista da tabela, que será setado, toda vez que for
    * chamado a classe TableModel.
    * @see  TableModel
    * @author mvictor
*/
public interface TableModel {
    
   public int getRowCount();
   public int getColumnCount();
   public String getColumnName(int ColunaPosicao);
   public Class<?> getColumnClass(int ColunaPosicao);
   public boolean isCellEditable(int linhaPosicao, int colunaPosicao);
   public Object getValueAt(int linhaPosicao, int colunaPosicao);
   public void setValueAt(Object aValue, int linhaPosicao, int colunaPosicao);
   public void addTableModelListener(TableModelListener listener);
   public void removerTableListener(TableModelListener listener);
    
}
