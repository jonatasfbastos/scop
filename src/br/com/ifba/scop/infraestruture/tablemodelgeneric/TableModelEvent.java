/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestruture.tablemodelgeneric;

import java.util.EventObject;



/**
 * Classe de manitoramento dos eventos da JTable
 * @author mvictor
 */
public class TableModelEvent extends EventObject{
    
    public static final int INSERIR= 1;
    public static final int ATUALIZAR = 0;
    public static final int DELETAR = -1;
    
    public static final int CABECA_LINHA = -1;
    public static final int TODAS_COLUNAS = -1;
    
    private int tipo;
    private int primeiraLinha;
    private int ultimaLinha;
    private int coluna;
    
    public TableModelEvent(TableModel modelo) {
         this(modelo, 0, Integer.MAX_VALUE, TODAS_COLUNAS, ATUALIZAR);
    }
     
    
    public TableModelEvent(TableModel modelo, int linha) {
         this(modelo, linha, linha, TODAS_COLUNAS, ATUALIZAR);
    }
     
  
    public TableModelEvent(TableModel modelo, int primeiraLinha, int ultimaLinha) {
         this(modelo, primeiraLinha, ultimaLinha, TODAS_COLUNAS, ATUALIZAR);
    }
     
     
    public TableModelEvent(TableModel modelo, int primeiraLinha, int ultimaLinha, int coluna) {
         this(modelo, primeiraLinha, ultimaLinha, coluna, ATUALIZAR);
    }
     
  
    public TableModelEvent(TableModel modelo, int primeiraLinha, int ultimaLinha, int coluna, int tipo) {
         super(modelo);
         this.primeiraLinha = primeiraLinha;
         this.ultimaLinha = ultimaLinha;
         this.coluna = coluna;
         this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public int getPrimeiraLinha() {
        return primeiraLinha;
    }

    public int getUltimaLinha() {
        return ultimaLinha;
    }

    public int getColuna() {
        return coluna;
    }
  
  
   
    
}
