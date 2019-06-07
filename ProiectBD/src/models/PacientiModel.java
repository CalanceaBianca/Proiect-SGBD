/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstractclass.tables.Pacienti;

/**
 *
 * @author Calancea Bianca
 */
public class PacientiModel extends Pacienti{
    
    
    public PacientiModel(int id, String nume, String prenume, int varsta, String sex,  int inaltime, int greutate, String telefon) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.sex = sex;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.telefon = telefon;
    }
}
