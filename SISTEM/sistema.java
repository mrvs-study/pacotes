package SISTEM;

public class sistema {
    public static void main(String[] args) {
        pessoa Pessoa =new pessoa("marcos","12213432");
        Pessoa.setEndereco("rua dos pão doce");
        System.out.println("seu nome é "+ Pessoa.getnome()+  " seu cpf é "+ Pessoa.getcpf()+" voce mora na rua "+ Pessoa.getEndereco() );
    }
}
