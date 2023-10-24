package SISTEM;

public class pessoa {

       private String nome;
       private String endereco;
       private String cpf;
public pessoa (String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
}

       //criamos uma pessoa no sistema
       public String getnome(){
           return nome;
        }
        //criamos o cpf da pessoa no sistema
        public String getcpf(){
            return cpf;
        }
        public String getEndereco(){
            return endereco;
        }
        public void setEndereco (String endereco){
           this.endereco = endereco;
        }
    }

