package radio;

public class Radio {
    //atributos
    public String modulation;
    public int volume;
    public boolean ligado;


    //construtor 
    public Radio(){
        //inicilaiza o objeto radio desligado e com 50 de volume
        this.volume =  50;
        this.ligado = false;
    }

    //metodos
    public void ligar(){
        this.ligado = true;
        System.out.println("O radio foi ligado");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("o radio foi desligado");
    }

    public void aumentar_volume(int quantidade){
        if(this.ligado == true){
            if(this.volume == 100){
                System.out.println("Não é possível aumentar o volume , ja esta no máximo");
            }else{
                if(this.volume + quantidade > 100){
                    this.volume =  100;
                    System.out.println("O volume foi aumentado para "+ this.volume);
                }else{
                    this.volume += quantidade ;
                    System.out.println("O volume foi aumentado para "+ this.volume);
                }
            }  
        }else{
            System.out.println("Não é possivel aumentar o volume, o radio esta desligado.");
        }
    
  
    }

    public void abaixar_volume(int quantidade){
        if(this.ligado == true){
            if(this.volume == 0){
                System.out.println("Não é possivel abaixar o volume , ja esta no mínimo");
            }else{
                if(this.volume - quantidade < 0){
                    this.volume = 0;
                    System.out.println("o volume foi reduzido para " + this.volume);
                }else{      
                    this.volume -= quantidade;
                    System.out.println("o volume foi reduzido para " + this.volume);
                }
                
            }
        }else{
            System.out.println("Não é possivel reduzir o volume , o radio esta desligado");
        }
    }




} 