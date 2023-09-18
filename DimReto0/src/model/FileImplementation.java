/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class FileImplementation implements Model {

    public String getGreeting() {

        // Cargamos el ResourceBundle desde el archivo.properties "Archivo"
        ResourceBundle bundle = ResourceBundle.getBundle("model.ArchivoSaludos");

        String greeting = bundle.getString("greeting");

        return greeting;
    }

}
