/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstractclass.tables.Garzi;
import java.util.Date;

/**
 *
 * @author Calancea Bianca
 */
public class GarziModel extends Garzi{
    
    
    public GarziModel(int id, int idMedic, int idSectie, Date dataGarda) {
        this.id = id;
        this.idMedic = idMedic;
        this.idSectie = idSectie;
        this.dataGarda = dataGarda;
    }
}
