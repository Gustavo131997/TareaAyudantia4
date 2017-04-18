/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;

import java.awt.AWTException;

/**
 *
 * @author Gustavo Huerta
 */
public class Teatro {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     */
    public static void main(String[] args) throws AWTException {
         Festival_de_Teatro festival = new Festival_de_Teatro();
         festival.empezoFestival();
    }
    
}
