package org.example.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

@WebListener
public class FirebaseInitializer implements ServletContextListener {

    // Logger estático de Log4j2
    private static final Logger logger = LogManager.getLogger(FirebaseInitializer.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try (InputStream serviceAccount = getClass().getClassLoader().getResourceAsStream("proyectoenpractica.json")) {

            if (serviceAccount == null) {
                throw new IOException("No se encontró el archivo 'proyectoenpractica.json' en resources");
            }

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
                logger.info("✅ Firebase inicializado correctamente.");
            } else {
                logger.warn("⚠️ Firebase ya estaba inicializado, se omitió la inicialización duplicada.");
            }

        } catch (IOException e) {
            logger.error("❌ Error al inicializar Firebase: {}", e.getMessage(), e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("🧹 Firebase cerrado correctamente.");
    }
}
