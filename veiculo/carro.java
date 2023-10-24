package veiculo ;

public class carro extends automovel {


    private void conferecombustivel() {
        System.out.println("conferindo combustivel");
    }

    public void ligar() {
       conferircambio();
        conferecombustivel();
        System.out.println("carro ligado");
    }

    private void conferircambio() {
        System.out.println("conferindo cambio em p");
    }

}
