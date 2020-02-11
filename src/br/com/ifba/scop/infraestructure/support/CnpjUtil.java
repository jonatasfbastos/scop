/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.support;

import br.com.ifba.scop.fornecedor.model.Fornecedor;
import br.com.ifba.scop.infraestructure.service.Singleton;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mvictor
 */
public final class CnpjUtil implements ICNPJ{
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
    
    private int mod(int valor, int divisor)
    {
        return valor%divisor;
    }
     
    private float divisao(float valor, float divisor)
    {
        return valor/divisor;
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
                campo.length() != 18;
    }

    

    @Override
     public String removerCaracteres(final String cnpj)
    {
        char[] vetor = cnpj.toCharArray();
        int[] array = new int[vetor.length];
        
        StringBuilder texto = new StringBuilder();
        
        for(int i = 0; i < cnpj.length(); i++)
        {
            
            if(vetor[i] == '.' || vetor[i] == '/' || vetor[i] == '-')
            {
                continue;
            }
            else{
                texto.append(vetor[i]);
            }
        }
        return texto.toString();
    }
     
     @Override
    public final boolean cnpjIsValid(String cnpj)
    {
        int dig13, dig14;
        int dig13Aux, dig14Aux;
        StringBuilder resultado = new StringBuilder();
        //verifica o primeiro digito.
        int tam = cnpj.length();
        int[] vetor = new int[tam];
        int[] vetorAux = new int[tam];
        int restoA = 0, restoB = 0;
        //System.out.println("\n==================================================");
        for(int i = 0; i < cnpj.length(); i++)
        {   
            vetor[i] = Integer.parseInt(String.valueOf(cnpj.charAt(i)));
            vetorAux[i] = vetor[i];
           //System.out.printf("%d",vetor[i]);
        }
        
        dig13 = vetor[12];
        dig14 = vetor[13];
        
        //System.out.printf("\n\nDigitor verificador 1 = %d \nDigito verificador 2 = %d\n", dig13, dig14);
        
                
        //System.out.println("\n==================================================");
        //System.out.println("Primeiro Digito verificador");
        //System.out.println("");
        //System.out.println("==================================================");
        
        for(int i = 0; i < pesoA.length; i++)
        {
           vetorAux[i] = vetor[i]*pesoA[i];
           //System.out.printf("[%d]",vetorAux[i]);
        }
        
        for(int i = 0; i < pesoA.length; i++)
        {
            restoA += vetorAux[i];
        }
        
        //System.out.printf("\n\nSoma total = %d\n", restoA);
        
        float divisaoA = divisao(restoA, 11);
        dig13Aux = mod(restoA, 11);
        
        if(dig13Aux == 10)
        {
            dig13Aux = 0;
        }
        
        //System.out.printf("\n Resultado da Divisão = %f ", divisaoA);
        //System.out.printf("\n Resto da Divisão = %d ", dig13Aux);
        
        //System.out.println("\n==================================================");
        //System.out.println("Segundo Digito verificador");
        //System.out.println("");
        //System.out.println("==================================================");
        
        for(int i = 0; i < pesoB.length; i++)
        {
           vetorAux[i] = vetor[i]*pesoB[i];
           //System.out.printf("[%d]",vetorAux[i]);
        }
        
        for(int i = 0; i < pesoB.length; i++)
        {
            restoB += vetorAux[i];
        }
        
        //System.out.printf("\n\nSoma total = %d\n", restoB);
        
        float divisaoB = divisao(restoB, 11);
        dig14Aux = mod(restoB, 11);
        
        if(dig14Aux == 10)
        {
            dig14Aux = 0;
        }
        
        //System.out.printf("\n Resultado da Divisão = %f ", divisaoB);
        //System.out.printf("\n Resto da Divisão = %d ", dig14Aux);
        
        if(dig13Aux == dig13 && dig14Aux == dig14)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
