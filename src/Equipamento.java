public class Equipamento {
    private int estado;

    public Equipamento(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    //metodos principais
    public void ligar(){
        this.estado = 1;
    }
    public void desligar(){
        this.estado = 0;
    }
    public void mostrarEstado(){
        if (estado == 1){
            System.out.println("Ligado!");
        }else{
            System.out.println("Desligado!");
        }
    }



}
