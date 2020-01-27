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
public final class EmailUtils {
    
    /**
     * Represents the singleton instance of the class.
     */
    private static EmailUtils instance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();

    /**
     * Create a new instance of the class.
     */
    private EmailUtils() {
        super();
    }

    /**
     * Instantiates a new {@link StringUtil}.
     * 
     * @return the instance.
     */
    public static EmailUtils getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new EmailUtils();
            }
        }
        return instance;
    }

    public boolean isEmailValid(javax.swing.JTextField Campo)
    {
        return Campo.getText().matches("\\w\\d+@\\w{2,5}+.\\w{2,3}");
    }
    
}
