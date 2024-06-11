package carteira;

public class Carteira {
    private String Propietario;
    private int Saldo;

    public Carteira(){
        this.Saldo = 0;
    }

    //setter propietario
    public void setPropietario(String propietario){
        this.Propietario = propietario;
    }

    //setter Saldo
    public void setSaldo(int saldo){
        this.Saldo = saldo;
    }

    //metodo para depositar valor
    public void depositar(int valor){
        if(valor > 0 ){
            this.Saldo += valor;
        }
    }

    //getter propietario 
    public String getPropietario(){
        return this.Propietario;
    }

    //getter saldo
    public int getSaldo(){
        return this.Saldo;
    }

}
