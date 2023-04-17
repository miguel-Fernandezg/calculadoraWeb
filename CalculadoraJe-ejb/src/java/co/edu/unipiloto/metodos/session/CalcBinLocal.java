/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Local;

/**
 *
 * @author Miguel
 */
@Local
public interface CalcBinLocal {

    Integer suma(int val1, int val2);

    Integer resta(int val3, int val4);

    Integer multiplicacion(int val5, int val6);

    Integer Division(int val7, int val8);

    Integer modulo(int val1, int val2);
    
}
