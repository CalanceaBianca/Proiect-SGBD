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
public abstract class Simptome {
    
    protected int id; 
    protected String descriere;

    public Simptome(int id, String descriere) {
        this.id = id;
        this.descriere = descriere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

   
    
   
}
