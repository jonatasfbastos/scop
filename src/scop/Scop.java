package scop;

import br.com.ifba.scop.infraestructure.view.TelaInicial;
import br.com.ifba.scop.login.view.TelaLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonatasfbastos
 */
public class Scop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TelaLogin().setVisible(true);
       // new TelaInicial().setVisible(true);
    }
    
}
