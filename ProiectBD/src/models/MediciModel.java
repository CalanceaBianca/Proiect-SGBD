/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstractclass.tables.Medici;

/**
 *
 * @author Calancea Bianca
 */
public class MediciModel extends Medici{
    
    
    public MediciModel(int id, String specializare, String nume, String prenume, int varsta, String telefon) {
        this.id = id;
        this.specializare = specializare;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.telefon = telefon;
    }
}
