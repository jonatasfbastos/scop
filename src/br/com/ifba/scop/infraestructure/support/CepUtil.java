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
        return campo.equals("  .   -  ");
    }
    
}
