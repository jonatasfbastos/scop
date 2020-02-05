/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.support;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mvictor
 */
public class CnpjUtil {
    /**
     * Represents the singleton instance of the class.
     */
    private static CnpjUtil instance;
    private static final String CNPJ_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static Pattern pattern;
    private Matcher matcher;
    
    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();

    /**
     * Create a new instance of the class.
     */
    private CnpjUtil() {
        super();
        pattern = Pattern.compile(CNPJ_REGEX, Pattern.CASE_INSENSITIVE);
    }

    /**
     * Instantiates a new {@link StringUtil}.
     * 
     * @return the instance.
     */
    public static CnpjUtil getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new CnpjUtil();
            }
        }
        return instance;
    }

    public boolean isEmailValid(String Campo)
    {
       matcher = pattern.matcher(Campo);
       return matcher.matches();
    }
}
