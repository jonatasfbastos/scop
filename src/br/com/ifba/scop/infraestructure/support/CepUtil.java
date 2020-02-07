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
public final class CepUtil {
    private static CepUtil instance;
    
    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();

    /**
     * Create a new instance of the class.
     */
    private  CepUtil() {
        super();
    }

    /**
     * Instantiates a new {@link StringUtil}.
     * 
     * @return the instance.
     */
    public static  CepUtil getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new  CepUtil();
            }
        }
        return instance;
    }
    
    public boolean isCepEmpty(String campo)
    {
        return campo.equals("  .   -   ");
    }
    
    public boolean isCepNumbersInvalid(String campo)
    {
        return  campo.equals("00.000-000") ||
                campo.equals("11.111-111") || 
                campo.equals("22.222-222") ||
                campo.equals("33.333-333") ||
                campo.equals("44.444-444") ||
                campo.equals("55.555-555") ||
                campo.equals("66.666-666") ||
                campo.equals("77.777-777") ||
                campo.equals("88.888-888") ||
                campo.equals("99.999-999") ||
                campo.length()!= 10;
    }
    
}
