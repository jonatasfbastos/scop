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
public final class TelefoneUtil {
    private static TelefoneUtil instance;
    
    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();

    /**
     * Create a new instance of the class.
     */
    private  TelefoneUtil() {
        super();
    }

    /**
     * Instantiates a new {@link StringUtil}.
     * 
     * @return the instance.
     */
    public static  TelefoneUtil getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new  TelefoneUtil();
            }
        }
        return instance;
    }
  
    public boolean isEmpty(String campo)
    {
        return campo.equals("(  )- -    -    ");
    }
    
}
