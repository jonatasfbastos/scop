package br.com.ifba.scop.infraestructure.service;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.grupopesquisa.service.IServiceGrupoPesquisa;
import br.com.ifba.scop.grupopesquisa.service.ServiceGrupoPesquisa;
import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.patente.service.IServicePatente;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import br.com.ifba.scop.pesquisador.service.IServicePesquisador;
import br.com.ifba.scop.pesquisador.service.ServicePesquisador;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.service.IServiceProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa;
import java.security.Provider.Service;
import java.util.List;


public class Fachada implements IFachada {
    
    //---------------- Grupo de Pesquisa --------------------//
    
    private final IServiceGrupoPesquisa serviceGrupo = new ServiceGrupoPesquisa();
    
    @Override
    public GrupoPesquisa saveGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
        return this.serviceGrupo.saveGrupoPesquisa(grupoPesquisa);
    }

    @Override
    public GrupoPesquisa updateGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
        return this.serviceGrupo.updateGrupoPesquisa(grupoPesquisa);
    }

    @Override
    public void deleteGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
        this.serviceGrupo.deleteGrupoPesquisa(grupoPesquisa);
    }

    @Override
    public List<GrupoPesquisa> getAllGrupoPesquisa() {
        return this.serviceGrupo.getAllGrupoPesquisa();
    }

    @Override
    public GrupoPesquisa getByIdGrupoPesquisa(Long id) {
        return this.serviceGrupo.getByIdGrupoPesquisa(id);
    }

    @Override
    public List<GrupoPesquisa> findByNomeGrupoPesquisa(String titulo) {
        return this.serviceGrupo.findByNomeGrupoPesquisa(titulo);
    }
    
    
    //------------PROJETO PESQUISA-------------
    
    private final IServiceProjetoPesquisa serviceProjeto = new ServiceProjetoPesquisa();
    
    @Override
    public ProjetoPesquisa saveProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        return this.serviceProjeto.saveProjetoPesquisa(projetoPesquisa);
    }

    @Override
    public ProjetoPesquisa updateProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        return this.serviceProjeto.updateProjetoPesquisa(projetoPesquisa);
    }

    @Override
    public void deleteProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        this.serviceProjeto.deleteProjetoPesquisa(projetoPesquisa);
    }

    @Override
    public List<ProjetoPesquisa> getAllProjetos() {
        return this.serviceProjeto.getAllProjetos();
    }
    
    @Override
    public ProjetoPesquisa getByIdProjeto(Long id) {
        return this.serviceProjeto.getByIdProjeto(id);
    }

    @Override
    public List<ProjetoPesquisa> findByTitulo(String titulo) {
        return this.serviceProjeto.findByTitulo(titulo);
    }



    
    
    // ---- Patente ------------------------------------------------------------
    private final IServicePatente servicePatente =
            new br.com.ifba.scop.patente.service.ServicePatente();
    /**
     * This method sent information for allow or not save operation.
     * @param patente Patente Object.
     * @return Boolean
     */
    @Override
    public boolean savePatente(Patente patente) {
        return this.servicePatente.savePatente(patente);
    }
    /**
     * This method sent information for allow or not update operation.
     * @param patente Patente Object.
     * @return Boolean
     */
    @Override
    public boolean updatePatente(Patente patente) {
        return this.servicePatente.updatePatente(patente);
    }
    /**
     * This method sent information for allow or not delete operation.
     * @param patente Patente Object.
     * @return Boolean
     */
    @Override
    public boolean deletePatente(Patente patente) {
        return this.servicePatente.deletePatente(patente);
    }
    
    /**
     * This method returns all patentes that was registered inside database.
     * @return A List of Patente instances
     */
    @Override
    public List<Patente> getAllPatente() {
        return this.servicePatente.getAllPatente();
    }
    
    /**
     * This method returns a Patente instance, it's for search by area of 
     * patente.
     * @param patente Patente Instance
     * @return A List of Patente instance
     */
    @Override
    public List<Patente> searchPatenteArea(Patente patente) {
        return this.servicePatente.searchPatenteArea(patente);
    }
    
    /**
     * This method returns the search of a patente by Title.
     * @param patente Patente Object
     * @return A List of Patente Object
     */
    @Override
    public List<Patente> searchPatenteTitle(Patente patente) {
        return this.servicePatente.searchPatenteTitle(patente);
    }
    
    /**
     * This method returns a search by number.
     * @param patente Patente instance
     * @return A List of Patente Instances
     */
    @Override
    public List<Patente> searchPatenteNumber(Patente patente) {
        return this.servicePatente.searchPatenteNumber(patente);
    }
    //--------------------------------------------------------------------------

    //---------------------- [PESQUISADOR] --------------------------------------
    
    IServicePesquisador servicePesquisador = new ServicePesquisador();
    
    @Override
    public Pesquisador savePesquisador(Pesquisador pesquisador) {
        return this.servicePesquisador.savePesquisador(pesquisador);
    }

    @Override
    public Pesquisador updatePesquisador(Pesquisador pesquisador) {
        return this.servicePesquisador.updatePesquisador(pesquisador);
    }

    @Override
    public void deletePesquisador(Pesquisador pesquisador) {
        this.servicePesquisador.deletePesquisador(pesquisador);
    }

    @Override
    public List<Pesquisador> getAllPesquisador() {
        return this.servicePesquisador.getAllPesquisador();
    }

    @Override
    public Pesquisador findByMatricula(String matricula) {
        return this.servicePesquisador.findByMatricula(matricula);
    }

    

}