/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Stateless;

/**
 *
 * @author Miguel
 */
@Stateless
public class CalcBin implements CalcBinLocal {

    
    
    @Override
    public Integer suma(int val1, int val2) {
        return val1+val2;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer resta(int val3, int val4) {
        return  val3-val4;
    }

    @Override
    public Integer multiplicacion(int val5, int val6) {
        return val5*val6;
    }

    @Override
    public Integer Division(int val7, int val8) {
        return val7/val8;
    }

    @Override
    public Integer modulo(int val1, int val2) {
        return Math.floorMod(val1, val2);
    }

   
    
}
