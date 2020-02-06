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
public final class InscricaoUFUtil {
    
    private static InscricaoUFUtil instance;
    
    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();

    /**
     * Create a new instance of the class.
     */
    private InscricaoUFUtil() {
        super();
    }

    /**
     * Instantiates a new {@link StringUtil}.
     * 
     * @return the instance.
     */
    public static InscricaoUFUtil getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new InscricaoUFUtil();
            }
        }
        return instance;
    }
    
    public boolean isEmpty(String campo)
    {
        return campo.equals("      -  ");
    }
    
    public boolean isInscricaoUFJNumbersInvalid(String campo)
    {
        return  campo.equals("000.000-00") ||
                campo.equals("111.111-11") || 
                campo.equals("222.222-22") ||
                campo.equals("333.333-33") ||
                campo.equals("444.444-44") ||
                campo.equals("555.555-55") ||
                campo.equals("666.666-66") ||
                campo.equals("777.777-77") ||
                campo.equals("888.888-88") ||
                campo.equals("999.999-99") ||
                campo.length()!= 14;
    }
    
}
