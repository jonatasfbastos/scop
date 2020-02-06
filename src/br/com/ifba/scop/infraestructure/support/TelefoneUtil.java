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
    
    public boolean isTelNumbersInvalid(String campo)
    {
        return campo.equals("(00)-0-0000-0000")||
               campo.equals("(11)-1-1111-1111")||
               campo.equals("(22)-2-2222-2222")||
               campo.equals("(33)-3-3333-3333")||
               campo.equals("(44)-4-4444-4444")||
               campo.equals("(55)-5-5555-5555")||
               campo.equals("(666)-6-6666-6666")||
               campo.equals("(11)-1-1111-1111")||
               campo.equals("(11)-1-1111-1111")||
               campo.equals("(11)-1-1111-1111")||
               campo.length()!= 16;
    }
    
}
