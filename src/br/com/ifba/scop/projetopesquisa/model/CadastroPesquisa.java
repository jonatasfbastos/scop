/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;

/**
 * Classe para cadastro de pesquisa
 * @author abel, gislaine, bessa.
 */
public class CadastroPesquisa extends AbstractEntity {
    
    // dados coordenador.
    private String coordenador;
    private String email;
    private Long telefone;

    // Metodo construtor
    public CadastroPesquisa() {
        super();
    }
    
    
    // Campus que o pesquisador pertence
    private String campus;
    
    // dados grupo e projeto
    private String grupoPesquisa;
    
    // Dados do tema da pesquisa
    private String tituloProjeto;
    private String subArea;
    private String linhaPesquisa;
    
    // Datas de inicio e término
    private int diaInicio, mesInicio, anoInicio;
    private int diaTermino, mesTermino, anoTermino;
    
    // Financiamento do projeto
    private boolean financiamento;
    private String fonteFinanciamento;
    
    //
    private String viabilidadeTecnica;
    
    // local de realização do projeto
    private String localProjeto;
    
    // variáveis de assinatura
    private String cidade;
    private int dia, ano;
    private String mes;
    
    // equipe executora - atributos
    private String nomeExecutor;
    private String titulacao;
    private String vinculo;

    
    // ########## GETTERS AND SETTERS
    public String getCordenador() {
        return coordenador;
    }

    public void setCordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getGrupoPesquisa() {
        return grupoPesquisa;
    }

    public void setGrupoPesquisa(String grupoPesquisa) {
        this.grupoPesquisa = grupoPesquisa;
    }

    public String getTituloProjeto() {
        return tituloProjeto;
    }

    public void setTituloProjeto(String tituloProjeto) {
        this.tituloProjeto = tituloProjeto;
    }

    public String getSubAria() {
        return subArea;
    }

    public void setSubAria(String subArea) {
        this.subArea = subArea;
    }

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    public void setLinhaPesquisa(String linhaPesquisa) {
        this.linhaPesquisa = linhaPesquisa;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getDiaTermino() {
        return diaTermino;
    }

    public void setDiaTermino(int diaTermino) {
        this.diaTermino = diaTermino;
    }

    public int getMesTermino() {
        return mesTermino;
    }

    public void setMesTermino(int mesTermino) {
        this.mesTermino = mesTermino;
    }

    public int getAnoTermino() {
        return anoTermino;
    }

    public void setAnoTermino(int anoTermino) {
        this.anoTermino = anoTermino;
    }

    public boolean isFinanciamento() {
        return financiamento;
    }

    public void setFinanciamento(boolean financiamento) {
        this.financiamento = financiamento;
    }

    public String getFonteFinanciamento() {
        return fonteFinanciamento;
    }

    public void setFonteFinanciamento(String fonteFinanciamento) {
        this.fonteFinanciamento = fonteFinanciamento;
    }

    public String getViabilidadeTecnica() {
        return viabilidadeTecnica;
    }

    public void setViabilidadeTecnica(String viabilidadeTecnica) {
        this.viabilidadeTecnica = viabilidadeTecnica;
    }

    public String getLocalProjeto() {
        return localProjeto;
    }

    public void setLocalProjeto(String localProjeto) {
        this.localProjeto = localProjeto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
    
}
