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
        return campo.equals("       -  ");
    }
    
    public boolean isInscricaoUFNumbersInvalid(String campo)
    {
        return  campo.equals("0000000-00") ||
                campo.equals("1111111-11") || 
                campo.equals("2222222-22") ||
                campo.equals("3333333-33") ||
                campo.equals("4444444-44") ||
                campo.equals("5555555-55") ||
                campo.equals("6666666-66") ||
                campo.equals("7777777-77") ||
                campo.equals("8888888-88") ||
                campo.equals("9999999-99") ||
                campo.length()!= 10;
    }
    
}
