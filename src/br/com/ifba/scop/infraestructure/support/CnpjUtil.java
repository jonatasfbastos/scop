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
public final class CnpjUtil {
    /**
     * Represents the singleton instance of the class.
     */
    
    private static final int[] pesoCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
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
    
   
    //verifica se o campo não está preenchido com números.
    public boolean isCNPJEmpty(String campo)
    {
        return campo.equals("  .   .   /    -  ");
    }
    //verifica se o campo do cnpj está com números de sequencia repetidas;
    public boolean isCPNJNumbersInvalid(String campo)
    {
        return  campo.equals("00.000.000/0000-00") ||
                campo.equals("11.111.111/1111-11") || 
                campo.equals("22.222.222/2222-22") ||
                campo.equals("33.333.333/3333-33") ||
                campo.equals("44.444.444/4444-44") ||
                campo.equals("55.555.555/5555-55") ||
                campo.equals("66.666.666/6666-66") ||
                campo.equals("77.777.777/7777-77") ||
                campo.equals("88.888.888/8888-88") ||
                campo.equals("99.999.999/9999-99") ||
                campo.length() != 14;
    }
}
