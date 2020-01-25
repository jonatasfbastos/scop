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
//  lista de pesquisadores (responsaveis)
/* @ManyToMany(mappedBy = "gruposPesquisa")
    private List<ProjetoPesquisa> projetoPesquisas;
    */
    
    @Column(name= "NOME", length=100, nullable=false) //not null
    private String nome;
    
    @Column(name="ATIVIDADE_GRUPO", length=100, nullable=false) //not null
    private String atividadeGrupo;
    
    @Column(name="LINHA_PESQUISA", length=100, nullable=false) //not null
    private String linhaPesquisa;
    
    @Column(name="PALAVRA_CHAVE", length=100, nullable=false) //not null
    private String palavraChave;
    
    @Column(name="AREA_CONHEC", length=100, nullable=false) //not null
    private String areaConhecimento;
    
    @Column(name="SUBAREA", length=100, nullable=false) //not null
    private String subarea;
    
    @Column(name="LOCAL", length=100, nullable=false) //not null
    private String local;
    
    @Column(name="RESUMO_ATV", length=100, nullable=false) //not null
    private String resumoAtividades;
    
    @Column(name="RESULTADOS_ESP", length=100, nullable=false) //not null
    private String resultadosEsperados;
    
    @Column(name="INFRAESTRUTURA", length=100, nullable=false) //not null
    private boolean infraEstrutura;
    
    @Column(name="DESCRICAO_IE", length=100, nullable=false) //not null
    private String descricaoIE;
    
    @Column(name="COMENTARIOS_ADD", length=100, nullable=false) //not null
    private String comentariosAdicionais;
    
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
