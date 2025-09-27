/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareahashmap;

/**
 *
 * @author MAU PALACIOS
 */
import java.util.HashMap;
public class TareaHashMap {

    public static void main(String[] args) {
       // HashMap
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("Nombre", "Mario");
        informacionPersonal.put("Edad", 37);
        informacionPersonal.put("Ciudad", "Tulcan");

        // Acceso y modificación 
        informacionPersonal.put("Ciudad", "Quito"); // Cambio de ciudad
        informacionPersonal.put("Profesion", "Chofer"); // Agregamos la profesión

        // Verificar "telefono"
        if (!informacionPersonal.containsKey("Telefono")) {
            informacionPersonal.putIfAbsent("Telefono", "0999543321");
        }

        // Eliminar "edad"
        informacionPersonal.remove("edad");

        // Mostrar resultado
        System.out.println("Contenido del HashMap:");
        System.out.println(informacionPersonal);
    }
}
