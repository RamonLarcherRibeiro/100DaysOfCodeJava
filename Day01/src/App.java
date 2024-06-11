import radio.Radio;

public class App {
    public static void main(String[] args) throws Exception {
        Radio radio1 = new Radio();

        //vamos tentar aumentar o volume mas nao sera possivel porque o radio esta desligado        
        radio1.aumentar_volume(10);
        
        //vamos ligar o radio 
        radio1.ligar();

        //aumentar o volume para 100
        radio1.aumentar_volume(100);

        //vamos tentar aumentar o volume mas nao sera possível porque ja esta no máximo
        radio1.aumentar_volume(20);

        //vamos abaixar o volume para 0
        radio1.abaixar_volume(100);

        //vamos tentar abaixar o volume mas nao sera possível porque ja esta no mínimo
        radio1.abaixar_volume(10);

        //vamos desligar o radio 
        radio1.desligar();
    }
}
