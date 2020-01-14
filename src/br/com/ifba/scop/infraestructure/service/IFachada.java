package br.com.ifba.scop.infraestructure.service;

import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;


public interface IFachada {
    
    //------------- ProjetoPesquisa ----------------------
    
    // Metodo que salva um Projeto de Pesquisa na base de dados
    public abstract ProjetoPesquisa saveProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que atualiza um Projeto de Pesquisa que já existe na base de dados
    public abstract ProjetoPesquisa updateProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que deleta um Projeto de Pesquisa da base de dados
    public abstract void deleteProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que retorna todos os Projeto de Pesquisa da base de dados
    public abstract List<ProjetoPesquisa> getAll();
    // Metodo que busca um Projeto de Pesquisa na base de dados através do titulo
    public abstract ProjetoPesquisa findByTitulo (ProjetoPesquisa projetoPesquisa);
    // Metodo que verifica se o Projeto de Pesquisa já existe na base de dados
    public abstract boolean projetoExistente (ProjetoPesquisa projetoPesquisa);
    // Metodo que valida o Projeto de Pesquisa 
    public abstract boolean validaProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    
    
    
    
  
    
    // ---------- Patente
    // valida savePatente
    public abstract void savePatente(Patente patente);
    // valida updatePatente
    public abstract void updatePatente(Patente patente);
    // valida deletePatente
    public abstract void deletePatente(Patente patente);
}