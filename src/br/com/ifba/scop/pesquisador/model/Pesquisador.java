/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author mvictor
 */

@Entity
public class Pesquisador  extends AbstractEntity{
    
    private String Nome;
    private String Titulacao;
    private String Vinculo_Institucional;
    private String Indetificacao;
    
    @OneToMany(mappedBy = "pessoa", orphanRemoval=true)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<ContatoPesquisador> pesquisadorTelefone = new ArrayList<ContatoPesquisador>();
    
    @OneToOne(mappedBy="pessoa", orphanRemoval=true)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<EnderecoPesquisador> enderecoPesquisador = new ArrayList<EnderecoPesquisador>();
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    }

    public String getVinculo_Institucional() {
        return Vinculo_Institucional;
    }

    public void setVinculo_Institucional(String Vinculo_Institucional) {
        this.Vinculo_Institucional = Vinculo_Institucional;
    }

    public String getIndetificacao() {
        return Indetificacao;
    }

    public void setIndetificacao(String Indetificacao) {
        this.Indetificacao = Indetificacao;
    }

    public List<ContatoPesquisador> getPesquisadorTelefone() {
        return pesquisadorTelefone;
    }

    public void setPesquisadorTelefone(List<ContatoPesquisador> pesquisadorTelefone) {
        this.pesquisadorTelefone = pesquisadorTelefone;
    }

    public List<EnderecoPesquisador> getEnderecoPesquisador() {
        return enderecoPesquisador;
    }

    public void setEnderecoPesquisador(List<EnderecoPesquisador> enderecoPesquisador) {
        this.enderecoPesquisador = enderecoPesquisador;
    }
    
}
