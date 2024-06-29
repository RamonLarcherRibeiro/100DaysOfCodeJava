package classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    // instância única do Logger
    private static Logger instance;
    private static final String LOG_FILE = "application.log";
    private BufferedWriter writer;

    // construtor privado para evitar instanciação externa
    private Logger() {
        try {
            writer = new BufferedWriter(new FileWriter(LOG_FILE, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // método público para fornecer acesso à instância única
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // método para registrar uma mensagem no log
    public void log(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para fechar o BufferedWriter ao terminar
    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}