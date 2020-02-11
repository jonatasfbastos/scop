/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.support;

/**
 *
 * @author mvictor
 */
public interface ICNPJ {
    
    public static final int[] pesoA = new int[]{6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final int[] pesoB = new int[]{5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9};
    public abstract boolean cnpjIsValid(String cnpj);
    public abstract String removerCaracteres(final String cnpj);
    
}
