package br.com.ifba.scop.infraestructure.service;

import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.patente.service.IServicePatente;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.service.IServiceProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa;
import java.util.List;


public class Fachada implements IFachada {
    
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
    public List<ProjetoPesquisa> getAll() {
        return this.serviceProjeto.getAll();
    }

    @Override
    public ProjetoPesquisa findByTitulo(ProjetoPesquisa projetoPesquisa) {
        return this.serviceProjeto.findByTitulo(projetoPesquisa);
    }



    
    
    // ---- Patente
    private final IServicePatente servicePatente =
            new br.com.ifba.scop.patente.service.ServicePatente();
    /**
     * This method sent information for allow or not save operation.
     * @param patente Patente Object.
     */
    @Override
    public boolean savePatente(Patente patente) {
        return this.servicePatente.savePatente(patente);
    }
    /**
     * This method sent information for allow or not update operation.
     * @param patente Patente Object.
     */
    @Override
    public void updatePatente(Patente patente) {
        this.servicePatente.updatePatente(patente);
    }
    /**
     * This method sent information for allow or not delete operation.
     * @param patente Patente Object.
     */
    @Override
    public void deletePatente(Patente patente) {
        this.servicePatente.deletePatente(patente);
    }
    
}