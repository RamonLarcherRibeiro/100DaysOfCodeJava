import classes.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getInstance();

        logger.log("Iniciando a aplicação...");
        
        // simulando diferentes partes da aplicação registrando logs
        logger.log("Executando tarefa A...");
        logger.log("Executando tarefa B...");

        logger.log("Aplicação encerrada.");

        // fechando o logger ao terminar
        logger.close();

    }
}
