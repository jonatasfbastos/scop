/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.service;

import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
*  Classe responsável por criar  o modelo de tabela para a interface, que
* irá listar todos os dados concernentes a pesquisa etc...
* @author  Mvictor.
*/
public class TableModel extends AbstractTableModel implements ITableModel{
    
    
    
    /**
     * Método que retorna o nome da coluna.
     * @param linha - a coordenada da linha da coluna, onde será setado os titulo de cada coluna.
     * @return  getColumnName(int linha) - retorna na linha o nome de cada coluna, configurado na classe ItableModel.
     * @see ITableModel
     */
    
    @Override
    public String getColumnName(int linha)
    {
        return this.colunas[linha];
    }
    
    /**
     * Método que retorna o número de linhas da tabela.
     * @return getRowCOunt() - Retorna o número de linhas da tabela.
     */
    @Override
    public int getRowCount() {
        return this.linha.size();
    }
    
    /**
     * Método que retorna o número de coluna da tabela.
     * @return getColumnCount() - Retorna o número de colunas da tabela.
     */
    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }
    
    /**
     * Método encabido em construir a nossa tabela, e inserir nela as informações,
     * de acordo com a coluna.
     * @param - linhas - A linha da tabela que será inserida a informação.
     * @param  - Colunas - A coluna da tabela que será inserida a informação.
     */
    @Override
    public Object getValueAt(int linhas, int colunas) {
        switch(colunas)
        {
            case 0:
                return this.linha.get(linhas).getId();
            case 1:
                return this.linha.get(linhas).getTitulo();
        }
        return null;
    }
    
    /**
     * Método responsável por adicionar um novo ELemento na tabela.
     * @param - item - a instancia Entity 
     */
    public void adicionarItemNaTabela(ProjetoPesquisa item)
    {
        this.linha.add(item);
        this.fireTableDataChanged();
    }
    
    /**
     * Método responsável por adicionar um novo ELemento na tabela, 
     * sendo que, será necessário especificar a posição no qual, se que adicionar.
     * @param - item - a instancia Entity 
     */
    public void adicionarItemNaTabela(int posicao, ProjetoPesquisa item)
    {
        this.linha.add(posicao, item);
        this.fireTableDataChanged();
    }
    
    
    /**
     * Método que remova uma linha da tabela por do index dessa linha.
     * @param posicao - a posição da linha.
     */
    public void removerLinhaDaTabela(int posicao)
    {
        this.linha.remove(posicao);
        this.fireTableDataChanged();
    }
    
    /**
     * Método responsável por limparTabela a tabela.
     */
    public void limparTabela()
    {
        this.linha.clear();
        this.fireTableDataChanged();
    }
    
    /**
     * Método que atualiza as informações da tabela recebendo com paramentro uma lista.
     * @param lista - a lista contendo os dados.
     */
    public void atualizarListaTabela(List<ProjetoPesquisa> lista)
    {
        this.linha.clear();
        this.linha.addAll(lista);
        this.fireTableDataChanged();
    }
    
    
}
