package veiculo;

public abstract class  automovel {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public abstract void ligar();
}
