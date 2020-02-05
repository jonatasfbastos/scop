/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author beatriz
 */
@Entity
public class GrupoPesquisa extends AbstractEntity implements Serializable {
    //FALTA VER ISSO AQUI    
//  private int identificacao;
//  private String departamento;
//  identificacao do grupo de pesquisa (integrantes)
// herdar de pesquisador
// herdar de alunos ou pesquisador (integrantes)
//  lista private String projetosExecucao;
// lista de equipes cooperantes
// lista de projetos
//  lista de pesquisadores (responsaveis
    
    @ManyToMany(mappedBy = "gruposPesquisa")
    private List<Pesquisador> pesquisador;
    
    @ManyToMany(mappedBy = "gruposPesquisa")
    private List<ProjetoPesquisa> projetoPesquisas;
    
    
    @Column(name= "nome", length=100, nullable=false) //not null
    private String nome;
    
    @Column(name="atividade_grupo", length=100, nullable=false) //not null
    private String atividadeGrupo;
    
    @Column(name="linha_pesquisa", length=100, nullable=false) //not null
    private String linhaPesquisa;
    
    @Column(name="palavra_chave", length=100, nullable=false) //not null
    private String palavraChave;
    
    @Column(name="area_conhe", length=100, nullable=false) //not null
    private String areaConhecimento;
    
    @Column(name="subarea", length=100, nullable=false) //not null
    private String subarea;
    
    @Column(name="locall", length=100, nullable=false) //not null
    private String local;
    
    @Column(name="resumo_ativ", length=100, nullable=false) //not null
    private String resumoAtividades;
    
    @Column(name="resultados_esp", length=100, nullable=false) //not null
    private String resultadosEsperados;
    
    @Column(name="infraestrutura", length=100, nullable=false) //not null
    private boolean infraEstrutura;
    
    @Column(name="descricao_IE", length=100, nullable=false) //not null
    private String descricaoIE;
    
    @Column(name="comentarios_add", length=100, nullable=false) //not null
    private String comentariosAdicionais;
    
    // Para exibir corretamente nos combosBox que utilizar essa classe
    @Override
    public String toString(){
        return this.nome;
    }
    
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

//    public Collection<ProjetoPesquisa> getProjetoPesquisas() {
//        return projetoPesquisas;
//    }
//
    public void setProjetoPesquisas(List<ProjetoPesquisa> projetoPesquisas) {
        this.projetoPesquisas = projetoPesquisas;
    }
    
}
