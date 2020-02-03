/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.model;

//inports 
import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import br.com.ifba.scop.patente.model.Patente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * clase para gerar pesquisadores.
 * @author Gusdb
 */

@Entity
public class Pesquisador extends AbstractEntity implements Serializable {
    
    // atributos
    private String nome;
    private String matricula;
    private String titulação;
    private String Instituição;
    private String cpf;
    private String locação;
    private String rg;
    private String orgaoEmisor;
    private String email;
    private String nda;
    // chave estangueira // coloco o nome do atributo que usei em Patente e o tipo de relacionamento
    @OneToMany (mappedBy = "pesquisador")
    private List<Patente> patentes = new ArrayList<Patente>();
    // devera conter tambem endereço, data de emisão do RG e telefone
    
    //Construtor
    public Pesquisador() {
        super();
    }
    
    
    //metodos sets e gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTitulação() {
        return titulação;
    }

    public void setTitulação(String titulação) {
        this.titulação = titulação;
    }

    public String getInstituição() {
        return Instituição;
    }

    public void setInstituição(String Instituição) {
        this.Instituição = Instituição;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLocação() {
        return locação;
    }

    public void setLocação(String locação) {
        this.locação = locação;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmisor() {
        return orgaoEmisor;
    }

    public void setOrgaoEmisor(String orgaoEmisor) {
        this.orgaoEmisor = orgaoEmisor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // getter e setter que se refere a chave estrangueira

//    public List<Patente> getPatentes() {
//        return patentes;
//    }

    public void setPatentes(List<Patente> patentes) {
        this.patentes = patentes;
    }
    
}
