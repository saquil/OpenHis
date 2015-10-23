/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openhis.entites;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author x
 */
@Entity

@DiscriminatorValue( value = "admin" )
public class Admin extends Personnel implements Serializable{
    private static final long serialVersionUID = 1L;
   
    @Override
    public String toString() {
        return "admin"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
