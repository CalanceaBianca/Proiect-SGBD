/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectbd;

import databaseConnection.Database;

/**
 *
 * @author Calancea Bianca
 */
public class ProiectBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Database.getConnection();
      new HospitalFrame().setVisible(true);
     
      
    }
    
}
