/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0text;

import contoller.Controller;
import model.ModelFactory;
import model.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Reto0Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Controller().run(ModelFactory.getModel(), ViewFactory.getView());
    }

}
