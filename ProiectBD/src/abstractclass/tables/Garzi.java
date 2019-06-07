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
public abstract class Garzi {
    
    protected int id; 
    protected int idMedic;
    protected int idSectie;
    protected Date dataGarda;


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

    public int getIdSectie() {
        return idSectie;
    }

    public void setIdSectie(int idSectie) {
        this.idSectie = idSectie;
    }

    public Date getDataGarda() {
        return dataGarda;
    }

    public void setDataGarda(Date dataGarda) {
        this.dataGarda = dataGarda;
    }
    
    
    
}
