/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.service;

import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.ArrayList;
import java.util.List;

/**
    *Interface contendo o titulo é a lista da tabela, que será setado, toda vez que for
    * chamado a classe TableModel.
    * @see  TableModel
    * @author mvictor
*/
public interface ITableModel {
    
    
    
    /**
     *@param linhaProjetoPesquisa - Uma lista contendo as informações registradas, dos projetos de pesquisa.
     */
    public List <ProjetoPesquisa> linha = new ArrayList();
    
    /**
     * @param - colunas - O nome de cada coluna corresponde. de acordo com o campo,
     * neste caso cada coluna, seria uma coluna da tabela. nessa coluna tem diversas linhas, com os valores,
     * daquele campo, essa variavel, será usada na TableModel para idenficar o nome daquela,
     * coluna em espécifico, para fácilitar o reconhecimento etc.
     */
    public String colunas[] = new String[]
    {
        "Nome",
        "Titulo",
        "Teste"
    };
    
}
