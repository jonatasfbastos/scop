/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author beatriz
 */
@Entity
public class GrupoPesquisa extends AbstractEntity implements Serializable {

    /*
    @ManyToMany(mappedBy = "gruposPesquisa")
    private List<ProjetoPesquisa> projetoPesquisas;
    */
    
//  private int identificacao;
    private String nome;
//  private String departamento;
//  identificacao do grupo de pesquisa (integrantes)
// herdar de pesquisador
// herdar de alunos ou pesquisador (integrantes)
    private String atividadeGrupo;
    private String linhaPesquisa;
    private String palavraChave;
    private String areaConhecimento;
    private String subarea;
    private String local;
//  lista private String projetosExecucao;
    private String resumoAtividades;
    private String resultadosEsperados;
    private boolean infraEstrutura;
    private String descricaoIE;
// lista de equipes cooperantes
// lista de projetos
    private String comentariosAdicionais;
//  lista de pesquisadores (responsaveis)
    
    //métodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtividadeGrupo() {
        return atividadeGrupo;
    }

    public void setAtividadeGrupo(String atividadeGrupo) {
        this.atividadeGrupo = atividadeGrupo;
    }

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    public void setLinhaPesquisa(String linhaPesquisa) {
        this.linhaPesquisa = linhaPesquisa;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public String getSubarea() {
        return subarea;
    }

    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getResumoAtividades() {
        return resumoAtividades;
    }

    public void setResumoAtividades(String resumoAtividades) {
        this.resumoAtividades = resumoAtividades;
    }

    public String getResultadosEsperados() {
        return resultadosEsperados;
    }

    public void setResultadosEsperados(String resultadosEsperados) {
        this.resultadosEsperados = resultadosEsperados;
    }

    public boolean isInfraEstrutura() {
        return infraEstrutura;
    }

    public void setInfraEstrutura(boolean infraEstrutura) {
        this.infraEstrutura = infraEstrutura;
    }

    public String getDescricaoIE() {
        return descricaoIE;
    }

    public void setDescricaoIE(String descricaoIE) {
        this.descricaoIE = descricaoIE;
    }

    public String getComentariosAdicionais() {
        return comentariosAdicionais;
    }

    public void setComentariosAdicionais(String comentariosAdicionais) {
        this.comentariosAdicionais = comentariosAdicionais;
    }
}
