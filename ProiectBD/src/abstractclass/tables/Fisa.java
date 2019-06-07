/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tables;

/**
 *
 * @author Calancea Bianca
 */
public abstract class Fisa {
    
    protected int id; 
    protected int idPacient; 
    protected int idSimptom;

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public int getIdSimptom() {
        return idSimptom;
    }

    public void setIdSimptom(int idSimptom) {
        this.idSimptom = idSimptom;
    }
    
    
    
    
}
