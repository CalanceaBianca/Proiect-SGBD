/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstractclass.tables.Sectii;

/**
 *
 * @author Calancea Bianca
 */
public class SectiiModel extends Sectii {
    
    
    public SectiiModel(int id, String denumire, int etaj) {
        this.id = id;
        this.denumire = denumire;
        this.etaj = etaj;
    }

    public SectiiModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
