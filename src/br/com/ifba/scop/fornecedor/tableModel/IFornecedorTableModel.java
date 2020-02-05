/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.fornecedor.tableModel;

import br.com.ifba.scop.fornecedor.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface IFornecedorTableModel {
    
   public List<Fornecedor> listaFornecedor = new ArrayList();
   
   public String[] colunas = new String[]
   {
       "Nome",
       "Razão Social",
       "CNPJ",
       "Inscrição [UF]"
   };
   
    
}
