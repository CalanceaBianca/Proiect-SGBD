/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstractclass.tables.Consultatii;
import java.util.Date;

/**
 *
 * @author Calancea Bianca
 */
public class ConsultatiiModel extends Consultatii{

    public ConsultatiiModel() {
    }
    
     public ConsultatiiModel(int id, int idMedic, int idPacient, Date dataConsultatie) {
        this.id = id;
        this.idMedic = idMedic;
        this.idPacient = idPacient;
        this.dataConsultatie = dataConsultatie;
    }
}
