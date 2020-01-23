package br.com.ifba.scop.infraestructure.service;

import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;


public interface IFachada {
    
    // ---------- Patente ----------------------------------
    // valida savePatente
    public abstract boolean savePatente(Patente patente);
    // valida updatePatente
    public abstract boolean updatePatente(Patente patente);
    // valida deletePatente
    public abstract boolean deletePatente(Patente patente);
    // esse metodo retorna todas as patentes registradas
    public abstract List<Patente> getAllPatente();
    // esse metodo retorna pela area - pesquisa
    public abstract List<Patente> searchPatenteArea(Patente patente);
    // esse metodo retorna pelo titulo - pesquisa
    public abstract List<Patente> searchPatenteTitle(Patente patente);
    // esse metodo retorna pelo numero - pesquisa
    public abstract List<Patente> searchPatenteNumber(Patente patente);
    
    // ----------------------------- Pesquisador -------------------------
    
    // Metodo que salva um Projeto de Pesquisa na base de dados
    public abstract Pesquisador savePesquisador (Pesquisador  pesquisador );
    // Metodo que atualiza um Projeto de Pesquisa que já existe na base de dados
    public abstract Pesquisador updatePesquisador  (Pesquisador  pesquisador);
    // Metodo que deleta um Projeto de Pesquisa da base de dados
    public abstract void deletePesquisador  (Pesquisador  pesquisador);
    // Metodo que retorna todos os Projeto de Pesquisa da base de dados
    public abstract List<Pesquisador> getAllPesquisador();
    // Metodo que busca um Projeto de Pesquisa na base de dados através do nome
    public abstract Pesquisador findByMatricula(String matricula);
    
    //------------- ProjetoPesquisa ----------------------
    
    // Metodo que salva um Projeto de Pesquisa na base de dados
    public abstract ProjetoPesquisa saveProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que atualiza um Projeto de Pesquisa que já existe na base de dados
    public abstract ProjetoPesquisa updateProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que deleta um Projeto de Pesquisa da base de dados
    public abstract void deleteProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que retorna todos os Projeto de Pesquisa da base de dados
    public abstract List<ProjetoPesquisa> getAllProjetos();
    // Método que retorna um ProjetoPesquisa pelo Id
    public abstract ProjetoPesquisa getByIdProjeto(Long id);
    // Metodo que busca um Projeto de Pesquisa na base de dados através do titulo
    public abstract List<ProjetoPesquisa> findByTitulo (String titulo);
}