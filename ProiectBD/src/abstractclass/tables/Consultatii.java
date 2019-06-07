/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tables;

import java.util.Date;

/**
 *
 * @author Calancea Bianca
 */
public abstract class Consultatii {
    
    protected int id;
    protected int idMedic;
    protected int idPacient;
    protected Date dataConsultatie;

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMedic() {
        return idMedic;
    }

    public void setIdMedic(int idMedic) {
        this.idMedic = idMedic;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public Date getDataConsultatie() {
        return dataConsultatie;
    }

    public void setDataConsultatie(Date dataConsultatie) {
        this.dataConsultatie = dataConsultatie;
    }
    
    
}
