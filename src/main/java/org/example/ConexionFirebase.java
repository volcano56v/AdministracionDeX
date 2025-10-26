package org.example;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;


public class ConexionFirebase {

    static Firestore db;

    public static void conectar() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("proyectoenpractica.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);
        db = FirestoreClient.getFirestore();
        System.out.println("Conectado con exito");

    }

    public static void main(String[] args) {
        try {
            conectar();
        }catch (Exception e){

        }
    }

}
