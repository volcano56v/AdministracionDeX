package org.example;

import org.example.logica.ConexionFirebase;
import org.example.vistas.VistaPrincipal;

public class Main {
    public static void main(String[] args) {
        try {
            ConexionFirebase.conectar();
            VistaPrincipal.iniciar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
