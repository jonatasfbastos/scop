/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.fornecedor.service;

import br.com.ifba.scop.fornecedor.model.Fornecedor;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface IServiceFornecedor {
    // Metodo que salva um Grupo de Pesquisa na base de dados
    public abstract Fornecedor  saveFornecedor (Fornecedor  fornecedor);
    // Metodo que atualiza um Grupo de Pesquisa que já existe na base de dados
    public abstract Fornecedor  updateFornecedor  (Fornecedor  fornecedor);
    // Metodo que deleta um Grupo de Pesquisa da base de dados
    public abstract void deleteFornecedor (Fornecedor  fornecedor);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<Fornecedor> getAllFornecedor ();
    // Método que retorna um Grupo de Pesquisa pelo Id
    public abstract Fornecedor  getByIdFornecedor (Long id);
    // Metodo que busca um Grupo de Pesquisa na base de dados através do nome
    public abstract List<Fornecedor> findByFornecedor  (String titulo);
}
