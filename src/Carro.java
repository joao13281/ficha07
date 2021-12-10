public class Carro {

    private double velocidade;
    private String marca;
    Condutor motorista;

    //metodo construtor

    public Carro() {}

    //metodos principais
    public void acelerar(){
        double a = this.velocidade + 15;
    }

    public void travar(){
        double t = this.velocidade - 15;
    }

    public double mostrarVelocidade(double velocidade){
        return this.velocidade;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "Condutor: " + motorista.getNome() + "Velocidade: " + velocidade;
    }

    //getters e setters
    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Condutor getMotorista() {
        return motorista;
    }

    public void setMotorista(Condutor motorista) {
        this.motorista = motorista;
    }
}
