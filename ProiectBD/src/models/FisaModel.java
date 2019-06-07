/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstractclass.tables.Fisa;

/**
 *
 * @author Calancea Bianca
 */
public class FisaModel extends Fisa {
    
    public FisaModel(int id, int idPacient, int idSimptom) {
        this.id = id;
        this.idPacient = idPacient;
        this.idSimptom = idSimptom;
    }
}
