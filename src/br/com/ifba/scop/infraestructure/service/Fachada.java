package br.com.ifba.scop.infraestructure.service;

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

    @Override
    public boolean projetoExistente(ProjetoPesquisa projetoPesquisa) {
        return this.serviceProjeto.projetoExistente(projetoPesquisa);
    }

    @Override
    public boolean validaProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        return this.serviceProjeto.validaProjetoPesquisa(projetoPesquisa);
    }


    
    
	

		
}